public class append_exam2 {
    public static void main(String[] args) {


        StringBuffer sb1 = new StringBuffer("Java Programming");
        StringBuffer sb2 = new StringBuffer("Project");
        System.out.println("1 sb1 :"+sb1);
        System.out.println("1 sb2 :"+sb2);
        StringBuffer s1= null;
        StringBuffer s2 = null;

        s1 = sb1.append("p1");
        s2 = sb1.append(sb2);

        System.out.println("2 sb1 :"+sb1);
        System.out.println("2 sb2 :"+sb2);
        System.out.println("s1 :"+s1);
        System.out.println("s2 :"+s2);

        StringBuffer s3 = sb1;
        System.out.println("s3 :"+s3);


        System.out.println();

    }
}
