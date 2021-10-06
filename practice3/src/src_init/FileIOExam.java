package src_init;


import java.io.*;

public class FileIOExam {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.dat");
        fos.write(7);
        fos.close();

        FileInputStream fis = new FileInputStream("data.dat");
        int data = fis.read();

        System.out.println(data);
    }
}
