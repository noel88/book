package com.example.effectivejavaex.day01.item2;


//Item 2. 많은 parameter가 있는 constructor는 Builder를 고려하라.

//장점:
// - 상속받은 class의 Builder가 정의한 build 메서드가 상위 메서드의 타입을 return 하는 것이 아닌 자신의 타입을 return 한다.
//단점:
// - Builder를 항상 만들어야 하기 때문에 생성 비용이 무조건 생긴다.
// - 점층적 생성자 패턴 (Argument를 여러개 가진 Constructor) 보다 장황하여 적은 갯수의 parameter일 경우 오히려 좋지 않을 수 있다.


public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories; //optional
    private final int fat; //optional
    private final int solium; //optional
    private final int carbohydrate; //optional


    //Pattern 1: 여러개의  Constructor를 둔다.
    //Pattern 2: Java beans Pattern (Setter)




    //보통 Lombok을 통해 Builder를 구현할수도 있지만, Builder를 직접 짜보는 것도 중요하다.
    public static class Builder {
        private final int servingSize;
        private final int servings;
        private int calories = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder colories(int val) {
            calories = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }
}
