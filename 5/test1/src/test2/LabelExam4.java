package test2;
import java.awt.*;
public class LabelExam4 extends Frame{
	
	public LabelExam4() {
		super("¶ó4º§");
		Panel p = new Panel();
		Label l1 = new Label("l1");
		//Label l2 = new Label("l2");
		Label l2 = new Label("l2",Label.CENTER);
		l1.setBackground(Color.blue);
		l2.setBackground(Color.yellow);
		p.add(l1);
		p.add(l2);
		add(p);
		setSize(300,200);
		setLocation(100,100);
		setVisible(true);
		
		
		
		
	}
	
	public static void main(String args[]) {
		new LabelExam4();
	}

}
