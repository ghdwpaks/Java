package main;

public class p21_ReplaceExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Java Programming");
        StringBuffer sb2 = null;

        sb2 = sb1.replace(0,4,"Java");
        System.out.println("sb2 = "+sb2);


    }
}
