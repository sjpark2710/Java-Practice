
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JPanel;


public class ListWin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public ListWin (String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setTitle(title);
		
		//�پ��� ��� ������ �޼ҵ� ȣ��
		makeList();
		setVisible(true);
	}
	
	public void makeList() {
		//JList ��Ͽ� �Էµ� �ȵ���̵� ������ �ڵ� �̸� ���ڿ�
		String code[] = {"Cupcake 1.5", "Donut 1.6", "Eclair 2.0", "Froyo 2.2" , "Gingerbread 2.3",
				"HoneyComb 3.0", "Icecream Sandwich 4.0" , "Jelly Bean 4.2"};
		
		//JList ��Ͽ� �ԷµǴ� �׸��� ���ڿ��̹Ƿ� JList<String>���� ����
		JList<String> lst = new JList<String>(code);
		JPanel pan1 = new JPanel();
		pan1.add(lst);
		
		//JList ��Ͽ� �Էµ� ���� ���� ��Ű�� ���ڿ�
		String swing[] = {"javax.accesibility", "javax.swing"};
		JList<String> pkg = new JList<String>(swing);
		//JList ����� ��ũ������ ����ϹǷ� ���̴� �׸� �� �� ����
		pkg.setVisibleRowCount(2);
		
		//JList ��� ��ü�� ���ڷ� ��ũ�� ���� ����
		JScrollPane sp = new JScrollPane(pkg);
		
		//��ũ�� ���ο��� �׸� ���� ������ ��ũ�� �ٰ� �����ǵ���
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		//JCombox ��Ͽ� �Էµ� ������ �ø��� �̸� ���ڿ�
		String ph[] = {"Galaxy s", "Galaxy s2", "Galsxy note"};
		JComboBox<String> cb = new JComboBox<String>(ph);
		
		//JComboBox ��Ͽ� ������ �׸��� �����ϴ� ���
		cb.addItem(new String("Galaxy Note2"));
		
		//JComboBox �ʵ带 ���� �����ϵ��� �ϴ� ���
		cb.setEditable(true);
		
		
		//JComboBox ��� �߿��� 3��° �׸��� �����ϴ� ���
		cb.setSelectedIndex(2);
		
		JPanel pan2 = new JPanel();
		pan2.add(sp);
		pan2.add(cb);
		
		//�г��� ��ġ������ ���η� �̵���ϱ� ���� GridLayout ����
		JPanel p = new JPanel(new GridLayout(1,2));
		p.add(pan1);
		p.add(pan2);
		
		//�������� �⺻ ��ġ�� BorderLayout�̸� add�� �߾ӿ� ����
		add(p);
	
	}
	
	public static void main(String[]args) {
		ListWin win = new ListWin("��� ������ ���� ��Ʈ��");
	}
	
}
