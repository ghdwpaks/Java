package test2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActionEventExam1 extends Frame implements ActionListener{
	Button b = new Button("¹öÆ°");
	Panel p = new Panel();
	public ActionEventExam1() {
		super("ActionEvent");
		p.add(b);
		add(p);
		setSize(300,150);
		setVisible(true);
		b.addActionListener(this);
	}
	public static void main(String args[]) {
		new ActionEventExam1();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			System.exit(0);
		}
		
	}
}
