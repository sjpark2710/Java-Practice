
import java.awt.Color;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ComponentWin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public ComponentWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setTitle(title);
		Container pane = getContentPane();
		pane.setBackground(Color.pink);
		setVisible(true);
	}	
	
	public void addButton() {
		JButton btn = new JButton("ù ��ư");
		add(btn);
		setVisible(true);
	}
	
	public static void main(String[]args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		ComponentWin f = new ComponentWin("ù ��ư ���α׷�");
		
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {};
		
		f.addButton();
	}

}
