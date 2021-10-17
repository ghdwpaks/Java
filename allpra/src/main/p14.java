package main;

public class p14 {
    public static void main(String[] args) {
        int i1 = 100;
        Integer i2 = new Integer(100);
        float f = 100.0f;
        System.out.println(i2.equals(i1));
        System.out.println(i2.equals(f));

    }
}
