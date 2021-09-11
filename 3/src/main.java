class ship {
    public String name() {
        return "배 이름";
    }
}

class myship extends ship {
    public String name() {
        return "해적선";
    }
}

class yourship extends ship {
    public String name() {
        return "타이타닉 호";
    }
}

class shipname {
    public static void search(ship s) {
        if(s instanceof myship) {
            myship b= (myship) s;
            System.out.println("myship 이름 :"+b.name());

        } else if(s instanceof yourship) {
            yourship b = (yourship) s;
            System.out.println("Yourship 이름 :"+b.name());
        }
    }
}

public class main {

    public static void main(String[] args) {
        ship myship = new myship();
        ship yourship = new yourship();
        shipname.search((myship));
        shipname.search((yourship));
    }


}
