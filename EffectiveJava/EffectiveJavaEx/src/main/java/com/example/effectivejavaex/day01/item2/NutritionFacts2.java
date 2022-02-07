package com.example.effectivejavaex.day01.item2;


import lombok.Builder;
import lombok.Data;

//Lombok을 통한 Builder 사용.

@Data
@Builder(builderMethodName = "hiddenBuilder")
public class NutritionFacts2 {
    private final int servingSize;
    private final int servings;
    @lombok.Builder.Default private final int calories = 0; //optional
    @lombok.Builder.Default private final int fat = 0; //optional
    @lombok.Builder.Default private final int solium = 0; //optional
    @lombok.Builder.Default private final int carbohydrate = 0; //optional

    public static NutritionFacts2Builder builder (int servingSize, int servings) {
        return hiddenBuilder()
                .servingSize(servingSize)
                .servings(servings);
    }
}
