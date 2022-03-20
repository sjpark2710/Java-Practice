
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JButton;




public class NoneLayoutWin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JButton btn1, btn2;
	
	public NoneLayoutWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(340, 180);
		setTitle(title);
		
		btn1 = new JButton("ok");
		btn2 = new JButton("Cancel");
		Dimension d = btn1.getPreferredSize();    //��ư�� ������ ���ξ� ���θ� �˾ƺ���
		btn1.setSize(d);	//��ư�� ������ ũ��� ����
		
		//btn1.setSize(100, 30); //��ư�� ���ο� ���θ� �� �� 100, 30���� ����
		btn2.setSize(100, 30);
		
		//btn1.setLocation(0, 0);	
		btn1.setLocation(50, 100);//��ư�� ������� ��ġ (x,y)�� �� �� 50, 100��������
		btn2.setLocation(170, 100);
		
		setLayout(null);
		add(btn1);
		add(btn2);
		setVisible(true);
		
		
	}
	
	public static void main(String[]args) {
		NoneLayoutWin win = new NoneLayoutWin("��ġ �����ڰ� ���� ������");
	}

}
