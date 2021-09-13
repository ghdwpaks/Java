package main;

class par {
    String name = "par";
    int age = 50;
    int impar = 1;
    String intro() {
        return "나는 부모인 "+name+"입니다.";
    }
    String par_int() {
        return "나는 부모이다.";
    }

}
class chi extends  par {
    String name = "chi";
    int age = 20;
    int imchi = 1;
    String intro() {
        return "나는 자식인"+name+"입니다.";
    }

    String chi_int() {
        return "나는 자식이다.";
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("\n1\n");
        chi c1 = new chi();
        System.out.println("c1.name : "+c1.name);
        System.out.println("c1.age : "+c1.age);
        System.out.println("c1.imchi : "+c1.imchi);
        System.out.println("c1.impar : "+c1.impar);
        System.out.println("c1.intro() :"+c1.intro());
        System.out.println("c1.par_int() :"+c1.par_int());
        System.out.println("c1.chi_int() :"+c1.chi_int());

        System.out.println("\n2\n");

        par p1 = new par();
        System.out.println("p1.name : "+p1.name);
        System.out.println("p1.age : "+p1.age);
        System.out.println("p1.impar : "+p1.impar);
        System.out.println("p1.intro() : "+p1.intro());
        System.out.println("p1.par_int() : "+p1.par_int());

        System.out.println("\n3\n");

        //메서드 오버라이딩 적용 목적
        par p2 = new chi();
        System.out.println("p2.name : "+p2.name);
        System.out.println("p2.age : "+p2.age);
        System.out.println("p2.impar : "+p2.impar);
        System.out.println("p2.intro() : "+p2.intro());
        System.out.println("p2.par_int() : "+p2.par_int());

        System.out.println("\n4\n");

        par p3 = new chi();
        p3.name = "부모님";
        p3.impar = 3;
        chi c3 = (chi)p3;
        System.out.println("c3.name : "+c3.name);
        System.out.println("c3.age : "+c3.age);
        System.out.println("c3.imchi : "+c3.imchi);
        System.out.println("c3.impar :"+c3.impar);
        System.out.println("c3.intro() : "+c3.intro());
        System.out.println("c3.par_int() : "+c3.par_int());
        System.out.println("c3.chi_int() : "+c3.chi_int());

        System.out.println("\n");

        System.out.println("p3.name : "+p3.name);
        System.out.println("p3.age : "+p3.age);
        System.out.println("((chi) p3).imchi : "+((chi) p3).imchi);
        System.out.println("p3.impar : "+p3.impar);
        System.out.println("p3.intro() : "+p3.intro());
        System.out.println("p3.par_int() : "+p3.par_int());
        //System.out.println("p3.chi_int() : "+p3.chi_int());

    }
}
