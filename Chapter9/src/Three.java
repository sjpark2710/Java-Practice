
/*
 * 3. �����ӿ� �����Ǿ� �ִ� �⺻ ��ġ�����ڸ� ����ϰ�, ���� ������ �����ϴ� Ŭ������ �����Ͽ� �׽�Ʈ�ϴ� ���α׷��� �ۼ��Ͻÿ�.

		- ������ ���� 3���� ���̺�(JLabel)�� ��ġ�ǵ���
		
		- 3���� ���̺� ������ ������ ������ �ǵ���
		
		* ���̺��� ������ ǥ�õǷ��� setOpaque(true)�� ȣ���ϵ���
		
				���̺�ü.setOpaque(true);
				
				���̺�ü.setBackground(Color.YELLOW);
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Three extends JFrame{
	private JLabel yellowJLabel, orangeJLabel, blueJLabel;
	public static final long serialVERSIONUID = 1L;
	
	public Three(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(375, 200);	//���� 350, ���� 150+����
		setTitle(title);
		
		yellowJLabel = new JLabel("yellow");
		yellowJLabel.setBackground(Color.yellow);
		yellowJLabel.setOpaque(true);
		yellowJLabel.setPreferredSize(new Dimension(50, 100));	//ũ�� ����
		
		orangeJLabel = new JLabel("orange");
		orangeJLabel.setBackground(Color.orange);
		orangeJLabel.setOpaque(true);
		orangeJLabel.setPreferredSize(new Dimension (300, 80)); //ũ�� ����
		
		blueJLabel = new JLabel("blue");
		blueJLabel.setBackground(Color.blue);
		blueJLabel.setOpaque(true);
		blueJLabel.setPreferredSize(new Dimension(350, 50));  //ũ�� ����
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));
		
		add(yellowJLabel); 
		add(orangeJLabel);
		add(blueJLabel);
		
		
		setVisible(true);
		
		
	}
	
	public static void main(String[]args) {
		Three three = new Three("���α׷��� ���� 3");
	}

}
