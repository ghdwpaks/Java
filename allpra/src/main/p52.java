package main;

import java.io.IOException;

public class p52 {
    public static void main(String[] args) {

        while (true) {


            byte[] b = new byte[1024];
            int len = 0;
            try {
                len = System.in.read(b);
                System.out.println("len : "+len);
                System.out.println("b : " + b);
                System.out.write(b,0,len);
            } catch(IOException e) {
                System.out.println("입력 실패");
            }
        }

    }
}
