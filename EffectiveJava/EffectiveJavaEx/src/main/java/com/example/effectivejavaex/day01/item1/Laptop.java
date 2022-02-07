package com.example.effectivejavaex.day01.item1;

// Item 1. Constructor 대신 Static Factory Method를 고려하라.

public class Laptop {
    private Long id;
    private String modelName;
    private String company;

    public Long getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public String getCompany() {
        return company;
    }

    //Note: 이름을 가진 Static Factory Method.

    //장점:
    // - 이름을 가질 수 있다.
    // - 심플하고 명확하게 사용할 수 있다.
    // - 인스턴트를 매번 생성할 필요는 없다.

    //단점:
    // - Static Factory method만 제공하면 Constructor 가 없을 수 있어 상속받은 class를 만들 수 없다.
    // - 프로그래머에게 인지가 잘 되지 않을 수 있다.
    public static Laptop ofModelNameAndCompany(String modelName, String company) {
        Laptop laptop = new Laptop();

        laptop.company = company;
        laptop.modelName = modelName;

        return laptop;
    }

    //Note: Form to Entity Class
    public static Laptop from(LaptopForm laptopForm) {
        Laptop laptop = new Laptop();

        laptop.company = laptopForm.getCorp();
        laptop.modelName = laptopForm.getName();

        return laptop;
    }
}
