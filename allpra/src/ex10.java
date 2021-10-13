import java.io.BufferedReader;
import java.io.IOException;

public class ex10 {
    public static void main(String[] args) {
        try {
            int i = System.in.read();
            System.out.println(i);
            System.out.println(i);

        }catch (IOException e) {
            System.out.println(e);
        }

    }
}
