package com.example.effectivejavaex.day01.item3;


// 실무에서 쓰기에는 좀 부자연스럽다.
// 개발자들에게 혼란을 야기할 수 있다.
// 만약 사용할 경우에는 Enum 방식은 팀원들과 함께 고려해보아야 한다.

public enum Speaker4 {
    INSTANCE;
    private String message;

    public Speaker4 getInstance() {
        return INSTANCE;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

class main {
    public static void main(String[] args) {
        Speaker4 speaker1 = Speaker4.INSTANCE.getInstance();
        speaker1.setMessage("안내 방송 중입니다.");
        Speaker4 speaker2 = Speaker4.INSTANCE.getInstance();
        System.out.println(speaker1.getMessage()); // 안내 방송 중입니다.
        System.out.println(speaker2.getMessage()); // 안내 방송 중입니다.
    }
}
