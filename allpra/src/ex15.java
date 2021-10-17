import java.io.*;
import java.util.*;

public class ex15 {
    public static void main(String[] args) {
        try {
            BufferedReader fis = new BufferedReader(new FileReader("writed.txt"));
            String s = fis.readLine();
            StringTokenizer st = new StringTokenizer(s,"/");
            double d = 0;
            for (int i = 0;i < st.countTokens();i++) {
                //d = Double.valueOf(st.nextToken()).doubleValue();
                d = Double.valueOf(st.nextToken());
            }
            System.out.println("d : "+d);
            System.out.println("탈출함");

        } catch (Exception e) {
            System.out.println("오류발생 : "+e);
        }
    }
}
