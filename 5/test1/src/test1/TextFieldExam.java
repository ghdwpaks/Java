package test1;

import java.awt.*;
public class TextFieldExam extends Frame{
	public TextFieldExam(){
		super("�ؽ�Ʈ �ʵ�");
		Panel p=new Panel();
		TextField tf1=new TextField("�ֹε�Ϲ�ȣ���ڸ�"); //�⺻ ���� ���
		TextField tf2=new TextField(15); //15�� ���� �����ִ� ũ��� ����
		tf1.selectAll(); //�Էµ� ���ڿ� ��ü�� ���� ���·� �����
		tf2.setEchoChar('*'); //�Էµ� ���ڸ� *�� ��ȯ�Ͽ� ����Ѵ�
		p.add(tf1);
		p.add(tf2);
		add(p);
		setSize(400, 100);
		setVisible(true);
	}
	public static void main(String[] args){
		new TextFieldExam();
	}
}