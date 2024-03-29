package edit;

import java.io.*;

public class InputReaderExam {
    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("in.txt");
            Reader reader = new InputStreamReader(fis);
            while(true){
                int i = reader.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println();
    }
}
