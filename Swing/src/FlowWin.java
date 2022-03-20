
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;


public class FlowWin  extends JFrame{
	
	private static final long serialVersionULD = 1L;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public FlowWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setTitle(title);
		
		//setLayout(new FlowLayout());
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10,20));
		btn1 = new JButton("버튼 1");
		btn2 = new JButton("버튼 2");
		btn3 = new JButton("버튼 3");
		btn4 = new JButton("버튼 4");
		btn5 = new JButton("버튼 5");
		
		add(btn1); add(btn2); add(btn3); add(btn4); add(btn5);
		setVisible(true);
		
		
	}
	
	public static void main(String[]args) {
		FlowWin win = new FlowWin("FlowLayout 윈도우");
	}

}
