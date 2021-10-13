public class ex04 {
    public static void main(String[] args) {
        String s = "100";
        int i = 100;
        System.out.println(s.equals(i));
        //equals는 변수 형식을 넘어서 비교를 해주지는 않는다.
        System.out.println(s.equals(String.valueOf(i)));
        System.out.println(i==Integer.valueOf(s));
    }
}
