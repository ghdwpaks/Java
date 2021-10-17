package main;

import java.io.IOException;

public class p52_ReadFromSysExam {
    public static void main(String[] args) {
        while (true) {


            byte[] b = new byte[1024];
            System.out.println("1111");
            int len = 0;
            try {
                len = System.in.read(b);
                System.out.println("2222");
                System.out.println("len : "+len);

                System.out.println("b : " + b);
                for (int i = 0 ; i < len ; i++)  {
                    System.out.println("b["+i+"] : "+b[i]);
                }

                System.out.write(b,0,len);
            } catch(IOException e) {
                System.out.println("입력 실패");
            }
        }

    }
}
