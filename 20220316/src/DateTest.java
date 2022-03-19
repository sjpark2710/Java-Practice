import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class DateTest {
	public static void main(String[]args) {
		
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG , Locale.KOREA);
		System.out.println(df.format(now));
		
		df = DateFormat.getDateTimeInstance(DateFormat.LONG , DateFormat.LONG , Locale.KOREA);
		System.out.println(df.format(now));
		System.out.println();
		
		//1970년 1월 1일 이후 지난 천분의 1초 시간으로 생성
		Date when = new Date(100_000_000_000L);
		System.out.println(when + "==" + (Date)when.clone());
		System.out.println(when.before(now));
		System.out.println(when.equals(now));
		System.out.println(when.after(now));
		System.out.println(when.compareTo(now));
	}

}
