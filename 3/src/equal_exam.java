public class equal_exam {
    public static void main(String[] args) {
        String str1 = "hansei";
        String str2 = "hansei";
        String str3 = new String("고등학교");
        String str4 = new String("고등학교");

        if (str1 == str2)
            System.out.println("1 주소 같다");
        else
            System.out.println("1 주소 다르다");


        if (str3 == str4)
            System.out.println("2 주소 같다");
        else
            System.out.println("2 주소 다르다");


        if (str1.equals(str2))
            System.out.println("3 내용 같다");
        else
            System.out.println("3 내용 다르다");


        if (str3.equals(str4))
            System.out.println("4 내용 같다");
        else
            System.out.println("4 내용 다르다");


    }
}
