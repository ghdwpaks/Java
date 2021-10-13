package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p61{
    public static void main(String[] args) {

        InputStreamReader ir = new InputStreamReader(System.in);
        System.out.println("ir : "+ir);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("br : "+br);
        try {
            String a = br.readLine();
            System.out.println(a);
        }catch (IOException e) {}


    }
}
