package com.example.effectivejavaex.day01.item5;


// Constructor Injection의 경우, Test, Flexibility를 높일 수 있다.
// 고정해 놓은 값에 비해 훨씬 유연해진 class
// Test code 작성 시 injection 하기도 편리하다.

public class PhonePatternChecker {
    private final String pattern;

    public PhonePatternChecker(String pattern) {
        this.pattern = pattern;
    }

    public boolean isValid(String phone) {
        return phone.matches(pattern);
    }
}
