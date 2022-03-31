
import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import javax.swing.*;
import java.util.Vector;

public class ContainerEventWin extends JFrame implements ContainerListener, ActionListener{
	
	private static final long serialVERSIONUID = 1L;
	
	JButton btnAdd = new JButton("Add button");
	JButton btnRemove = new JButton("Remove button");
	JLabel lbl = new JLabel();
	JPanel p1 = new JPanel();
	JButton recentBtn;//���� �ֱٿ� ���� �Ǵ� �����Ǵ� ��ư
	int btnCount = 0;
	
	Vector<JButton> aryBtn = new Vector<JButton>();
	
	public ContainerEventWin() {
		JPanel p2 = new JPanel(new GridLayout(0,2));
		p2.add(btnAdd);
		p2.add(btnRemove);
		
		add(lbl, BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		
		//��ư�� �߰��Ǵ� �г��� �����̳� ������ ���
		p1.addContainerListener(this);
		
		//��ư�� �׼� ������ ���
		btnAdd.addActionListener(this);
		btnRemove.addActionListener(this);
		setSize(300, 200);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent evt) {
		String strBtn = evt.getActionCommand();
		if(strBtn.equals("Add button")) {
			recentBtn = new JButton ("button" + (++btnCount));
			recentBtn.setName("button" + btnCount);
			recentBtn.addActionListener(this);
			p1.add(recentBtn);
			aryBtn.addElement(recentBtn);
		}else if(strBtn.equals("Remove button")) {
			if(!aryBtn.isEmpty()) {
				recentBtn = (JButton)aryBtn.lastElement();
				aryBtn.removeElementAt(--btnCount);
				p1.remove(recentBtn);
				update(getGraphics());
			}
		}
		
	}
	
	public void componentAdded(ContainerEvent evt) {
		String str = "��" + btnCount + "�� : " + evt.getChild().getName() + "added";
		lbl.setText(str);
	}
	
	public void componentRemoved(ContainerEvent evt) {
		String str = "��" + btnCount + "�� : " + evt.getChild().getName() + "removed";
		lbl.setText(str);
	}
	
	public static void main(String[]args) {
		ContainerEventWin myWin = new ContainerEventWin();
		myWin.setTitle("Container event handle");
	}
	
	
	
	

}
