package test2;
import java.awt.*;
public class TextAreaExam2 extends Frame{
	public TextAreaExam2() {
		super("텍2아");
		Panel p = new Panel();
		TextArea t1 = new TextArea("t1",1,50); //"처음 쓰여질 문장","문장단위의 높이","글가크기의 넓이"
		TextArea t2 = new TextArea("t2",2,20);
		TextArea t3 = new TextArea("t3",3,30);
		TextArea t4 = new TextArea("t4",4,40,
				TextArea.SCROLLBARS_NONE);//스크롤바 사용 거부
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		add(p);
		setLocation(100,100);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]) {
		new TextAreaExam2();
	}
}
