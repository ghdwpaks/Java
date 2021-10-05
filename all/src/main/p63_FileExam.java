package main;

import sun.reflect.annotation.ExceptionProxy;

import java.io.FileReader;
import java.io.FileWriter;

public class p63_FileExam {
    public static void main(String[] args) {
        char buffer[] = new char[100];
        try {
            FileReader fr = new FileReader("TextFile/datar.txt");
            FileWriter fw = new FileWriter("TextFile/dataw.txt");
            fr.read(buffer,0,100);
            String str = new String(buffer);
            System.out.println(str);
            fw.write(buffer);
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
