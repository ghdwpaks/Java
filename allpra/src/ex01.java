public class ex01 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        String s = new String("100");

        System.out.println(i.equals(Integer.parseInt(s)));

        System.out.println(s.equals(String.valueOf(i)));
        System.out.println(s.equals(i.toString()));



    }
}
