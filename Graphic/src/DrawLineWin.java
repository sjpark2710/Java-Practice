import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DrawLineWin extends JFrame{
	private static final long serialVERSIONUID = 1L;
	
	public DrawLineWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		//getContentPane
		Container win = getContentPane();
		//�����츦 �����ϴ� ����Ʈ ������ ũ�⸦ ��ȯ
		Dimension d = win.getSize();
		int clientWidth = d.width;		//���� ũ��
		int clientHeight = d.height;	//���� ũ��
		
		int incHeight = (clientHeight-10) / 12
;
		for(int i = 0 ; i < 13; i ++) {
			switch(i) {
			case 0 : g.setColor(Color.black);break;
			case 1 : g.setColor(Color.blue);break;
			case 2 : g.setColor(Color.cyan);break;
			case 3 : g.setColor(Color.darkGray);break;
			case 4 : g.setColor(Color.gray);break;
			case 5 : g.setColor(Color.green);break;
			case 6 : g.setColor(Color.lightGray);break;
			case 7 : g.setColor(Color.magenta);break;
			case 8 : g.setColor(Color.orange);break;
			case 9 : g.setColor(Color.pink);break;
			case 10 : g.setColor(Color.red);break;
			case 11: g.setColor(Color.white);break;
			case 12 : g.setColor(Color.yellow);break;
			}
			g.drawLine(10,  40 + i*incHeight,  clientWidth + 5,  40 + i*incHeight);
		}
		
		//draw polyline
		g.setColor(Color.blue);
		int[] xAry = {10, clientWidth/2, clientWidth/2, clientWidth + 5};
		int[] yAry = {30 + clientHeight/2, 30, clientHeight + 30, 30 + clientHeight/2};
		g.drawPolyline(xAry, yAry, 4);
	}
	public static void main(String[]args) {
		new DrawLineWin().setTitle("���� ���� �׸���");
	}

}
