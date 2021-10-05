package main;

import java.io.IOException;
import java.io.InputStream;

public class p51_InputExam {
    public static void streamTest(InputStream is) {
        System.out.println("InputStream is :"+is);
        try {
            while(true) {
                int i = is.read();
                if (i==-1)break;
                char c = (char) i;
                System.out.println(c);
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        streamTest(System.in);
    }
}
