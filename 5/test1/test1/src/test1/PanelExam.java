package test1;

import java.awt.*;
	public class PanelExam extends Frame{
		public PanelExam(){
			super("Panel");
			Panel p = new Panel(); //Panel ����
			p.setBackground(Color.blue); //Panel ���� �Ķ������� ����
			add(p); //Panel�� Frame�� ����
			setSize(300, 80);
			setVisible(true);
		}
		public static void main(String[] args){
			new PanelExam();
		}
}
	