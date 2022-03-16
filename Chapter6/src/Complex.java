
public class Complex {
	double realNum;
	double imaginaryNum;
	// ������
	Complex(double realNum, double imaginaryNum){
		this.realNum = realNum;
		this.imaginaryNum = imaginaryNum;
	}
	// ����
	public static Complex add(Complex c1, Complex c2) {
		return new Complex(c1.realNum+c2.realNum, c1.imaginaryNum+c2.imaginaryNum);
	}
	// ����
	public static Complex sub(Complex c1, Complex c2) {
		return new Complex(c1.realNum-c2.realNum, c1.imaginaryNum-c2.imaginaryNum);
	}
	// ���밪
	public double abs() {
		return Math.abs(realNum*realNum+imaginaryNum*imaginaryNum);
	}
	void print() {
		System.out.println(realNum+" + "+imaginaryNum+"i");
	}

}
