package com.example.effectivejavaex.day02.item9;

// Item 09. try-finally 대신 try-with-resources를 사용하라.
// Finally가 필요한 상황이라면 try-with-resource를 사용하는 것을 권장함.

import java.io.*;

public class Item09 {

    public static void main(String[] args) {

        try {
            System.out.println("1");
            throw new Exception();
        } finally { // exception 유무와 관계없이 실행.
            System.out.println("3");
        }
    }


    // Exception 시 Stack trace에 어려움이 있음.
    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(src);
            try {
                byte [] buf = new byte[100];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

    // Resource가 종료되었을 경우 Exception 발생.
    try (Resource r1 = new Resource();
        Resource r2 = new Resource();) {
        throw new Exception("asd");
    }

}


//Try-with-resource
class Resource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw  new Exception("inside Resource exception");
    }
}