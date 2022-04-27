package test2;
import java.awt.*;
public class ListExam1 extends Frame{
	public ListExam1() {
		super("¸®½ºÆ®");
		Panel p = new Panel();
		List l1 = new List(4, true);
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		l1.add("5");
		l1.add("6");
		l1.add("7");
		p.add(l1);
		add(p);
		setLocation(100,100);
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new ListExam1();
	}
}
