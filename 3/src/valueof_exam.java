public class valueof_exam {
    public static void main(String[] args) {
        char ch = 'a';
        String s1 = "a";
        String s2;
        s2 = String.valueOf(ch);
        //char 형식을 String 형식으로 바꾼다
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
        if(s1.equals(s2))
            System.out.println("같음");
        else
            System.out.println("다름");

        int i = 10;
        String s3 = "10";
        String s4;
        s4 = String.valueOf(i);
        //다만, 꼭 피연산자가 char 형식이 아니더라도 괜찮은 경우가 있다.
        System.out.println("s3 : "+s3);
        System.out.println("s4 : "+s4);
        if(s3.equals(s4))
            System.out.println("같음");
        else
            System.out.println("다름");
    }
}
