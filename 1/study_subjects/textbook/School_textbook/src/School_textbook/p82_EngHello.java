package School_textbook;

public class p82_EngHello extends Greeting_82 {
	public String name = "Mr.Hong";
	public void sayHello() {
		System.out.println(name+" Nice to meet you");
	}
	public void test() {
		System.out.println(super.name);
		super.sayHello();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p82_EngHello eng = new p82_EngHello();
		eng.sayHello();
		eng.test();
	}

}

class Greeting_82 {
	public String name = "È«±æµ¿";
	public void sayHello() {
		System.out.println("¾¾ ¾È³çÇÏ¼¼¿ä");
	}
}
