
/*
 * 5. �����ӿ� �����Ǿ� �ִ� �⺻ ��ġ�����ڸ� ����ϰ�, ���� ������ �����ϴ� Ŭ������ �����Ͽ� �׽�Ʈ�ϴ� ���α׷��� �ۼ��Ͻÿ�.

		- ���� ����� ��ư 4���� �гο� �����Ͽ� ������ ���ʿ� ����
		
		* �г��� ��ġ���� 1�� 4�� GridLayout���� ����
		
		- ���� �ϴ��� ��ư 3���� ������ ���� ����� �ǵ��� �г��� ������ �̿��Ͽ� ������ ��, ������ ���ʿ� ����
		
		* �г��� ��ġ���� 1�� 2�� GridLayout���� �����Ͽ�, ��ư "��ȭ�ɱ�"�� �ٽ� ��ư "����", "�����" 2���� ���Ե� �г��� ����
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Five extends JFrame{
	
	public Five(String title) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(400, 200);
		setTitle(title);
		
		setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(1,4));
		northPanel.add(new JButton("Ű�е�"));
		northPanel.add(new JButton("�ֱٱ��"));
		northPanel.add(new JButton("���ã��"));
		northPanel.add(new JButton("����ó"));
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,2));
		
		JPanel southSubPanel = new JPanel();
		southSubPanel.setLayout(new GridLayout(1,2));
		southSubPanel.add(new JButton("����"));
		southSubPanel.add(new JButton("���ã��"));
		
		southPanel.add(new JButton("Ű�е�"));
		southPanel.add(southSubPanel);
		
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
		
		
		
		
	}
	public static void main(String[]args) {
		Five f = new Five("���̾� �е带 ���� �⺻ ��ư");
	}

}
