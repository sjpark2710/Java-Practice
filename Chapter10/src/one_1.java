
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing. JFrame;
import javax.swing.JPanel;

public class one_1 extends JFrame implements ActionListener{
	
	JButton yellowBtn;
	JButton redBtn;
	JPanel p1;	//���� �ٲ�� panel
	JPanel p2;	//��ư�� ���� panel
	
	//������
	public one_1(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setTitle(title);
		
		ButtonAction();
		setVisible(true);
	}
	
	public static void main(String[]args) {
		one_1 c = new one_1("��ư �׼� �̺�Ʈ");
	}
	
	void ButtonAction() {
		yellowBtn = new JButton("���");
		redBtn = new JButton("����");
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		p2.setLayout(new GridLayout(0,2));
		p2.add(yellowBtn);
		p2.add(redBtn);
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		yellowBtn.addActionListener(this);
		redBtn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String btnStr = e.getActionCommand();
		if(btnStr.equals("���")) {
			p1.setBackground(Color.YELLOW);
		}
		else {
			p1.setBackground(Color.RED);
		}
	}
	
	

}
