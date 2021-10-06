public class p08 {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 = "10";
        System.out.println("s1 s2 주소 : "+(s1==s2));
        System.out.println("s1 s2 내용 : "+(s1.equals(s2)));

        String s3 = new String("10");
        String s4 = new String("10");

        System.out.println("s3 s4 주소 : "+(s3==s4));
        System.out.println("s3 s4 내용 : "+(s3.equals(s4)));


    }
}
