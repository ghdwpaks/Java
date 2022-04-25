package test1;

import java.awt.*;
public class FlowLayoutExam extends Frame{
	public FlowLayoutExam(){
		super("FlowLayout");
		setLayout(new FlowLayout()); //배치 관리자 FlowLayout 적용
		//버튼 3개를 생성한다.
		Button b1=new Button("첫번째");
		Button b2=new Button("두번째");
		Button b3=new Button("세번째");
		//버튼 3개를 Frame에 추가한다.
		add(b1);
		add(b2);
		add(b3);
		setSize(150,100);
		setVisible(true);
	}
	public static void main(String[] args){
		new FlowLayoutExam();
	}
}