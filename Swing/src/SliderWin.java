
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;


public class SliderWin extends JFrame{
	public static final long serialVersionUID = 1L;
	
	public SliderWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setTitle(title);
		
		//�г� ������ �޼ҵ� ȣ��
		makeSlider();
		setVisible(true);
		
	}
		
		public void makeSlider() {
			//JSlider�� ��ü(����, 0���� 100�����̸� �ʱ� ������ ����� 50 ���� ����)�� ����
			JSlider sdr = new JSlider();
			
			//JSlider�� ��ü(����, 0���� 50�����Ӹ� �ʱ� ������ 10����) ����
			JSlider hSdr = new JSlider(0, 50, 10);
			
			//JSlider�� �� ���� �׸��� ����
			hSdr.setPaintTicks(true);
			
			//JSlider�� �� ���� ���� ����
			hSdr.setMajorTickSpacing(10);
			
			//JSlider�� �� ���� ���� ���̱� ����
			hSdr.setPaintLabels(true);
			
			JPanel p = new JPanel();
			
			p.setLayout(new GridLayout(0, 1));
			p.add(sdr); p.add(hSdr);
			
			//JSlider�� ��ü(����, 0���� 200�����̸� �ʱ� ������ 20����)����
			JSlider sdr1 = new JSlider(JSlider.HORIZONTAL, 0,200,20);
			sdr1.setPaintTicks(true);
			sdr1.setPaintTrack(true);			//JSlider�� Ʈ�� �׸��� ����
			sdr1.setMajorTickSpacing(50);		//JSlider�� �� ���� ���� ����
			sdr1.setMinorTickSpacing(10);		//JSlider�� �� ���� ���� ����
			sdr1.setPaintLabels(true);			//JSlider�� �� ���� ���� ���̱� ����
			sdr1.setForeground(Color.blue);		//JSlider�� ���ݰ� ������ ���� ����
			
			//JSlider�� ��ü(����, 0���� 100�����̸� �ʱ� ������ 20����)����
			JSlider vSdr = new JSlider(JSlider.VERTICAL, 0, 80, 30);
			vSdr.setPaintTicks(true);
			vSdr.setPaintTrack(false);
			vSdr.setMajorTickSpacing(40);
			vSdr.setMinorTickSpacing(20);
			vSdr.setPaintLabels(true);
			vSdr.setValue(30);
			vSdr.setForeground(Color.red);
			
			//JTabbedPane�� �����Ͽ� �������� ����
			JTabbedPane tp = new JTabbedPane();
			
			//'�����̴�'�̸����� ��ü p�� �߰��� ���� ����
			tp.add("�����̴�", p);
			
			//'���� �����̴�'�̸����� ��ü vSdr�� �߰��� ���� ����
			tp.addTab("���� �����̴�", vSdr);
			
			
			// ù ��° ���� ������ ����
			tp.setTabComponentAt(0, new JLabel("���� �����̴� 1"));
			
			//�� ���� ������ ���ο� ���� �߰��Ͽ�, "���� �����̴�"�� �� ǳ������ ǥ��
			tp.insertTab("���� �����̴� 2",null, sdr1, "���� �����̴�", 1);
			
			add(tp);

		
	}
		public static void main(String[]args) {
			SliderWin win = new SliderWin("�����̴��� ��");
		}

}
