package main;
class school {
    String name = "한세";
}
class stu{
    String name = "기본학생이름";
    int age = 17;
    school school_name = new school();

}
public class Main {

    public static void main(String[] args) {
        stu student1 = new stu();
        student1.school_name.name = "선린";
        System.out.println("student1.name :"+student1.name);
        System.out.println("student1.age :"+student1.age);
        System.out.println("student1.school_name.name :"+student1.school_name.name);
    }
}
