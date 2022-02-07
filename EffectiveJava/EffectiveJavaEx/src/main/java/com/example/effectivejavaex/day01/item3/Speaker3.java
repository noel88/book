package com.example.effectivejavaex.day01.item3;

public class Speaker3 {

    //private construct
    private static Speaker3 instance;
    private Speaker3() { }

    // 상황에 따라 synchronized나, lazy하게 instance를 생성하는 방법.
    public static synchronized Speaker3 getInstance() {

        //기타 다른 사항 체크
        if (instance == null) {
            instance = new Speaker3();
        }

        return instance;
    }


}
