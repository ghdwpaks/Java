public class warp {
    public static void main(String[] args) {
        Integer wrapi = new Integer(100);
        Double wrapd = new Double(55.7);

        int i = 100;
        double d = 55.7;
        double dl;
        dl = d+i;
        System.out.println("1. "+i+d);
        System.out.println("2. "+Integer.toString(i) + Double.toString(d));
        System.out.println("3. "+wrapi.toString() + wrapd.toString());

        Integer w1 = new Integer(200);
        System.out.println("w1 :"+w1);

        Integer w2 = new Integer(300);
        System.out.println("w2 :"+w2);

        w1 = new Integer(100);
        System.out.println("w2 :"+w2);
    }
}
