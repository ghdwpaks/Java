package test1;

import java.awt.*;
	public class PanelExam extends Frame{
		public PanelExam(){
			super("Panel");
			Panel p = new Panel(); //Panel 생성
			p.setBackground(Color.blue); //Panel 색상 파란색으로 변경
			add(p); //Panel을 Frame에 붙임
			setSize(300, 80);
			setVisible(true);
		}
		public static void main(String[] args){
			new PanelExam();
		}
}
	