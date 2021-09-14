import java.util.Locale;

public class tostring {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("java programming");
        String str = null;
        str = sb1.toString();
        System.out.println("str.toUpperCase() = "+str.toUpperCase());
        System.out.println("str.getClass().getName() = "+str.getClass().getName());
        System.out.println("sb1.getClass().getName() = "+sb1.getClass().getName());
    }



}
