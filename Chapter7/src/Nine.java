
/*
 * 9. Ŭ���� HashMap�� ����Ͽ� �̸��� ��ȭ��ȣ�� ����Ǵ� ������ ��ȭ��ȣ�θ� ����� �̸����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.

		- ����� ��� ȭ��
		
		�˻��� �̸��� ��������. >>
		
		�����
		
		�Է��Ͻ� ������� ��ȭ��ȣ�� 010-3675-8754 �Դϴ�.
 */
import java.util.HashMap;
import java.util.Scanner;

public class Nine {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> m = new HashMap<String,String>();
		m.put("�����", "010-3675-8754");
		m.put("�ڳ���", "010-2834-9384");
		m.put("������", "010-1294-2349");
		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("�˻��� �̸��� ��������. >>");
		name=s.nextLine();
		System.out.println("�Է��Ͻ� "+name+"�� ��ȭ��ȣ�� "+m.get(name)+" �Դϴ�.");
		
	}

}
