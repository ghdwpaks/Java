package test1;

import java.awt.*
;
import java.awt.event.*
; //[1�ܰ�]
//[2�ܰ�] �̺�Ʈ �߻� ��ü(������)�� ���� �̺�Ʈ Ŭ����(WindowListener)�� ������ �����Ѵ�.
public class OverWindowEventExam extends Frame implements WindowListener{
	public OverWindowEventExam(){
		super("���� ��ư�� �����ּ���.");
		setSize(300,100);
		setVisible(true);
		//[3�ܰ�] ���� ������(this)�� �̺�Ʈ �ڵ鷯(addWindowListener)�� �����Ѵ�.
		addWindowListener(this); //�̺�Ʈ ����
	}
	//[4�ܰ�] ���� ��ư�� �������� ���� �̺�Ʈ�� ����� �����Ѵ�.
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	
	public void windowClosed(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	public static void main(String[] args){
	new OverWindowEventExam();
	}
}