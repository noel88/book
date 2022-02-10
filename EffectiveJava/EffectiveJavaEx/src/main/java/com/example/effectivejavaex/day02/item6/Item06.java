package com.example.effectivejavaex.day02.item6;


//Item 06. 불필요한 객체 생성 금지.
//Boxing Type 대신 Primitive Type 을 권장한다.
//Note:
// - 무심결에 Instance를 과도하게 생성하지는 않았는지 확인해야 한다.
// - Primitive Type 과 Boxing Type을 의도하고 사용하였는지 확인해야 한다.

public class Item06 {

    public static long sum () {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i ++) {
            sum += i;
        }
        return sum;
    }


    // 아래의 메서드가 위의 메서드에 비해 약 10배정도 빠른 실험 결과를 나타내었다.
    // Boxing Type을 남용하지 않도록 주의하는 것 뿐만 아니라, 의도치 않은 Auto Boxing 을 조심하라.
    public static long sum2 () {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }


    // 그렇다고 해서 항상 primitive type이 옳은 것은 아니다.
    // 대표적인 Null case

    // 물건의 가격인 경우.
    // int price;
    // Integer price;
    // price가 0인 것과 null인 것의 의미는 다르다.
    // 0의 의미는 증정품 등의 사유로 0원일 수 있고, Null인 경우 가격이 아직 정해지지 않았다 생각 될 수 있다.

}
