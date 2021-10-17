package main;

import java.io.*;

public class p59 {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        //Reader reader = new BufferedInputStream(System.in); //이건 안됨
        try {
            while (true) {

                int i = reader.read();
                char c = (char)i;
                System.out.println(c);
            }

        } catch(IOException e) {
            System.err.println(e);
        }
        System.out.println();



    }
}
