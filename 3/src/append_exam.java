import com.sun.org.apache.xpath.internal.operations.String;

public class append_exam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Java Programming");
        StringBuffer sb2 = new StringBuffer("Project");
        StringBuffer s1= null;
        StringBuffer s2 = null;

        s1 = sb1.append("Project");
        s2 = sb1.append(sb2);

        System.out.println("sb1 :"+sb1);
        System.out.println("sb2 :"+sb2);
        System.out.println("s1 :"+s1);
        System.out.println("s2 :"+s2);

        System.out.println();


    }
}
