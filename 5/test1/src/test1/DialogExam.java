package test1;

import java.awt.*;
public class DialogExam extends Frame{ // Frame 상속 받음
	public DialogExam(){
		super("Dialog");
		Dialog d = new Dialog(this, "다이얼로그"); //Dialog의 제목 설정
		setSize(300, 100); // Frame의 크기 설정
		setVisible(true); //Frame 출력
		d.setSize(200,50); // Dialog의 크기 설정
		d.setVisible(true); //Dialog 출력
	}
	public static void main(String[] args){
		new DialogExam();
	}
}