
/*
 * 4. 프레임에 설정되어 있는 기본 배치관리자를 사용하고, 다음 조건을 만족하는 클래스를 구현하여 테스트하는 프로그램을 작성하시오.

		- 다음과 같이 슬라이더 4개가 동, 서, 남, 북에 배치되도록
		
		- 4개의 슬라이더는 다음에 표시되는 조건과 모습을 만족하도록
 */
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;


public class Four extends JFrame{
	
	public static final long seriaLVERSIONUID = 1L;
	
	public Four(String title) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		setTitle(title);
		
		setLayout(new BorderLayout());
		
		JSlider sdNorth = new JSlider(0, 200, 40); //0~200, 초기값 40
		
		sdNorth.setPaintLabels(true);		//주 눈금 글씨
		sdNorth.setPaintTicks(true);		//주 눈금
		sdNorth.setMinorTickSpacing(10);	//부 눈금 간격
		sdNorth.setMajorTickSpacing(50);	//주 눈금 감격
		sdNorth.setForeground(Color.BLUE);  //파란색 글씨
		
		
		JSlider sdEast = new JSlider(JSlider.VERTICAL, 100, 200, 150);	//수직, 100~200, 초기값 150
		sdEast.setPaintLabels(true);		//주 눈금 글씨
		sdEast.setPaintTicks(true);			//주 눈금
		sdEast.setMinorTickSpacing(20);		//부 눈금 간격
		sdEast.setMajorTickSpacing(50);		//주 눈금 간격
		
		JSlider sdWest = new JSlider(JSlider.VERTICAL);	//0 ~ 100, 초기값 90
		sdWest.setPaintLabels(true);				//주 눈금 글씨
		sdWest.setPaintTicks(true);					//주 눈금
		sdWest.setMajorTickSpacing(50);				//주 눈금 간격
		

		JSlider sdSouth = new JSlider(0, 160, 90);	//0 ~ 160, 초기값 90
		
		sdSouth.setPaintLabels(true);		//주 눈금 글씨
		sdSouth.setPaintTicks(true);		//주 눈금
		sdSouth.setMinorTickSpacing(40);	//부 눈금 간격
		sdSouth.setMajorTickSpacing(80);	//주 눈금 간격
		sdSouth.setForeground(Color.red);
		
		
		add(sdNorth,BorderLayout.NORTH);
		add(sdEast,BorderLayout.EAST);
		add(sdSouth,BorderLayout.SOUTH);
		add(sdWest,BorderLayout.WEST);
		

		setVisible(true);
	}
	
	 public static void main(String[]args) {
		 Four f = new Four("슬라이더");
	 }

}
