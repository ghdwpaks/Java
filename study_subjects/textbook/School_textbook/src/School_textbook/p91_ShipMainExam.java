package School_textbook;

public class p91_ShipMainExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ship91 myShip = new myship91();
		ship91 yourship = new yourship91();
		shipname.search(myShip);
		shipname.search(yourship);
				
	}

}

class ship91 {
	public String name() {
		return "�� �̸�";
		
	}
}
class myship91 extends ship91{
	public String name() {
		return "������";
	}
}
class  yourship91 extends ship91 {
	public String name() {
		return "Ÿ��Ÿ�� ȣ";
	}
}
class shipname {
	public static void search(ship91 s) {
		if(s instanceof myship91) {
			myship91 b = (myship91)s;
			System.out.println("Myship �̸� :"+b.name());
					
		}else if (s instanceof yourship91) {
			yourship91 b = (yourship91)s;
			System.out.println("Yourship �̸� :"+b.name());
		}
	}
}