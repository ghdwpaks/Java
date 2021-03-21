package day01;

class Employee {
	String name;
	int idNum;
	int salary;
	boolean sex;
}

public class p1741 {

	public static void main(String[] args) {
		Employee m = new Employee();
		m.name = "ȫ�浿";
		m.idNum = 17001;
		m.salary = 4500000;
		m.sex = true;
		System.out.println(m.name);
		System.out.println(m.idNum);
		System.out.println(m.salary);
		System.out.println(m.sex);

	}

}
