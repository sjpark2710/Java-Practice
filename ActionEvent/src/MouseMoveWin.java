import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class MouseMoveWin extends JFrame{
	
	private static final long serialVERSIONUID = 1L;
	
	JLabel lb = new JLabel("Mouse Moved");
	
	public MouseMoveWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pn = new JPanel();
		pn.setLayout(null);
		pn.add(lb);
		pn.addMouseMotionListener(new MyMouseMotion());
		add(pn);
		setSize(300, 150);
		setVisible(true);
	}
	
	//class MyMouseMotion extends MouseAdapter
	class MyMouseMotion extends MouseMotionAdapter{
		//���콺 �̵��� ���� �̺�Ʈ ����
		public void mouseMoved(MouseEvent e) {
			lb.setOpaque(true);
			lb.setBackground(Color.yellow);
			lb.setText(e.getX() + "," + e.getY());
			
			//�۾��� ǥ�õ� ������ ũ�� ��ȯ
			Dimension d = lb.getPreferredSize();
			int width = (int)d.getWidth();
			int height = (int)d.getHeight();
			lb.setLocation(e.getX() - width, e.getY() - height);
		}
	}
	
	public static void main(String[]args) {
		new MouseMoveWin().setTitle("����͸� ����� �̺�Ʈ ó��");
	}
	

}
