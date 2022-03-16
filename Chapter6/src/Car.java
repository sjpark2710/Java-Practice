
public class Car {

	private int maxspeed;	//최대속도
	private int speed;		//속도
	
	Car(int maxspeed){
		this.maxspeed = maxspeed;
		this.speed = 0;
	}
	
	public void print(int s) {
		if(speed > maxspeed) {
			System.out.print("최대속도보다 높아 최대속도로 지정,");
			speed = maxspeed;
		}
		if(speed < 0) {
			System.out.print("속도가 0보다 낮아 0으로 지정,");
			speed += s;
		}
		System.out.println("최대속도 : " + maxspeed + ", 현재속도 : " + speed);
	}
	
	public void speedUp() {
		speed += 5;
		System.out.print("speedUp() 호출 : ");
		print(5);
	}
	
	public void speedUp(int s) {
		System.out.print("speedUp(" + s + ") 호출 : ");
		if(s < 0) {	//인자가 음수 일때
			System.out.print("오류 : 속도가 음수이므로 0으로 지정 : ");
			s = 0;
		}
		speed += s;
		print(s);
	}
	
	public void speedDown() {
		speed -= 5;
		System.out.print("speedDown() 호출 : ");
		print(5);
	}
	
	public void speedDown(int s) {
		System.out.print("speedDown (" + s + ") 호출 : ");
		if(s < 0) {	//인자가 음수 일때
			System.out.print("오류 : 속도가 음수이므로 0으로 지정 : ");
			s = 0;
		}
		speed -= s;
		print(s);
	}
	
	public void main(String[]args) {
		Car mycar = new Car(300);
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp(-50);
		mycar.speedUp(50);
		mycar.speedDown(-30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedUp(100);
		mycar.speedUp(300);
		
	}
		
	
}
