package test1;
import java.awt.*;
import java.awt.event.*; // [1�ܰ�]
// [2�ܰ�] �̺�Ʈ �߻� ��ü(üũ�ڽ�)�� ���� �̺�Ʈ Ŭ����(ItemListener)�� ������ �����Ѵ�.
public class ItemEventExam extends Frame implements ItemListener{
	Panel p1 = new Panel();
	TextArea ta = new TextArea(7, 15);
	Checkbox cb1 = new Checkbox("Ű��", false);
	Checkbox cb2 = new Checkbox("���", false);
	Checkbox cb3 = new Checkbox("����", false);
	public ItemEventExam(){
		super("ItemEvent");
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		add(p1,BorderLayout.NORTH); // ������Ʈ�� �ڸ� ��ġ
		add(ta,BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
		// [3�ܰ�] �̺�Ʈ �߻� ��ü(cb1~cb3)�� �̺�Ʈ �ڵ鷯(addItemListener)�� �����Ѵ�.
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
	}
	public static void main(String args[]){
		new ItemEventExam();
	}
	//[4�ܰ�] itemStateChanged �޼ҵ忡 �̺�Ʈ�� ����� �����Ѵ�.
	public void itemStateChanged(ItemEvent ie){
		
		if(ie.getStateChange() == ItemEvent.SELECTED)
		ta.append(ie.getItem() + "�� ���õ�\n\n");
		
		else if(ie.getStateChange() == ItemEvent.DESELECTED)
		ta.append(ie.getItem() + "�� ��ҵ�\n\n");
		
	}
}