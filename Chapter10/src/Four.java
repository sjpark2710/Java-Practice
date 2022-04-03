import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;


public class Four extends JFrame implements MouseInputListener{
	private static final long serialVersionUID = 1L;
	Point p1 = new Point(0,0); // ������
	Point p2 = new Point(0,0);; // ����
	public Four(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setTitle(title);
		addMouseMotionListener(this); // ��Ǹ����� ���
		addMouseListener(this);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four c = new Four("���콺�� ������ �̵��� �� ���� ������.");
	}
	class Point{ // int�� x, y�� ������ Ŭ���� 
		int x;
		int y ;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}
	@Override
	public void paint(Graphics g) { 
		super.paint(g);
		g.setColor(Color.magenta);
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		getGraphics().clearRect(0, 0, 500, 200); // ȭ�� �ʱ�ȭ
		p1 = new Point(e.getX(),e.getY()); // ���� �� ����
		setTitle("������ : ("+e.getX()+", "+e.getY()+")");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		setTitle("���� : ("+e.getX()+", "+e.getY()+")");
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		setTitle("�߰��� : ("+e.getX()+", "+e.getY()+")");
		p2 = new Point(e.getX(),e.getY()); // �߰� �� ����
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
