
public class Moter extends Vehicle{
/*
	public String name = "�ڵ���";	//�̸�
	public int displacement;		//��ⷮ
	
	 public void printInfo() {
		 System.out.print("name : " + name);
		 System.out.println(", �ִ�ӵ� : " + maxSpeed + " km");
		 System.out.print("���� : " + seater);
		 System.out.println(", ��ⷮ" + displacement + " cc");
	 }
	 
	 public static void main(String[]args) {
		 Moter mycar = new Moter();
		 mycar.name = "���";
		 mycar.maxSpeed = 100;
		 mycar.displacement = 3000;
		 mycar.seater = 2;
		 mycar.printInfo();
	 }
	
*/
	public String name = "�ڵ���";	//�̸�
	public int displacement;		//��ⷮ
	
	public void setMaxSpeed(int maxspeed) {
		this.maxSpeed = maxspeed;
	}
	
	public void setSeater(int seater) {
		this.seater = seater;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	public void printInfo() {
		System.out.print(super.name + ": " + this.name);
		System.out.println(", �ִ�ӵ� : " + maxSpeed + "km");
		System.out.print("���� : " + seater + "��");
		System.out.println(", ��ⷮ : " + displacement + "cc");
	}
	
	public static void main(String[]args) {
		Moter mycar = new Moter();
		mycar.setMaxSpeed(500);
		mycar.setSeater(2);
		mycar.setDisplacement(1000);
		mycar.printInfo();
	}
	
	
	
	
	
}
