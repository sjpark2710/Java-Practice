
public class Circle extends Shape {
	
	double radius;
	
	public Circle(double x, double y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public void draw() {
		super.drawCenter();
		System.out.printf("������ : %f,",radius);
		System.out.printf("�� ���� : %f\n",radius*radius*Math.PI);
	}

}
