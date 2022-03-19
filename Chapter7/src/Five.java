
import java.util.Calendar;

public class Five {
	
	/*
	 * 5. 다음 조건을 만족하도록 오늘의 정보를 출력하는 프로그램을 작성하시오.

		- 클래스 Calendar의 객체의 다음 메소드를 사용하며
		
		 * get(Calendar.DAY_OF_WEEK_IN_MONTH) : 달에서 요일의 횟수 반환
		
		 * get(Calendar.DAY_OF_WEEK) : 요일을 반환, 1이 일요일
		
		 * get(Calendar.WEEK_OF_MONTH) : 월의 주 횟수를 반환
		
		 * get(Calendar.DAY_OF_YEAR) : 해의 날짜를 반환
		
		 * get(Calendar.WEEK_OF_YEAR) : 해의 주 횟수를 반환
		
		- 다음과 같이 출력되도록 한다.
		
		오늘은 2012년 6월 17일 일요일입니다.
		이 달의 3번째 일요일입니다.
		
		이 달의 4번째 주입니다.
		
		이 해의 169일입니다.
		
		이 해의 25번째 주입니다. 
	 */
	
	public static void main(String[]args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		String d;
		
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			d="일요일";
			break;
		case 2:
			d="월요일";
			break;
		case 3:
			d="화요일";
			break;
		case 4:
			d="수요일";
			break;
		case 5:
			d="목요일";
			break;
		case 6:
			d="금요일";
			break;
		default:
			d="토요일";
			break;
		}
		System.out.println("오늘은 "+year+"년 "+month+"월 "+date+"일 "+ d+"입니다.");
		System.out.println("이 달의 "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"번째"+d+"입니다.");
		System.out.println("이 달의 "+cal.get(Calendar.WEEK_OF_MONTH)+"번째 주입니다.");
		System.out.println("이 해의 "+cal.get(Calendar.DAY_OF_YEAR)+"일입니다.");
		System.out.println("이 해의 "+cal.get(Calendar.WEEK_OF_YEAR)+"번째 주입니다.");
		
	}

}
