package main;

public class p12_StringEqualExam {
    public static void main(String[] args) {
        String R1 = new String("JAVA");
        String R2 = new String("JAVA");
        String R3 = new String("JAVA");

        System.out.println("R1 == R2 :\t\t"+(R1==R2));
        System.out.println("R1.equals(R2) :\t"+(R1.equals(R2)));
        System.out.println("R1 == R3 :\t\t"+(R1==R3));
        System.out.println("R1.equals(R3) :\t"+(R1.equals(R3)));



    }
}
