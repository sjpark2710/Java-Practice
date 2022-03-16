
public class Five {
	
	/*
	 * 5. 과일, 사과, 배, 포도를 표현한 클래스를 만들고 이들 간의 관계를 고려하여 하나의 클래스를 추상 클래스로 만들어 메소드 print()를 구현하고 다음과 같은 소스와 결과가 나오도록 클래스를 작성하시오.

		- 소스

				Fruit fAry[] = {new Grape(), new Apple(), new Pear());
				
				for(Fruit f : fAry)
		
				f.print();
		
		- 결과
		
				나는 포도이다.
		
				나는 사과이다.
		
				나는 배이다.
			 */
	
	public static void main(String[]args) {
		Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
		for(Fruit f : fAry) {
			f.print();
		}
	}

}
