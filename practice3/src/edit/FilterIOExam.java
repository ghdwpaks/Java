package edit;
import java.io.*;

public class FilterIOExam {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.dat");
        DataOutputStream fOut = new DataOutputStream(fos);
        fOut.writeInt(740);
        fOut.writeDouble(3.14159265358979);

        fOut.close();
        fos.close();

        FileInputStream fis = new FileInputStream("data.dat");
        DataInputStream fIn = new DataInputStream(fis);
        int data = fIn.readInt();
        double p = fIn.readDouble();

        fIn.close();
        fis.close();

        System.out.println(data);
        System.out.println(p);
    }
}
