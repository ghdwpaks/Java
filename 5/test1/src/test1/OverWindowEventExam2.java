package test1;

import java.awt.*;
import java.awt.event.*; //[1�ܰ�]
public class OverWindowEventExam2 extends Frame{
	
	public OverWindowEventExam2(){
		super("���� ��ư�� �����ּ���.");
		setSize(300,100);
		setVisible(true);
		//[2�ܰ�] ������ �̺�Ʈ(addWindowListener)�� �߻��ϸ�,
		// ����ڰ� ������ Ŭ����(MyClass)�� ȣ���Ѵ�
		addWindowListener(new MyClass());
	}
	public static void main(String[] args){
		new OverWindowEventExam2();
	}
}

//[3�ܰ�] �̺�Ʈ �ڵ鷯(WIndowAdapter)�� ��ӹ��� Ŭ������ �����Ѵ�
	class MyClass extends WindowAdapter{
	//[4�ܰ�] �ʿ��� �޼ҵ常 �������Ѵ�
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}