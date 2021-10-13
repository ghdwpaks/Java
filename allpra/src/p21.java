public class p21 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("0123456789");
        StringBuffer sb2 = null;
        //0포함 부터 4미만까지 삭제하고 abcdef삽입
        sb2 = sb1.replace(0,4,"abcdef");
        System.out.println("sb2 = "+sb2);
    }
}
