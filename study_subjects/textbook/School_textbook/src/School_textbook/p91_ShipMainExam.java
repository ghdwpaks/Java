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
		return "배 이름";
		
	}
}
class myship91 extends ship91{
	public String name() {
		return "해적선";
	}
}
class  yourship91 extends ship91 {
	public String name() {
		return "타이타닉 호";
	}
}
class shipname {
	public static void search(ship91 s) {
		if(s instanceof myship91) {
			myship91 b = (myship91)s;
			System.out.println("Myship 이름 :"+b.name());
					
		}else if (s instanceof yourship91) {
			yourship91 b = (yourship91)s;
			System.out.println("Yourship 이름 :"+b.name());
		}
	}
}