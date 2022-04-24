package test1;

import java.awt.*;
public class GridLayoutExam extends Frame{
	public GridLayoutExam(){
		super("GridLayout");
		setLayout(new GridLayout(2,3)); //배치 관리자 2줄 3칸 GridLayout 적용
		//버튼 6개 생성
		Button b1=new Button("버튼1");
		Button b2=new Button("버튼2");
		Button b3=new Button("버튼3");
		Button b4=new Button("버튼4");
		Button b5=new Button("버튼5");
		Button b6=new Button("버튼6");
		//버튼 6개를 Frame에 추가
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		setSize(150,150);
		setVisible(true);
	}
	public static void main(String[] args){
		new GridLayoutExam();
	}
}