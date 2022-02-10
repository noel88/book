package com.example.effectivejavaex.day02.item8;


// Item 8. finalizer, cleaner를 피하라.
// finalizer 사용을 지양한다.
// 특수한 상황이 아니라면 사용하지 않는 것을 추천.
// 안전망 역할로 아주 제한적으로 사용 가능함.

public class Item08 {


    // 내가 제어할 수 없는 메서드.
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Call finalize");
//    }


    // System.gc()의 내부.
    public static void gc() {
        RUNTIME.gc();
    }

    private boolean closed;
    public void close() throws Exception {
        //객체를 닫는다.
    }

    // 회수해야 할 상황에 회수하지 않을때 안전장치로 이중 체크.
    @Override
    protected void finalize() throws Throwable {
        if (!this.closed) {
            close();
        }
    }

}



