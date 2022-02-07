package com.example.effectivejavaex.day01.item1;

public class LaptopDto {
    private String modelName;
    private String companyName;


    //Note: Entity to Dto Class
    public static LaptopDto from(Laptop laptop) {
        LaptopDto laptopDto = new LaptopDto();
        laptopDto.companyName = laptop.getCompany();
        laptopDto.modelName = laptop.getModelName();
        return laptopDto;
    }
}
