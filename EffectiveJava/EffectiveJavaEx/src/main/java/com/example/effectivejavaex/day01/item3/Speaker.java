package com.example.effectivejavaex.day01.item3;


// Item3. private constructor나 enum Type으로 Singleton임을 보증하라.


public class Speaker {

    // 대표적인 Singleton Pattern
    // Singleton 패턴은 인스턴스를 불필요하게 생성하지 않고 오직 JVM내에서 한 개의 인스턴스만 생성하여 재사용을 위해 사용되는 디자인패턴이다

    // INSTANCE가 초기화 되고 나면 고정이 된다.

    public static final Speaker INSTANCE = new Speaker();

    //private construct
    private Speaker() { }


}
