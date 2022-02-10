package com.example.effectivejavaex.day02.item6;



// 주의해야 할 내장 Method

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUtil {

    // 호출 시 계속해서 내부적으로 Pattern 인스턴스를 만들게 된다.

    public boolean isEmailValid(String s) {
        return s.matches("[a-zA-Z0-9.-]\\\\.[a-zA-Z]{2,6}$");
    }

    // String.java
    public boolean matches (String expr) {
        return Pattern.matches(expr, this);
    }

    // Pattern.java
    // Pattern instance가 매번 생성.
    public static boolean matches (String regex, CharSequence input) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
    }

    // Pattern instance 가 한번만 생성될 수 있도록 위의 코드를 아래와 같이 변경한다.

    private static final Pattern EMAIL = Pattern.compile("[a-zA-Z0-9.-]\\\\.[a-zA-Z]{2,6}$");
    public static boolean isEmailValid2(String s) {
        return EMAIL.matcher(s).matches();
    }
}
