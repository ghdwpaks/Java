package main;

import java.io.*;

public class p54_2 {
    public static void main(String[] args) {
        BufferedInputStream bi = new BufferedInputStream(System.in);
        BufferedOutputStream bo = new BufferedOutputStream(System.out);

        int a;
        try {
            while((a=bi.read())!=103) {

                bo.write(a);
            }
            bo.flush();
            //bo.close(); //둘 중 뭘 써도 상관 없지만 close가 예법상 좋음


        } catch (IOException e) {}


    }
}
