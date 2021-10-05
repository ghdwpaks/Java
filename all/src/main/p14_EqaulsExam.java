package main;

public class p14_EqaulsExam {
    public static void main(String[] args) {
        String str1 = "Hansei";
        String str2 = "hansei";

        String str3 = new String("highschool");
        String str4 = new String("Highschool");

        if(str1.equals(str2))   System.out.println("같다");
        else                    System.out.println("다르다");

        if(str3.equals(str4))   System.out.println("같다");
        else                    System.out.println("다르다");


    }
}
