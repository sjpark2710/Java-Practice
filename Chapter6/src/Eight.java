
public class Eight {
	
	/*
			 * 8. 수학의 복소수를 추상화한 클래스 Complex를 작성하시오.
		
		- 필드 : 복소수의 실수부와 허수부를 위한 변수 선언
		
		- 생성자 : 실수부와 허수부를 인자로 하는 생성자
		
		- 정적 메소드 add(Complex c1, Complex c2) : 복소수 c1과 c2의 더한 결과인 복소수를 반환
		
		* 복소수 a + bi와 c + di의 합 : (a+c) + (c+d)i
		
		- 정적 메소드 sub(Complex c1, Complex c2) : 복소수 c1과 c2의 뺀 결과인 복소수를 반환
		
		* 복소수 a +bi와 c + di의 빼기 : (a-c)+(c-d)i
		
		- 메소드 abs() : 복소수의 절대 값 반환
		
		* 복소수 a+bi의 절대 값 연산식 : Math.sqrt(a^2+b^2)
		
		- 메소드 print() : a + bi 형태로 출력
		
		- 복소수 x = 3.4 + 4.5i, y =5.2 + -2.4i를 생성하여 더한 결과, 뺀 결과, x와 y의 절대 값을 출력하는 프로그램도 작성
	 */
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Complex c1 = new Complex(3.4,4.5);
			Complex c2 = new Complex(5.2,-2.4);
			System.out.print("더한 결과 : ");
			Complex.add(c1,c2).print();
			System.out.print("뺀 결과 : ");
			Complex.sub(c1,c2).print();
			System.out.println("x의 절대값 : "+c1.abs());
			System.out.println("y의 절대값 : "+c2.abs());
		}

}
