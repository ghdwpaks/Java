public class valueof {
    public static void main(String[] args) {
        String si = "123456";
        String sd = "123.56";
        System.out.println("Integer.valueOf(si) :"+Integer.valueOf(si));
        System.out.println("Double.valueOf(sd) :"+Double.valueOf(sd));
        System.out.println("Integer.valueOf(si)+Double.valueOf(sd) : "+(Integer.valueOf(si)+Double.valueOf(sd)));
    }
}
