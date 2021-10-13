package main;

public class p09 {
    public static void main(String[] args) {
        String s = "hello world";
        for(int i = 0;i< s.length();i++) {
            System.out.println("s["+i+"] : "+s.charAt(i));
        }
        System.out.println(s.length());
    }
}
