import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;


public class Three extends JFrame {
	Point p1 = new Point(0,0); // ������
	Point p2 = new Point(0,0);; // ����
	
	public Three(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setTitle(title);
		addMouseListener(new Mouse()); // ��Ǹ����� ���
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.magenta);
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
	}
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three c = new Three("���콺�� ������ �̵��� �� ���� ������.");
	}
	class Point{ // int�� x, y�� ������ Ŭ���� 
		int x;
		int y ;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}
	class Mouse extends MouseAdapter{
		public void mousePressed(MouseEvent e) { // �巡�� ����
			p1 = new Point(e.getX(),e.getY()); // ���� �� ����
		}
		public void mouseReleased(MouseEvent e) { // �巡�� ��
			p2 = new Point(e.getX(),e.getY()); // �� �� ����
			repaint();
		}
	}
}