package School_textbook;

public class p61_MemberExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student61 kim = new Student61();
		kim.name = "김현우";
		kim.grade = 2;
		kim.telephone = "111-1111";
		System.out.println("학싱의 이름은 "+kim.name+"이고, 학년은"+kim.grade+"이고, 전화번호는"+kim.telephone+"입니다.");
		
		
	}

}
class Student61 {
	public String name;
	int grade;
	int ban;
	int number;
	private String telephone;
	
	
}