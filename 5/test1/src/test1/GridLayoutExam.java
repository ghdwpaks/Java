package test1;

import java.awt.*;
public class GridLayoutExam extends Frame{
	public GridLayoutExam(){
		super("GridLayout");
		setLayout(new GridLayout(2,3)); //��ġ ������ 2�� 3ĭ GridLayout ����
		//��ư 6�� ����
		Button b1=new Button("��ư1");
		Button b2=new Button("��ư2");
		Button b3=new Button("��ư3");
		Button b4=new Button("��ư4");
		Button b5=new Button("��ư5");
		Button b6=new Button("��ư6");
		//��ư 6���� Frame�� �߰�
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		setSize(150,150);
		setVisible(true);
	}
	public static void main(String[] args){
		new GridLayoutExam();
	}
}