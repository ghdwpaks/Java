package School_textbook;

public class p73_StaticMethodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student73 kim= new Student73();
		Student73 jang= new Student73();
		Student73 bak= new Student73();
		System.out.println("������ ��ü ���� "+Student73.getCount()+"�Դϴ�.");
	}

}

class Student73{
	String name;
	int grade;
	static int count = 0;
	public Student73() {count                   ++;}
	public static int getCount() {return count;}
}