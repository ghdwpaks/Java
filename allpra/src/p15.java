public class p15 {
    public static void main(String[] args) {
        char c='a';
        String s1 = "a";
        String s2;
        s2 = String.valueOf(c);

        if(s1.equals(s2)) {
            System.out.println("String으로 변환된 C 맞음");
        } else {
            System.out.println("아님");
        }


    }
}
