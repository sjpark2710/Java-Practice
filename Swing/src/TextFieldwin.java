
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TextFieldwin extends JFrame{
	public static final long serialVersionUID = 1L;
	
	public TextFieldwin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 240);
		setTitle(title);
		
		//üũ�ڽ� ������ �޼ҵ� ȣ��
		makeTextField();
		setVisible(true);
	
	
	}
	
	public void makeTextField() {
		JPanel pL = new JPanel();
		pL.setLayout(new GridLayout(0, 1, 20, 5));
		pL.add(new JLabel("   �̸� :    "));
		pL.add(new JLabel("   ��ȣ :    "));
		pL.add(new JLabel("   ���� :    "));
		
		
		
		
		JPanel pR = new JPanel();
		pR.setLayout(new GridLayout(0, 1, 20, 5));
		JTextField tf = new JTextField();
		tf.setText("ȫ �浿");
		pR.add(tf);
		
		JPasswordField pwd = new JPasswordField();
		pwd.setEchoChar('#');
		pR.add(pwd);
		
		JFormattedTextField date = new JFormattedTextField();
		date.setValue(new Date());
		pR.add(date);
		
		
		
		JPanel pD = new JPanel();
		JTextArea ta = new JTextArea(5, 30);
		ta.setText("JTextComponent\n");
		ta.append("	JTextField\n");
		ta.append("	JTextArea\n");
		ta.append("	JEditorPane\n");
		pD.add(new JLabel("	�޸� :    "));
		pD.add(ta);
		
		add(pL,"West");
		
		add(pR, "Center");
		add(pD, "South");
		
		
	}
	
	public static void main(String[]args) {
		TextFieldwin win = new TextFieldwin("�ؽ�Ʈ �ʵ� �˾ƺ���");
		
	}

}
