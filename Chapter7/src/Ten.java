

/*
 * 10. 이름과 전화번호, 이동통신사가 저장되는 간단한 전화번호부를 만들기 위해, 키 하나에 값을 2개 입력할 수 있는 클래스 MyData를 구현하여 다음 조건을 만족하도록 프로그램을 작성하시오.

	- 일반화 유형을 지원하는 클래스 MyData의 구현
	
	class MyData<K, V1, V2> {
	 
	
	}
	
	- 입출력 결과 화면
	
	검색할 이름을 적으세요. >>
	
	김이용 
	
	 입력하신 김이용의 전화번호는 010-3196-3985, 이동통신사는 KT입니다.
 */
import java.util.HashMap;
import java.util.Scanner;

class MyData<K, V1, V2>{
	private HashMap<K,V1> m1; // 이름, (폰번호,통신사)
	private HashMap<K,V2> m2; // 폰번호, 통신사
	public MyData() {
		m1=new HashMap<K,V1>();
		m2=new HashMap<K,V2>();
	}
	public void add(K n, V1 p, V2 a) { // 이름, 폰번호, 통신사
		m1.put(n, p);
		m2.put(n, a);
	}
	public V1 getV1(K n){
		return m1.get(n);
	}
	public V2 getV2(K n) {
		return m2.get(n);
	}
}
public class Ten {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData<String, String, String> my = new MyData<String, String, String>();
		my.add("김이용", "010-3196-3985", "KT");
		my.add("정아영", "010-1342-1453", "SK");
		my.add("강은영", "010-1236-4573", "LG");
		
		Scanner s = new Scanner(System.in);
		System.out.println("검색할 이름을 적으세요. >>");
		String name = s.nextLine();
		System.out.println("입력하신 "+name+"의 전화번호는 "+my.getV1(name)+", 이동통신 사는 "+my.getV2(name)+"입니다.");
	}

}