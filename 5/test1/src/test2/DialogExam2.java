package test2;

import java.awt.*;

public class DialogExam2 extends Frame{
	public DialogExam2() {
		super("다이 얼 로그 2");
		setSize(500,300);
		setLocation(400,600);
		setVisible(true);
		
		Dialog d = new Dialog(this,"다이 얼 로그 22");
		d.setLocation(600,700);
		d.setSize(200,100);
		d.setVisible(true);
		
		
		
	}
	
	public static void main(String args[]) {
		new DialogExam2();
	}
}
