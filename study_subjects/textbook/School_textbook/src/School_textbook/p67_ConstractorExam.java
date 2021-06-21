package School_textbook;

public class p67_ConstractorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student67 kim = new Student67();
		Student67 jang = new Student67();
		System.out.println("학생의 이름은 "+kim.name+"입니다.");
		System.out.println("학생의 이름은 "+jang.name+"입니다.");
	}

}

class Student67{
	String name;
	int grade;
	int ban;
	int number;
	String telephone;
	public Student67() {}
	public Student67(String n) {name = n;}
}