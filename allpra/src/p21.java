public class p21 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Java Programming");
        StringBuffer sb2 = null;

        sb2 = sb1.replace(0,4,"ghdwpaks");
        System.out.println("sb2 = "+sb2);
    }
}
