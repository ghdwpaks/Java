package main;

class shape {
    public void draw() {
        System.out.println("도형 그리기");
    }
}
class circle extends shape {
    private  String type = "원";
    public void draw() {
        System.out.println(type+"그리기");

    }
    public void painting() {
        System.out.println("색 칠하기");
    }
}




public class drawing {
    public static void main(String[] args) {
        circle c = new circle();
        c.draw();
        c.painting();
    }
}
