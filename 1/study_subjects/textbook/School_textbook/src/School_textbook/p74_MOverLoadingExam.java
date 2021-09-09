package School_textbook;

public class p74_MOverLoadingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add a = new add();
		System.out.println(a.sum("ÇÑ¼¼","¾¾¹Ù°í"));
		System.out.println(a.sum(10,20));
		
		
	}

}

class add74{
	String sum(String s1, String s2) {
		return s1 + s2;
	}
	int sum(int i1, int i2) {
		return i1 + i2;
	}
}