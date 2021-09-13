public class stringequal_exam {
    public static void main(String[] args) {
        String r1 = new String("java");
        String r2 = new String("java");
        String r3 = new String("java");
        System.out.println("r1 == r2 -->"+(r1==r2));
        System.out.println("r1.equals(r2) -->"+(r1.equals(r2)));
        System.out.println("r1 == r3 -->"+(r1==r3));
        System.out.println("r1.equals(r3) -->"+r1.equals(r3));

    }
}
