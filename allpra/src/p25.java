public class p25 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 10;
        int i3 = 10;

        System.out.println("i1 == i2 : "+(i1==i2));
        System.out.println("i1 == i3 : "+(i1==i3));
        System.out.println("i2 == i3 : "+(i2==i3));
        //System.out.println("i1.equals(i2) : "+(i1.equals(i2)));
        //System.out.println("i1.equals(i3) : "+(i1.equals(i3)));
        //System.out.println("i1.equals(i3) : "+(i2.equals(i3)));


        Integer in1 = new Integer(100);
        Integer in2 = new Integer(100);
        Integer in3 = new Integer(100);


        System.out.println("in1 == in2 : "+(in1==in2));
        System.out.println("in1 == in3 : "+(in1==in3));
        System.out.println("in2 == in3 : "+(in2==in3));

        System.out.println("in1.equals(in2) : "+(in1.equals(in2)));
        System.out.println("in1.equals(in3) : "+(in1.equals(in3)));
        System.out.println("in2.equals(in3) : "+(in2.equals(in3)));



    }
}
