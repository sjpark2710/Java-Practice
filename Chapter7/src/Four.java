
import java.util.Calendar;
import java.util.Scanner;

public class Four {
	
	/*
	 * 4. ���� ������ �����ϵ��� ǥ���Է����� ��, ��, ���� �Է� �޾� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		- Ŭ���� Calendar�� ���
	 */
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int year;
		int month;
		int date;
		String d;
		
		System.out.print("�⵵�� �Է��Ͻÿ� : ");
		year= input.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		month = input.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		date = input.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,  month-1);
		cal.set(Calendar.DATE, date);
		
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
	

	System.out.println(d);
		
	}
	
	
	
	

}
