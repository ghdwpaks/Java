package test2;
import java.awt.*;
public class TextAreaExam2 extends Frame{
	public TextAreaExam2() {
		super("��2��");
		Panel p = new Panel();
		TextArea t1 = new TextArea("t1",1,50); //"ó�� ������ ����","��������� ����","�۰�ũ���� ����"
		TextArea t2 = new TextArea("t2",2,20);
		TextArea t3 = new TextArea("t3",3,30);
		TextArea t4 = new TextArea("t4",4,40,
				TextArea.SCROLLBARS_NONE);//��ũ�ѹ� ��� �ź�
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		add(p);
		setLocation(100,100);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]) {
		new TextAreaExam2();
	}
}
