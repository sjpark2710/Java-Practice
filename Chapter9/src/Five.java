
/*
 * 5. 프레임에 설정되어 있는 기본 배치관리자를 사용하고, 다음 조건을 만족하는 클래스를 구현하여 테스트하는 프로그램을 작성하시오.

		- 윈도 상단의 버튼 4개를 패널에 삽입하여 프레임 북쪽에 삽입
		
		* 패널은 배치관리 1행 4열 GridLayout으로 지정
		
		- 윈도 하단의 버튼 3개는 다음과 같은 모습이 되도록 패널을 적절히 이용하여 삽입한 후, 프레임 남쪽에 삽입
		
		* 패널은 배치관리 1행 2열 GridLayout으로 지정하여, 버튼 "전화걸기"와 다시 버튼 "이전", "지우기" 2개가 삽입된 패널을 삽입
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Five extends JFrame{
	
	public Five(String title) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(400, 200);
		setTitle(title);
		
		setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(1,4));
		northPanel.add(new JButton("키패드"));
		northPanel.add(new JButton("최근기록"));
		northPanel.add(new JButton("즐겨찾기"));
		northPanel.add(new JButton("연락처"));
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,2));
		
		JPanel southSubPanel = new JPanel();
		southSubPanel.setLayout(new GridLayout(1,2));
		southSubPanel.add(new JButton("이전"));
		southSubPanel.add(new JButton("즐겨찾기"));
		
		southPanel.add(new JButton("키패드"));
		southPanel.add(southSubPanel);
		
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
		
		
		
		
	}
	public static void main(String[]args) {
		Five f = new Five("다이얼 패드를 위한 기본 버튼");
	}

}
