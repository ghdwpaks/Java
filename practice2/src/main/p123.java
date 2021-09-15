package main;

import java.util.Scanner;

public class p123 {
    public static void main(String[] args) {
        int n = ((int)Math.random()*100);
        Scanner sc = new Scanner(System.in);
        for (int i  = 0 ; i < 5 ; i ++) {
            int userint = sc.nextInt();
            if (userint < n)
                System.out.println("너무 작습니다.");
            else
                System.out.println("너무 큽니다.");
            System.out.println(((int)i+1)+"번째 시도 완료");
        }

    }
}
