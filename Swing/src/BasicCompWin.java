
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class BasicCompWin extends JFrame {
	
	private static final long serialVersionUID =1L;
	
	public BasicCompWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setTitle(title);
		
		JLabel lb = new JLabel("레이블의 글자");
		lb.setForeground(Color.orange);	//색상 수정
		lb.setHorizontalAlignment(SwingConstants.CENTER);	//가로 정렬 수정
		add(lb);
		setVisible(true);
			
	}
	public static void main(String[]args) {
		BasicCompWin cp = new BasicCompWin("레이블 알아보기");
	}

}
