package com.example.effectivejavaex.day02.item9;


import sun.misc.Cleaner;


// Cleaner with Try-with-resource
// Clean 이 실패해서 GC의 기회가 없어져도 AutoCloseable을 통해 이를 보완할 수 있다.
public class CleanObject implements AutoCloseable{

    private static final Cleaner cleaner = Cleaner.create();
    private static class CleanData implements Runnable {
        @Override
        public void run() {
            // clean
        }
    }

    private final CleanData cleanData;
    private final Cleaner.Cleanable cleanable;

    public CleanObject() {
        this.cleanData = new CleanData();
        this.cleanable = cleaner.register(this, cleanData);
    }


    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
