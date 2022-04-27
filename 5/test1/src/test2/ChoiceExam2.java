package test2;
import java.awt.*;
public class ChoiceExam2 extends Frame{
	public ChoiceExam2() {
		Panel p = new Panel();
		Choice c = new Choice();
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		p.add(c);
		add(p);
		setLocation(100,100);
		setSize(300,200);
		setVisible(true);
		
		
		
	}
	
	public static void main(String args[]) {
		new ChoiceExam2();
	}

}
