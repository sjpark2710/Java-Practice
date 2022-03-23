
/*
 * 1. 다음 조건을 만족하며 클래스 JFrame을 상속받는 클래스를 구현하여 테스트하는 프로그램을 작성하시오.

	- 윈도우의 가로와 세로가 각각 300, 200으로
	
	- 윈도우의 콘텐트 페인 색상을 Color.red로
	
	- 윈도우의 캡션 제목을 "프로그래밍 연습 1"로
	
	- 윈도우의 종료 버튼으로 프로그램도 함께 종료하도록


 
 */


import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class One extends JFrame{
	
	public final static long serialVersionUID = 1L;
	
	public One(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setTitle(title);
		Container pane = getContentPane();
		pane.setBackground(Color.RED);
		setVisible(true);
	}
	public static void main(String[]args) {
		One a = new One("프로그래밍 연습1");
		
	}

}
