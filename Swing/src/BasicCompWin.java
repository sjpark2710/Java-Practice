
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
		
		JLabel lb = new JLabel("���̺��� ����");
		lb.setForeground(Color.orange);	//���� ����
		lb.setHorizontalAlignment(SwingConstants.CENTER);	//���� ���� ����
		add(lb);
		setVisible(true);
			
	}
	public static void main(String[]args) {
		BasicCompWin cp = new BasicCompWin("���̺� �˾ƺ���");
	}

}
