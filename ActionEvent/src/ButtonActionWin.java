
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.GridLayout;


public class ButtonActionWin extends JFrame implements ActionListener{ 

	private static final long serialVERSIONUID = 1L;
	
	JButton btnOk = new JButton("OK");
	JButton btnCancel = new JButton("Cancel");
	JLabel dlb = new JLabel("Ŭ���� ��ư�� ������ �������ϴ�");
	
	public ButtonActionWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 130);
		
		//������ ������ ��ư�� �̺�Ʈ ������ �߰�
		makeButtonAndEventHandle();
		setVisible(true);
	}
	
	public void makeButtonAndEventHandle() {
		JPanel p = new JPanel(new GridLayout(0,2));
		p.add(btnOk);
		p.add(btnCancel);
		add(p, BorderLayout.CENTER);
		add(dlb, BorderLayout.SOUTH);
		
		//2�� ��ư�� �̺�Ʈ ó���� ���� �����ʸ� �߰�
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt) {
		//Ŭ���� ��ư�� �̸��� ����
		String strCmd = evt.getActionCommand();
		
		//���̺� Ŭ���� ��ư�� �̸��� ����
		if(strCmd.equals("OK")) {
			dlb.setText("OK Button");
		}else if(strCmd.equals("Cancel")) {
			dlb.setText("Cancel Button");
		}
	}
	
	public static void main(String[]args) {
		ButtonActionWin mywin = new ButtonActionWin();
		mywin.setTitle("��ư �׼� �̺�Ʈ ó��");
	}





}
