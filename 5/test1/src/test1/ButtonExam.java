package test1;

import java.awt.*;
public class ButtonExam extends Frame{
	public ButtonExam(){
		super("��ư");
		Panel p=new Panel(); //2���� ��ư�� ������ Panel ����
		Button b1=new Button(); //��� �ִ� ��ư ��ü ����
		Button b2=new Button("��ư2"); //Label �ִ� ��ư ��ü ����
		b1.setLabel("��ư1"); //��ư�� Label�� �־���
		//Panel�� 2���� ��ư ���̱�
		p.add(b1);
		p.add(b2);
		add(p); //Panel�� �����ӿ� �߰�
		setLocation(200,200);
		setSize(250,100);
		setVisible(true);
	}
	public static void main(String[] args){
		new ButtonExam();
	}
}