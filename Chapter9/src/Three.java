
/*
 * 3. 프레임에 설정되어 있는 기본 배치관리자를 사용하고, 다음 조건을 만족하는 클래스를 구현하여 테스트하는 프로그램을 작성하시오.

		- 다음과 같이 3개의 레이블(JLabel)이 배치되도록
		
		- 3개의 레이블에 지정된 색상이 배경색이 되도록
		
		* 레이블의 배경색이 표시되려면 setOpaque(true)를 호출하도록
		
				레이블객체.setOpaque(true);
				
				레이블객체.setBackground(Color.YELLOW);
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Three extends JFrame{
	private JLabel yellowJLabel, orangeJLabel, blueJLabel;
	public static final long serialVERSIONUID = 1L;
	
	public Three(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(375, 200);	//가로 350, 세로 150+여유
		setTitle(title);
		
		yellowJLabel = new JLabel("yellow");
		yellowJLabel.setBackground(Color.yellow);
		yellowJLabel.setOpaque(true);
		yellowJLabel.setPreferredSize(new Dimension(50, 100));	//크기 변경
		
		orangeJLabel = new JLabel("orange");
		orangeJLabel.setBackground(Color.orange);
		orangeJLabel.setOpaque(true);
		orangeJLabel.setPreferredSize(new Dimension (300, 80)); //크기 변경
		
		blueJLabel = new JLabel("blue");
		blueJLabel.setBackground(Color.blue);
		blueJLabel.setOpaque(true);
		blueJLabel.setPreferredSize(new Dimension(350, 50));  //크기 변경
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));
		
		add(yellowJLabel); 
		add(orangeJLabel);
		add(blueJLabel);
		
		
		setVisible(true);
		
		
	}
	
	public static void main(String[]args) {
		Three three = new Three("프로그래밍 연습 3");
	}

}
