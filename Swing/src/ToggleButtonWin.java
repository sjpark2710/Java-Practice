
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ToggleButtonWin extends JFrame{
	
	private static final long serialVersionUID =1L;
	
	JPanel pCheck = new JPanel();	//üũ�ڽ��� ��ġ�� �г�
	JPanel pRadio = new JPanel();	//���̵� ��ư�� ��ġ�� �г�
	
	public ToggleButtonWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 150);
		setTitle(title);
		
		//üũ�ڽ��� ���� ��ư�� ����
		makeCheckBox();
		makeRadioButton();
		
		//�������� ���̸� �̵���Ͽ� ���� üũ�ڽ�, �Ʒ��� ���� ��ư ����
		setLayout(new GridLayout(0, 1));
		add(pCheck);
		add(pRadio);
		setVisible(true);
	}
	
	public void makeCheckBox() {
		//�г��� �⺻ ��ġ�� FlowLayout�̸� add�� �⺻ ������ �߾�
		//�г� ������ �����Ͽ� ���� ��ư�� ����
		pCheck.setBackground(Color.yellow);
		JCheckBox box = new JCheckBox("����");
		pCheck.add(box);
		pCheck.add(new JCheckBox("����"));
		pCheck.add(new JCheckBox("����"));
		pCheck.add(new JCheckBox("�౸"));
		pCheck.add(new JCheckBox("�߱�"));
	}
	
	public void makeRadioButton() {
		//3���� ���� ��ư ����
		JRadioButton r1 = new JRadioButton("First Class");
		JRadioButton r2 = new JRadioButton("Business Class", true);
		JRadioButton r3 = new JRadioButton("Economy Class");
		
		//3���� �߿����� �ϳ����� ���õǵ��� ��ư �׷쿡 ����
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1); bg.add(r2);bg.add(r3);
		
		//�г� ������ �����Ͽ� ���� ��ư�� ����
		pRadio.setBackground(Color.cyan);
		pRadio.add(r3); pRadio.add(r2); pRadio.add(r1);
	}
	
	public static void main(String[]args) {
		ToggleButtonWin win = new ToggleButtonWin("�г� �˾ƺ���");
	}

}
