import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;


public class Three extends JFrame {
	Point p1 = new Point(0,0); // 시작점
	Point p2 = new Point(0,0);; // 끝점
	
	public Three(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setTitle(title);
		addMouseListener(new Mouse()); // 모션리스너 등록
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
		Three c = new Three("마우스를 누르고 이동한 후 놓아 보세요.");
	}
	class Point{ // int값 x, y를 가지는 클래스 
		int x;
		int y ;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}
	class Mouse extends MouseAdapter{
		public void mousePressed(MouseEvent e) { // 드래그 시작
			p1 = new Point(e.getX(),e.getY()); // 시작 점 저장
		}
		public void mouseReleased(MouseEvent e) { // 드래그 끝
			p2 = new Point(e.getX(),e.getY()); // 끝 점 저장
			repaint();
		}
	}
}