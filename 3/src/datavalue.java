import java.util.StringTokenizer;

public class datavalue {
    public static void main(String[] args) {

        String l;
        String t = "hong 용산구 10.5 20.5";
        StringTokenizer p = new StringTokenizer(t);
        String n;
        String a;
        double m;
        double e;
        double to;
        double avg;
        n = p.nextToken();
        a = p.nextToken();
        m = Double.valueOf(p.nextToken()).doubleValue();
        e = Double.valueOf(p.nextToken()).doubleValue();
        to = m + e;
        avg = to / 2.0;
        System.out.println(n+"\t"+);



    }
}
