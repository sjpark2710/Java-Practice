
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

class FirstMyFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private FirstMyFrame(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		setTitle(title);
		setVisible(true);
	}
	
	public void decorate() {
		Container pane = getContentPane();
		pane.setBackground(Color.YELLOW);
	}
	
}
public class FrameTest{
	public static void main(String[]args) {
		FirstMyFrame f = new FirstMyFrame("첫 윈도 프로그램!");
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
		};
		f.decorate();
	}
}
	


