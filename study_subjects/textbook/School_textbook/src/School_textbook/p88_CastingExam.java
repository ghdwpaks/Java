package School_textbook;

public class p88_CastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car88 mycar, yourcar;
		Bus88 mybus, yourbus;
		Truck88 mytruck, yourtruck;
		mycar = new Car88();
		mybus = new Bus88();
		mytruck = new Truck88();
		
		System.out.println("["+mycar.print()+"]");
		System.out.println("["+mybus.print()+"]");
		System.out.println("["+mytruck.print()+"]");
		
		yourcar = mybus;
		yourbus = (Bus88)yourcar;
		
		System.out.println("["+yourbus.print()+"]");
		yourcar = mytruck;
		yourtruck = (Truck88)yourcar;
		System.out.println("["+yourtruck.print()+"]");
		
	}

}
class Car88{
	String name = "��";
	String print() {
		return "[���� "+name+"�̴�.";
	}
}
class Bus88 extends Car88 {
	String name = "����";
	String print() {
		return "[���� ������ "+name+"�̴�.]";
	}
}
class Truck88 extends Car88 {
	String name = "Ʈ��";
	String print() {
		return "[���� ������ "+name+"�̴�.]";
	}
}