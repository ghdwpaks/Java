package test1;

import java.awt.*;
import java.awt.event.*; // [1�ܰ�]
// [2�ܰ�] �̺�Ʈ �߻� ��ü(��ư)�� ���� �̺�Ʈ Ŭ����(ActionListener)�� ������ �����Ѵ�
public class ActionEventExam extends Frame implements ActionListener{
	//b1�� p ������Ʈ�� ��� �޼ҵ忡�� �����ϱ� ���ؼ� ���� ������
	Button b1=new Button("��ư");
	Panel p = new Panel();
	public ActionEventExam(){
		super("ActionEvent");
		p.add(b1);
		add(p);
		setSize(300,150);
		setVisible(true);
		//[3�ܰ�] �̺�Ʈ �߻� ��ü(b1)�� �̺�Ʈ �ڵ鷯(addActionListener)�� �����Ѵ�
		b1.addActionListener(this);
	}
	//[4�ܰ�] actionPerformed �޼ҵ忡 �̺�Ʈ�� ����� �����Ѵ�
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == b1){ //b1�� ������, â�� �ݱ�
		System.exit(0);
		}
	}
	public static void main(String[] args){
	new ActionEventExam();
	}
}