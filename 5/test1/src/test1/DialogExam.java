package test1;

import java.awt.*;
public class DialogExam extends Frame{ // Frame ��� ����
	public DialogExam(){
		super("Dialog");
		Dialog d = new Dialog(this, "���̾�α�"); //Dialog�� ���� ����
		setSize(300, 100); // Frame�� ũ�� ����
		setVisible(true); //Frame ���
		d.setSize(200,50); // Dialog�� ũ�� ����
		d.setVisible(true); //Dialog ���
	}
	public static void main(String[] args){
		new DialogExam();
	}
}