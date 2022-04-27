package test2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActionEventExam2 extends Frame implements ActionListener{
	Button b = new Button();
	Panel p = new Panel();
	public ActionEventExam2() {
		super("พื2ภฬ");
		p.add(b);
		add(p);
		setSize(200,100);
		setLocation(100,100);
		setVisible(true);
		b.addActionListener(this);
	}
	public static void main(String args[]) {
		new ActionEventExam2();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			System.exit(0);
		}
	}
}
