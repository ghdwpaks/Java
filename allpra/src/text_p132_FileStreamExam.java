import java.io.*;

public class text_p132_FileStreamExam {
    public static void main(String[] args) throws FileNotFoundException {
        byte[] b = new byte[1024];
        FileInputStream fis = new FileInputStream("in.txt");
        FileOutputStream fos = new FileOutputStream("out.txt");
        try {
            fis.read(b);
            fis.close();

            fos.write(b);
            System.out.write(b);
            fos.close();

        } catch (Exception e) {}



    }

}

