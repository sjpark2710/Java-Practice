
public class Two {
	
	/*2. 다음 조건을 만족하도록 8개의 랩퍼 클래스 객체를 처리하는 프로그램을 작성하시오.

		- 박싱 기능을 사용하여 8개의 랩퍼 클래스의 객체를 생성
		
		- 언박싱 기능과 메소드 printf()를 사용하여 위 객체를 그대로 출력
	 */
	
	static void printf(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[]args) {
		Byte b1 = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4l;
		Float f = 5f;
		Double d = 6.0;
		Character c = 'a';
		Boolean b2 = true;
		
		Two.printf(b1);
		Two.printf(s);
		Two.printf(i);
		Two.printf(l);
		Two.printf(f);
		Two.printf(d);
		Two.printf(c);
		Two.printf(b2);
	}

}
