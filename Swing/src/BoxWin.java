
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JButton;


public class BoxWin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public BoxWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 180);
		setTitle(title);
		
		Container cp = getContentPane();
		
		cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		btn1 = new JButton("버튼 1");
		btn2 = new JButton("Button2");
		btn3 = new JButton("BoxLayout 3");
		btn4 = new JButton("BoxLayout.X_AXIS 4");
		btn5 = new JButton("BoxLayout.Y_AXIS 5");
		
		add(btn1); add(btn2); add(btn3); add(btn4); add(btn5);
		setVisible(true);
	}
	
	
	public static void main(String[]args) {
		BoxWin bx = new BoxWin("BoxWin  윈도우");
		
	}
	
	
	

}
