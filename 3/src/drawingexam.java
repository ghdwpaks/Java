class shape{
    public void draw() {
        System.out.println("도형 그리기");
    }
}
class circle extends  shape {
    private String type = "원";
    public void draw(){
        System.out.println(type + "그리기");
    }
    public void painting() {
        System.out.println("색 칠하기");
    }
}

public class drawingexam {
    public static void main(String[] args) {
        circle c= new circle();
        System.out.println(1);
        c.draw();
        System.out.println(2);
        c.painting();

        System.out.println(3);
        shape s1 = new circle();
        s1.draw();


    }

}
