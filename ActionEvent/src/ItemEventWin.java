
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class ItemEventWin extends JFrame implements ItemListener{
	
	private static final long serialVERSIONUID = 1L;
	
	JPanel pCheck = new JPanel(); //üũ�ڽ��� ��ġ�� �г�
	JTextArea txtArea = new JTextArea();
	JLabel status = new JLabel("�޴� ����");
	
	public ItemEventWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 200);
		
		makeCheckBox();
		makeMenuAndEventHandle();
		add(pCheck, "North");
		add(txtArea, "Center");
		add(status, "South");
		setVisible(true);
	}
	
	public void makeCheckBox() {
		JCheckBox box1 = new JCheckBox("����");
		JCheckBox box2 = new JCheckBox("����");
		JCheckBox box3 = new JCheckBox("�౸");
		JCheckBox box4 = new JCheckBox("�߱�");
		
		box1.addItemListener(this); 
		box2.addItemListener(this);
		box3.addItemListener(this);
		box4.addItemListener(this);
		
		pCheck.add(box1);
		pCheck.add(box2);
		pCheck.add(box3);
		pCheck.add(box4);
	}
	
	public void makeMenuAndEventHandle() {
		JMenuBar mBar = new JMenuBar();
		JMenu mainMenu = new JMenu("����");
		JMenu subMenu = new JMenu("��Ƽ�̵��");
		JCheckBoxMenuItem subCheck1 = new JCheckBoxMenuItem("����");
		JCheckBoxMenuItem subCheck2 = new JCheckBoxMenuItem("�̹���");
		subMenu.add(subCheck1);
		subMenu.add(subCheck2);
		subCheck1.addItemListener(this);
		subCheck2.addItemListener(this);
		
		mainMenu.add(subMenu);
		mBar.add(mainMenu);
		setJMenuBar(mBar);
		
		
		
	}
	
	public void iTemStateChanged(ItemEvent evt) {
		String str = ((AbstractButton) evt.getItem()).getText();
		if(evt.getStateChange() == ItemEvent.DESELECTED) 
			str += " ����\n";
		else 
			str += " ����\n";
		status.setText(str);
		txtArea.append(str);
	}
	
	public static void main(String[]args) {
		ItemEventWin myWin = new ItemEventWin();
		myWin.setTitle("�������̺�Ʈ ó��");
	}

}
