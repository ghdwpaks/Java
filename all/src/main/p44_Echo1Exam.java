package main;

import java.io.IOException;

public class p44_Echo1Exam {
    public static void main(String[] args) {
        int bt;
        while (true) {

            try {
                bt = System.in.read();
                System.out.println((char)bt);

            } catch(IOException e) {
                System.out.println(e);
            }
        }
    }
}
