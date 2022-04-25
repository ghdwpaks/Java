package test2;

import java.awt.*;

public class DialogExam3 extends Frame{
	public DialogExam3() {
		super("다이 얼 로그 3");
		setLocation(300,500);
		setVisible(true);
		Dialog d = new Dialog(this,"다이 얼 로그 33");
		d.setLocation(500,300);
		d.setSize(300,200);
		d.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new DialogExam3();
	}

}
