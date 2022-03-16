
public class Car {

	private int maxspeed;	//�ִ�ӵ�
	private int speed;		//�ӵ�
	
	Car(int maxspeed){
		this.maxspeed = maxspeed;
		this.speed = 0;
	}
	
	public void print(int s) {
		if(speed > maxspeed) {
			System.out.print("�ִ�ӵ����� ���� �ִ�ӵ��� ����,");
			speed = maxspeed;
		}
		if(speed < 0) {
			System.out.print("�ӵ��� 0���� ���� 0���� ����,");
			speed += s;
		}
		System.out.println("�ִ�ӵ� : " + maxspeed + ", ����ӵ� : " + speed);
	}
	
	public void speedUp() {
		speed += 5;
		System.out.print("speedUp() ȣ�� : ");
		print(5);
	}
	
	public void speedUp(int s) {
		System.out.print("speedUp(" + s + ") ȣ�� : ");
		if(s < 0) {	//���ڰ� ���� �϶�
			System.out.print("���� : �ӵ��� �����̹Ƿ� 0���� ���� : ");
			s = 0;
		}
		speed += s;
		print(s);
	}
	
	public void speedDown() {
		speed -= 5;
		System.out.print("speedDown() ȣ�� : ");
		print(5);
	}
	
	public void speedDown(int s) {
		System.out.print("speedDown (" + s + ") ȣ�� : ");
		if(s < 0) {	//���ڰ� ���� �϶�
			System.out.print("���� : �ӵ��� �����̹Ƿ� 0���� ���� : ");
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
