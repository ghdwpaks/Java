package main;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		person ghd = new person();
		ghd.age = 10;
		ghd.name = "ghdwpaks";
		System.out.println(ghd.name+"'s age is "+ghd.age);
	}

}

class person {
	int age = 0;
	String name = "Nameless";
}