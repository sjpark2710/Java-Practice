
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JButton;




public class NoneLayoutWin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JButton btn1, btn2;
	
	public NoneLayoutWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(340, 180);
		setTitle(title);
		
		btn1 = new JButton("ok");
		btn2 = new JButton("Cancel");
		Dimension d = btn1.getPreferredSize();    //버튼의 적당한 가로아 세로를 알아보기
		btn1.setSize(d);	//버튼의 적당한 크기로 지정
		
		//btn1.setSize(100, 30); //버튼의 가로와 세로를 각 각 100, 30으로 지정
		btn2.setSize(100, 30);
		
		//btn1.setLocation(0, 0);	
		btn1.setLocation(50, 100);//버튼의 좌측상단 위치 (x,y)를 각 각 50, 100으로지정
		btn2.setLocation(170, 100);
		
		setLayout(null);
		add(btn1);
		add(btn2);
		setVisible(true);
		
		
	}
	
	public static void main(String[]args) {
		NoneLayoutWin win = new NoneLayoutWin("배치 관리자가 없는 윈도우");
	}

}
