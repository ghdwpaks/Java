package src_init;

import java.io.*;

public class BufferedInputExam {
    public static void main(String[] args) {
        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream("large_in.txt"))){
            while(true){
                int i = is.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println();
    }
}
