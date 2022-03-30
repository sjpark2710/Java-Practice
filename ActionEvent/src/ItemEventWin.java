
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
	
	JPanel pCheck = new JPanel(); //체크박스가 배치될 패널
	JTextArea txtArea = new JTextArea();
	JLabel status = new JLabel("메뉴 상태");
	
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
		JCheckBox box1 = new JCheckBox("수영");
		JCheckBox box2 = new JCheckBox("골프");
		JCheckBox box3 = new JCheckBox("축구");
		JCheckBox box4 = new JCheckBox("야구");
		
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
		JMenu mainMenu = new JMenu("파일");
		JMenu subMenu = new JMenu("멀티미디어");
		JCheckBoxMenuItem subCheck1 = new JCheckBoxMenuItem("비디오");
		JCheckBoxMenuItem subCheck2 = new JCheckBoxMenuItem("이미지");
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
			str += " 비선택\n";
		else 
			str += " 선택\n";
		status.setText(str);
		txtArea.append(str);
	}
	
	public static void main(String[]args) {
		ItemEventWin myWin = new ItemEventWin();
		myWin.setTitle("아이템이벤트 처리");
	}

}
