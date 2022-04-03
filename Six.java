
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;


public class Six extends JFrame implements MouseMotionListener{

	private static final long serialVersionUID = 1L;
	Point p = new Point(0,0); //
	public Six(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setTitle(title);
		addMouseMotionListener(this);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) { 
		g.drawString("*", p.x, p.y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Six c = new Six("���콺�� ������ �۾��� �� ������.");
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		p = new Point(e.getX(), e.getY());
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	class Point{ // int�� x, y�� ������ Ŭ���� 
		int x;
		int y ;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}
}