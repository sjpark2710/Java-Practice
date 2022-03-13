
public class Moter extends Vehicle{
/*
	public String name = "자동차";	//이름
	public int displacement;		//배기량
	
	 public void printInfo() {
		 System.out.print("name : " + name);
		 System.out.println(", 최대속도 : " + maxSpeed + " km");
		 System.out.print("정원 : " + seater);
		 System.out.println(", 배기량" + displacement + " cc");
	 }
	 
	 public static void main(String[]args) {
		 Moter mycar = new Moter();
		 mycar.name = "페라리";
		 mycar.maxSpeed = 100;
		 mycar.displacement = 3000;
		 mycar.seater = 2;
		 mycar.printInfo();
	 }
	
*/
	public String name = "자동차";	//이름
	public int displacement;		//배기량
	
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
		System.out.println(", 최대속도 : " + maxSpeed + "km");
		System.out.print("정원 : " + seater + "명");
		System.out.println(", 배기량 : " + displacement + "cc");
	}
	
	public static void main(String[]args) {
		Moter mycar = new Moter();
		mycar.setMaxSpeed(500);
		mycar.setSeater(2);
		mycar.setDisplacement(1000);
		mycar.printInfo();
	}
	
	
	
	
	
}
