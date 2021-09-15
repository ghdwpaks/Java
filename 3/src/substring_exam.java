public class substring_exam {
    public static void main(String[] args) {
        String s1 = "I love you";
        System.out.println("인덱스(배열처럼)");
        System.out.println("0123456789");
        System.out.println(s1);

        String s2;
        s2 = s1.substring(7);
        System.out.println("s1.substring(7) ->"+s2);
        s2 = s1.substring(2,5);
        System.out.println("s1.substring(2,5) ->"+s2);
    }
}
