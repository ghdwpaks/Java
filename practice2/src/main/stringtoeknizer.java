package main;

import java.util.StringTokenizer;

public class stringtoeknizer {
    public static void main(String[] args) {
        String q = "name=kitea&addr=seoul&21";
        StringTokenizer st = new StringTokenizer(q,"&=");

        int n = st.countTokens();
        System.out.println("토큰 갯수 :"+n);

        int i = 0;
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(i+"번째 token :"+token);
            i++;
        }


    }
}
