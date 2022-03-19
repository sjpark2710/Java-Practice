import java.util.Calendar;

public class CalendarTest {
	public static void main(String[]args) {
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime());
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1;
		int date = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "�� " + month +"�� " + date +"��");
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
		
	}
}
