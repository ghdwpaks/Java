package School_textbook;

public class p83_MyClass extends GrandFather83{

	public p83_MyClass(String str) {
		super(str);
		System.out.println("MyClass 积己磊");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p83_MyClass s = new p83_MyClass("全辨悼");
	}

}

class GrandFather83 {
	private String name;
	public GrandFather83(String name) {
		this.name = name;
		System.out.println("GrandFather 积己磊");
	}
}