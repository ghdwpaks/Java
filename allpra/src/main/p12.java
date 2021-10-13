package main;

public class p12 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("hello");

        System.out.println("s1 s2 주소 : "+(s1==s2));
        System.out.println("s1 s2 내용 : "+s1.equals(s2));
        System.out.println("s1 s3 주소 : "+(s1==s3));
        System.out.println("s1 s3 내용 : "+s1.equals(s3));



    }
}
