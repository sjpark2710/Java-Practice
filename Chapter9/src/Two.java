
/*
 * 2. 다음 조건을 만족하며 클래스 JFrame을 상속받는 클래스를 구현하여 테스트하는 프로그램을 작성하시오.

	- 윈도우의 가로와 세로가 각각 300, 150으로, 윈도우의 콘텐트패인 색상을 Color.lightGray로
	
	- 윈도우의 캡션 제목을 "프로그래밍 연습 2"로
	
	- 윈도우의 종료 버튼으로 프로그램도 함께 종료하도록
	
	- 상단에 "OK" 버튼과 하단에 "Cancel" 버튼 추가, BorderLayout의 "North", "South"이용
	
	- 메소드 setDefaultLookAndFeelDecorated(boolean)의 인자를 true, false로 하여 결과를 비교
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Two extends JFrame{
	private JButton btn1, btn2;
	public static final long serialVERSIONUID = 1L;
	
	public Two(String title) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setTitle(title);
		setBackground(Color.lightGray);
		
		setLayout(new BorderLayout());
		btn1 = new JButton("OK");
		btn2 = new JButton("CALCEL");
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);
		
		setDefaultLookAndFeelDecorated(true);
		
		setVisible(true);
	}
	
	public static void main(String[]args) {
		Two t=new Two("프로그래밍 연습 2");
	}

}
