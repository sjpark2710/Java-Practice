
import java.util.Calendar;

public class Five {
	
	/*
	 * 5. ���� ������ �����ϵ��� ������ ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		- Ŭ���� Calendar�� ��ü�� ���� �޼ҵ带 ����ϸ�
		
		 * get(Calendar.DAY_OF_WEEK_IN_MONTH) : �޿��� ������ Ƚ�� ��ȯ
		
		 * get(Calendar.DAY_OF_WEEK) : ������ ��ȯ, 1�� �Ͽ���
		
		 * get(Calendar.WEEK_OF_MONTH) : ���� �� Ƚ���� ��ȯ
		
		 * get(Calendar.DAY_OF_YEAR) : ���� ��¥�� ��ȯ
		
		 * get(Calendar.WEEK_OF_YEAR) : ���� �� Ƚ���� ��ȯ
		
		- ������ ���� ��µǵ��� �Ѵ�.
		
		������ 2012�� 6�� 17�� �Ͽ����Դϴ�.
		�� ���� 3��° �Ͽ����Դϴ�.
		
		�� ���� 4��° ���Դϴ�.
		
		�� ���� 169���Դϴ�.
		
		�� ���� 25��° ���Դϴ�. 
	 */
	
	public static void main(String[]args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		String d;
		
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			d="�Ͽ���";
			break;
		case 2:
			d="������";
			break;
		case 3:
			d="ȭ����";
			break;
		case 4:
			d="������";
			break;
		case 5:
			d="�����";
			break;
		case 6:
			d="�ݿ���";
			break;
		default:
			d="�����";
			break;
		}
		System.out.println("������ "+year+"�� "+month+"�� "+date+"�� "+ d+"�Դϴ�.");
		System.out.println("�� ���� "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"��°"+d+"�Դϴ�.");
		System.out.println("�� ���� "+cal.get(Calendar.WEEK_OF_MONTH)+"��° ���Դϴ�.");
		System.out.println("�� ���� "+cal.get(Calendar.DAY_OF_YEAR)+"���Դϴ�.");
		System.out.println("�� ���� "+cal.get(Calendar.WEEK_OF_YEAR)+"��° ���Դϴ�.");
		
	}

}
