
/*
 * 1. ���� ������ �����ϸ� Ŭ���� JFrame�� ��ӹ޴� Ŭ������ �����Ͽ� �׽�Ʈ�ϴ� ���α׷��� �ۼ��Ͻÿ�.

	- �������� ���ο� ���ΰ� ���� 300, 200����
	
	- �������� ����Ʈ ���� ������ Color.red��
	
	- �������� ĸ�� ������ "���α׷��� ���� 1"��
	
	- �������� ���� ��ư���� ���α׷��� �Բ� �����ϵ���


 
 */


import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class One extends JFrame{
	
	public final static long serialVersionUID = 1L;
	
	public One(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setTitle(title);
		Container pane = getContentPane();
		pane.setBackground(Color.RED);
		setVisible(true);
	}
	public static void main(String[]args) {
		One a = new One("���α׷��� ����1");
		
	}

}
