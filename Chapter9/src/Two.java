
/*
 * 2. ���� ������ �����ϸ� Ŭ���� JFrame�� ��ӹ޴� Ŭ������ �����Ͽ� �׽�Ʈ�ϴ� ���α׷��� �ۼ��Ͻÿ�.

	- �������� ���ο� ���ΰ� ���� 300, 150����, �������� ����Ʈ���� ������ Color.lightGray��
	
	- �������� ĸ�� ������ "���α׷��� ���� 2"��
	
	- �������� ���� ��ư���� ���α׷��� �Բ� �����ϵ���
	
	- ��ܿ� "OK" ��ư�� �ϴܿ� "Cancel" ��ư �߰�, BorderLayout�� "North", "South"�̿�
	
	- �޼ҵ� setDefaultLookAndFeelDecorated(boolean)�� ���ڸ� true, false�� �Ͽ� ����� ��
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Two extends JFrame{
	private JButton btn1, btn2;
	public static final long serialVERSIONUID = 1L;
	
	public Two(String title) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setTitle(title);
		setBackground(Color.lightGray);
		
		setLayout(new BorderLayout());
		btn1 = new JButton("OK");
		btn2 = new JButton("CALCEL");
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);
		
		setDefaultLookAndFeelDecorated(true);
		
		setVisible(true);
	}
	
	public static void main(String[]args) {
		Two t=new Two("���α׷��� ���� 2");
	}

}
