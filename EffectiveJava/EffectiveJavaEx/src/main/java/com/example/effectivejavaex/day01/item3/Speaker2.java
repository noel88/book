package com.example.effectivejavaex.day01.item3;

public class Speaker2 {

    //private construct
    private static final Speaker2 INSTANCE = new Speaker2();
    private Speaker2() { }

    // getInstance를 통해 instance를 가져올 수 있다.
    public static Speaker2 getInstance() {
        return INSTANCE;
    }


}
