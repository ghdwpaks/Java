package test2;
import java.awt.*;
public class TextAreaExam1 extends Frame {
	public TextAreaExam1() {
		super("TA");
		Panel p = new Panel();
		TextArea ta1 = new TextArea("first",3,30);
		TextArea ta2 = new TextArea("second",6,60,TextArea.SCROLLBARS_NONE);
		p.add(ta1);
		p.add(ta2);
		add(p);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String args[]) {
		new TextAreaExam1();
	}
}
