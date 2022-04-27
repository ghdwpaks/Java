package test2;
import java.awt.*;
public class TextAreaExam3 extends Frame{
	public TextAreaExam3() {
		super("ец3╬ф");
		Panel p = new Panel();
		TextArea ta1 = new TextArea("t1",2,10);
		TextArea ta2 = new TextArea("t2",5,20,TextArea.SCROLLBARS_NONE);
		p.add(ta1);
		p.add(ta2);
		add(p);
		setSize(400,500);
		setLocation(100,100);
		setVisible(true);
	}
	public static void main(String args[]) {
		new TextAreaExam3();
	}
}
