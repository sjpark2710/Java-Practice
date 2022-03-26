import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;


public class MouseEventWin extends JFrame{
	private static final long serialVERSIONUID = 1L;
	MouseEventWin childWin = null;
	static int countChild;
	
	public MouseEventWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 150);
		setVisible(true);
		//register mouse event handler, motion event handler
		addMouseListener(new MyMouseListener());
	}
	
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			Rectangle bounds = getBounds();
			int x = e.getX() + bounds.x;
			int y = e.getY() + bounds.y;
			
			if(childWin == null) {
				childWin = new MouseEventWin();
			}
			childWin.setLocation(x,y);
			childWin.setTitle(++countChild + "��° �ڽ� ������");
			childWin.setSize(getSize().width * 2/ 3, getSize().height * 2 / 3);
			childWin.setVisible(true); 
			
			//register mouse event handler, motion event handler
			addMouseListener(new MyMouseListener());
		}
		
		public void mouseReleased(MouseEvent e) {
			if(childWin != null) childWin.setVisible(false);
		}
		
		//ó������ �ʴ� �̺�Ʈ�� ���� �޼ҵ嵵 ��� ���� ���� �ʿ�
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseExited(MouseEvent e) {
		}
		public void mouseClicked(MouseEvent e) {
		}
	}
	
	public static void main(String[]args) {
		MouseEventWin myWin = new MouseEventWin();
		myWin.setTitle("���콺�� �������� : ");
	}

}
