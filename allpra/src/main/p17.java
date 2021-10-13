package main;

public class p17 {
    public static void main(String[] args) {
        String s1 = "0123456789";
        //           1234567890
        String s2;
        for(int i = 0;i<s1.length();i++) {
            System.out.println("s1["+i+"] : "+s1.charAt(i));
        }
        s2 = s1.substring(7); //배열 7인덱스 포함부터
        System.out.println("s1.substring(7) : "+s1.substring(7));
        s2 = s1.substring(2,5); //배열 2인덱스 포함 5미만까지
        System.out.println("s1.substring(2,5) :"+s1.substring(2,5));



    }
}
