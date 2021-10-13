

import java.io.*;

public class p65{
    public static void main(String[] args) {
        try {

            InputStreamReader in = new InputStreamReader(System.in);
            int s1 = in.read();
            System.out.println("s1 : "+s1);
            BufferedReader i = new BufferedReader(in);
            System.out.println("i.read() : "+i.read());
            String s = " ";
            try {
                s = i.readLine();
            } catch (Exception e) {
                System.out.println("Error : "+e.toString());
            }
            System.out.println("s : "+s);
        } catch (IOException e) {}
    }
}
