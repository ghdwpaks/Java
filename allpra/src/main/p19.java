package main;

public class p19 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(" Java Programming ");
        StringBuffer sb2 = new StringBuffer(" Project ");

        System.out.println("1 sb1 :"+sb1);
        System.out.println("1 sb2 :"+sb2);
        System.out.println();

        StringBuffer str1 = null;
        StringBuffer str2 = null;

        str1 = sb1.append(" Project ");
        System.out.println("2 str1 : "+str1);
        System.out.println("2 sb1 :"+sb1);
        System.out.println("2 sb2 :"+sb2);
        System.out.println();


        str2 = sb2.append(sb2);
        System.out.println("3 str1 : "+str1);
        System.out.println("3 str2 : "+str2);
        System.out.println("3 sb1 :"+sb1);
        System.out.println("3 sb2 :"+sb2);
    }
}
