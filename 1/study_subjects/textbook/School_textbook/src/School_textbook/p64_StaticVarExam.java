package School_textbook;

public class p64_StaticVarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student64 kim = new Student64();
		Student64 jang = new Student64();
		Student64 bak = new Student64();
		System.out.println("생성된 학생 객체 수는 "+Student64.count +"입니다.");
	}

}
class Student64{
	String name;
	int grade;
	static int count = 0;
	public Student64() {
		count++;
	}
}
