
/*
 * 9. 클래스 HashMap을 사용하여 이름과 전화번호가 저장되는 간단한 전화번호부를 만들어 이름으로 검색하는 프로그램을 작성하시오.

		- 입출력 결과 화면
		
		검색할 이름을 적으세요. >>
		
		김미현
		
		입력하신 김미현의 전화번호는 010-3675-8754 입니다.
 */
import java.util.HashMap;
import java.util.Scanner;

public class Nine {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> m = new HashMap<String,String>();
		m.put("김미현", "010-3675-8754");
		m.put("박나현", "010-2834-9384");
		m.put("강다현", "010-1294-2349");
		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("검색할 이름을 적으세요. >>");
		name=s.nextLine();
		System.out.println("입력하신 "+name+"의 전화번호는 "+m.get(name)+" 입니다.");
		
	}

}
