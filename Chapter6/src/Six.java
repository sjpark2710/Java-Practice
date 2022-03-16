
public class Six {
	/*
			 * 6. 다음 조건을 만족하도록 클래스 Car를 작성하시오.
		
		- 필드는 정수형으로 maxSpeed(최대속도)와 speed(현재속도)로 선언
		
		- 생성자 : 최대속도를 지정하는 생성자 구현
		
		- 메소드 : speedUp(), speedUp(int)과 speedDown(), speedDown(int) 으로 메소드 오버로딩 구현
		
		- 다음은 클래스 Car 객체로 SpeedUp()과 speedDown()을 점검하는 소스
		
		Car mycar = new Car(300);
		
		mycar.speedUp(); 
		
		mycar.speedUp();
		
		mycar.speedUp(-50);
		
		mycar.speedUp(50);
		
		mycar.speedDown(-30);
		
		mycar.speedDown(30);
		
		mycar.speedDown(30);
		
		mycar.speedDown(30);
		
		mycar.speedUp(100);
		
		mycar.speedUp(300);
		
		- 다음은 위 소스의 실행결과 : 각 줄이 하나의 메소드 호출의 결과가 되도록 한다.
		
		speedUp() 호출 : 최대속도 : 300, 현재속도 : 5
		
		speedUp() 호출 : 최대속도 : 300, 현재속도 : 10
		
		speedUp(-50) 호출 : 오류 : 속도가 음수이므로 0으로 지정 : 최대속도 : 300, 현재속도 10
		
		speedUp(50) 호출 : 최대속도: 300, 현재속도 : 60
		
		speedDown(-30) 호출 : 오류 : 속도가 음수이므로 0으로 지정 : 최대속도 : 300, 현재속도 : 60
		
		speedDown(30) 호출 : 최대속도 : 300, 현재속도 : 30
		
		speedDown(3) 호출 : 최대속도 300, 현재속도 : 0
		
		speedDown(30) 호출 : 속도가 0ㅗ다 작아져 0으로 지정, 최대속도 : 300, 현재속도 : 0
		
		speedUp(100) 호출 : 최대속도 : 300, 현재속도 : 100
		
		speedUp(300) 호출 : 최대속도보다 높아 최대속도로 지정, 최대속도 : 300, 현재속도 : 300 
	 */
	

}
