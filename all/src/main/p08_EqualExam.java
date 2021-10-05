package main;

public class p08_EqualExam {
    public static void main(String[] args) {
        String str1 = "hansei";
        String str2 = "hansei";
        String str3 = new String("heigschool");
        String str4 = new String("heigschool");


        if (str1 == str2)   System.out.println("주소 같다");
        else                System.out.println("주소 다르다");

        if (str3 == str4)   System.out.println("주소 같다");
        else                System.out.println("주소 다르다");

        if (str1.equals(str2))  System.out.println("내용 같다");
        else                    System.out.println("내용 다르다");

        if (str3.equals(str4))  System.out.println("내용 같다");
        else                    System.out.println("내용 다르다");



    }
}
