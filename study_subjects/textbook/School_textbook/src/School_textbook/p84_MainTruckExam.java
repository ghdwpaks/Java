package School_textbook;

public class p84_MainTruckExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck84 mytruck = new Truck84();
		mytruck.speedUp();
		mytruck.speedDown();
	}


}
class Car84 {
	String carname;
	String color;
	int velocity;
	void speedUp() {
		velocity += 5;
		System.out.println("�ӵ� "+velocity+"����");
	}
	void speedDown() {
		velocity -= 5;
		System.out.println("�ӵ� +"+velocity+" ����");
	}
}

class Truck84 extends Car84 {
	int ton = 5;
	void speedUp() {
		velocity += 10;
		System.out.println("�ӵ� "+velocity+" ����");
		
	}
}


