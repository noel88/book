package com.example.effectivejavaex.day01.item5;

//Item 5. Resource를 직접 명시하지 말고, Dependency Injection을 사용하라.

// 생각해봐야 할 것
// Config class를 생각없이 사용하고 있지는 않았는지.
// Singleton을 이해하고 있는지
// DI를 잘 이해하고 있는지

import lombok.Value;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;


// @Configuration 명세
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Configuration {
    // ..
}


// Config class 내부에 직접 정의하여 사용하지 않는다.

// 여러 자원을 활용해야 할 경우 적합하지 않다.
// 이 상황에선 환경 별로 다른 값이 들어가야 할 때 적절하지 않다.
@org.springframework.context.annotation.Configuration
class ZeroBaseConfig {

    private static final String address = "서울시 강남구";
    private static final zipCode;
    public ZeroBaseConfig() {
        this.address = "서울시 강남구";
    }
}

//Property Injection
//application.yml 에 등록된 정보를 주입한다.
@org.springframework.context.annotation.Configuration
class config {
    @Value("${zerobase.address}")
    private String address;
}
