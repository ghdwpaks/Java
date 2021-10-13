public class ex09_random {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        for (int i = 0; i < 10;i ++) {
            System.out.println(i+"번째 :"+(int)(Math.random()*10));
        }
    }
}
