public class replace {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Java Programming");
        System.out.println("s1 :"+s1);

        StringBuffer s2 = null;
        s2 = s1.replace(0,4,"python");
        System.out.println("s2 :"+s2);


    }
}
