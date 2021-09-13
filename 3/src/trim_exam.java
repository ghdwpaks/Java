public class trim_exam {
    public static void main(String[] args) {
        String s1 = "   I love you   ";
        String s2;
        s2 = s1.trim();
        System.out.println("s1.trim() ->"+s2);
        if(s1.equals(s2))
            System.out.println("같음");
        else
            System.out.println("다름");
    }
}
