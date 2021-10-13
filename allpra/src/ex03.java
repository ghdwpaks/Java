import java.io.*;

public class ex03 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ex03t.txt");

            InputStream in = new FileInputStream("ex03t.txt");
            int date = in.read();

            int out_data = 123;
            OutputStream out = new FileOutputStream("ex03t2.txt");
            out.write(out_data);

        } catch (IOException e ) {
            System.out.println(e);
        }



    }
}
