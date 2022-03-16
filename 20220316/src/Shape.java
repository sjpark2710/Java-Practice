
public abstract class Shape {
	protected double x, y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//일반 클래스
	public void drawCenter() {
		System.out.println("(x,y) =" + x + ","+y);
	}
	
	//추상 클래스
	public abstract void draw();
	
	public static void main(String[]args) {
		//Shape s = new Shape(3.1, 4.5) //객체화 오류
	}

}
