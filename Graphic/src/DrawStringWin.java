
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;


public class DrawStringWin extends JFrame{
	private static final long serialVERSIONUID = 1L;
	
	public DrawStringWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		//�����츦 �����ϴ� ����Ʈ ������ ũ�⸦ ��ȯ
		Dimension d = getSize();
		//�׷����� ������ ����
		g.setColor(new Color(255, 90, 180));
		g.drawString("�ڹ� �׷��� ���α׷���",d.width/3, 2*d.height/3);
	}
	
	public static void main(String[]args) {
		new DrawStringWin().setTitle("���ڿ� �׸���");
	}

}
