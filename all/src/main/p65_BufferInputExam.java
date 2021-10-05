package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p65_BufferInputExam {
    public static void main(String[] args) {
        BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
        String s = " ";
        try {
            s = i.readLine();
        } catch (Exception e) {
            System.out.println("Error : "+e.toString());
        }
        System.out.println(s);
    }
}
