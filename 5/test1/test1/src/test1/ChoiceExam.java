package test1;

import java.awt.*;
public class ChoiceExam extends Frame{
	public ChoiceExam(){
		super("Choice �׽�Ʈ");
		Panel p=new Panel();
		Choice ch= new Choice(); //Choice ��ü ����
		//�׸� �߰�
		ch.addItem("��");
		ch.addItem("����");
		ch.addItem("����");
		ch.addItem("�ܿ�");
		p.add(ch);
		add(p);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args){
		new ChoiceExam();
	}
}