

import java.io.*;

public class ex14 {
    public static void main(String[] args) {
        System.out.println("1111");
        BufferedInputStream bis = new BufferedInputStream(System.in);
        try {
            while ( true) {

                int c = bis.read();
                if (c == 10) {
                    System.out.println("break");
                    break;
                }

                System.out.println("i : "+(char)c);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("2222");
        InputStreamReader isr = new InputStreamReader(System.in);

        try {
            while (true) {
                int i = isr.read();
                if (i == 10) break;
                System.out.println("i : "+i);
                System.out.println("(char)i : "+(char)i);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("3333");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    }
}
