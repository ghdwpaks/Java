package School_textbook;

public class p80_truck extends p80_car{
	public p80_truck() {
		System.out.println("Truck 持失切");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p80_truck mytruck = new p80_truck();
	}

}
class p80_car {
	p80_car() {
		System.out.println("Car 持失切");
	}
}