package test2;

import java.awt.*;

public class DialogExam1 extends Frame{
	public DialogExam1() {
		super("Dialog");
		Dialog d = new Dialog(this, "����!��α�");
		setSize(300,500);
		setVisible(true);
		d.setSize(200,50);
		d.setVisible(true);
		
		
	}
	
	
	public static void main(String Args[]) {
		new DialogExam1();
	}
	
}
