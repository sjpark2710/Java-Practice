
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelWin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public PanelWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setTitle(title);
		
		//�г� ������ �޼ҵ� ȣ��
		makePanel();
		setVisible(true);
	}
	
	public void makePanel() {
		JPanel pan1 = new JPanel();
		pan1.setBackground(Color.red);
		JPanel pan2 = new JPanel();
		pan2.setBackground(Color.yellow);
		
		//�г��� �⺻ ��ġ�� FlowLayout�̸� add��, �⺻ ������ �߾�
		//�г��� ��ġ ������ ���η� �̵�� �ϱ� ���� GridLayout ����
		JPanel p = new JPanel(new GridLayout(1,2));
		p.add(pan1);
		p.add(pan2);
		
		add(p);
	}
	
	public static void main(String[]args) {
		PanelWin win = new PanelWin("�г� �˾ƺ���");
	}
	
	

}
