package main;

import java.io.*;

public class p54 {
    public static void main(String[] args) {
        BufferedInputStream bi = new BufferedInputStream(System.in);
        BufferedOutputStream bo = new BufferedOutputStream(System.out);
        int a;
        try {
            do{
                a = bi.read();
                bo.write(a);
            }
            while(a!=-1);
            bo.flush();

        } catch (IOException e) {
            System.out.println("에러 발생 e : "+e);
        }


    }
}
