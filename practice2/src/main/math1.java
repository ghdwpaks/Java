package main;

public class math1 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.sqrt(9.0));
        System.out.println(Math.exp(2));
        System.out.println(Math.round(3.14));

        System.out.println("이번주 행운의 번호는 다음과 같습니다.");
        for (int i = 0 ; i < 5 ; i++) {
            System.out.print((int)((Math.random()*100)%45)+" ");
        }
    }
}
