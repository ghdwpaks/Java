package main;
class car {
    String name = "차";
    String print() {
        return "[나는" + name +"이다";
    }
}
class bus extends car {
    String name =  "버스";
    String print() {
        return "[차의 종류는 "+name+"이다.]";
    }
}

class truck extends  car {
    String name =  "트럭";
    String print(){
        return "[차의 종류는 "+name+"이다.]";

    }
}

public class casting {
    public static void main(String[] args) {
        car mycar , yourcar;
        bus mybus, yourbus;
        truck mytruck,yourtruck;
        mycar = new car();
        mybus = new bus();
        mytruck = new truck();

        System.out.println("["+mycar.print()+"]");
        System.out.println("["+mybus.print()+"]");
        System.out.println("["+mytruck.print()+"]");

        yourcar = mybus;
        yourbus = (bus) yourcar;
        System.out.println("["+yourbus.print()+"]");
        yourcar = mytruck;
        yourtruck = (truck) yourcar;
        System.out.println("["+yourtruck.print()+"]");



    }


}
