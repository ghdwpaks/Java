package main;

import java.io.*;

public class p51 {
    public static void streamTest(InputStream is) {
        System.out.println("InputStream is :"+is);

        try {
            while(true) {
                int i = is.read();
                System.out.println("i = "+i);
                System.out.println(i == -1);

                if (i == -1 ) break;

                char c = (char) i;
                System.out.println("c = "+c);
            }
        } catch (IOException e){
            System.out.println("오류가 발생했습니다.");
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        streamTest(System.in);
    }
}
