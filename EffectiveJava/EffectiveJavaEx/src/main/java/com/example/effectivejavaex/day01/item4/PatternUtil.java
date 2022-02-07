package com.example.effectivejavaex.day01.item4;

//Item 4. Instance화를 막으려먼 private constructor를 사용하라.
// Human error를 방지하기 위해 private constructor를 권장
// 일반적으로 Util class 처럼 관용적으로 instance화를 하지 않을 거라고 모두가 알고 있는 경우는 생략하기도 한다.

//잘못된 예제
public class PatternUtil {
    private static final String PATTERN = "\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b";

    // private constructor를 추가하여 instance화를 막아야 한다.
    // private PatternUtil() { }

    public static boolean inEmailValid(String email) {
        return email.matches(PATTERN);
    }

    // 추후 추가된 메서드
    public String getPattern() {
        return PATTERN;
    }
}


class main1  {
    public static void main(String[] args) {

        // 이런식으로 불필요한 Instance를 만들 수 있다.
        PatternUtil patternUtil = new PatternUtil();
        patternUtil.getPattern();


    }
}