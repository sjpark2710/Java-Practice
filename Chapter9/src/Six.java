
/*
 * 6. 프레임에 설정되어 있는 기본 배치관리자를 사용하고, 위 5번 문제를 확장하며, 다음 조건을 만족하는 클래스를 구현하여 테스트하는 프로그램을 작성하시오.

	- 5번에 구현한 프레임의 중앙에 다음 윈도와 같이 텍스트필드와 12개의 버튼을 구성
	
	- 윈도 중앙에 다음 패널 하나를 구성하여 삽입
	
	* 패널은 배치관리 BorderLayout을 지정하여 북쪽에 텍스트필드를 삽입하고 중아에 버튼 12개가 삽입된 패널을 삽입
 */


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Six extends JFrame{
	
	public Six(String title) {
		setSize(400, 350);
		setTitle(title);
		
		setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(1,4));
		northPanel.add(new JButton("키패드"));
		northPanel.add(new JButton("최근기록"));
		northPanel.add(new JButton("즐겨찾기"));
		northPanel.add(new JButton("연락처"));
		
		JPanel centerPanel = new JPanel(); // 가운데 부분 패널
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(new TextField(),BorderLayout.NORTH); // 북쪽에 텍스트 필드 추가
		
		JPanel centerSubPanel = new JPanel();
		centerSubPanel.setLayout(new GridLayout(4, 3));
		for(int i=1;i<=9;i++) {
			centerSubPanel.add(new JButton(i+""));
		}
		centerSubPanel.add(new JButton("*"));
		centerSubPanel.add(new JButton("0"));
		centerSubPanel.add(new JButton("#"));
		centerPanel.add(centerSubPanel,BorderLayout.CENTER);
		
		
		JPanel southPanel = new JPanel(); // 밑부분 패널
		southPanel.setLayout(new GridLayout(1, 2));
		JPanel southSubPanel = new JPanel();
		southSubPanel.setLayout(new GridLayout(1, 2));
		southSubPanel.add(new JButton("이전"));
		southSubPanel.add(new JButton("즐겨찾기"));
		

		southPanel.add(new JButton("키패드"));
		southPanel.add(southSubPanel);
		
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		add(centerPanel, BorderLayout.CENTER);
		setVisible(true);
		
		
	}
	
	public static void main(String[]args) {
		Six s = new Six("다이얼 패드");
	}

}
