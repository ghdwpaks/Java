package test1;
import java.awt.*;
import java.awt.event.*; // [1단계]
// [2단계] 이벤트 발생 객체(체크박스)와 관련 이벤트 클래스(ItemListener)의 종류를 선택한다.
public class ItemEventExam extends Frame implements ItemListener{
	Panel p1 = new Panel();
	TextArea ta = new TextArea(7, 15);
	Checkbox cb1 = new Checkbox("키위", false);
	Checkbox cb2 = new Checkbox("사과", false);
	Checkbox cb3 = new Checkbox("딸기", false);
	public ItemEventExam(){
		super("ItemEvent");
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		add(p1,BorderLayout.NORTH); // 컴포넌트의 자리 배치
		add(ta,BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
		// [3단계] 이벤트 발생 객체(cb1~cb3)에 이벤트 핸들러(addItemListener)를 연결한다.
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
	}
	public static void main(String args[]){
		new ItemEventExam();
	}
	//[4단계] itemStateChanged 메소드에 이벤트의 기능을 구현한다.
	public void itemStateChanged(ItemEvent ie){
		
		if(ie.getStateChange() == ItemEvent.SELECTED)
		ta.append(ie.getItem() + "가 선택됨\n\n");
		
		else if(ie.getStateChange() == ItemEvent.DESELECTED)
		ta.append(ie.getItem() + "가 취소됨\n\n");
		
	}
}