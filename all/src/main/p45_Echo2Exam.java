package main;

import java.io.IOException;

public class p45_Echo2Exam {
    public static void main(String[] args) {
        int bt;
        try {
            while((bt = System.in.read())!=-1) {
                System.out.println((char)bt);
            }
        } catch(IOException e) {
            System.out.println(e);
        }

    }
}
