
public class Eight {
	
	/*
			 * 8. ������ ���Ҽ��� �߻�ȭ�� Ŭ���� Complex�� �ۼ��Ͻÿ�.
		
		- �ʵ� : ���Ҽ��� �Ǽ��ο� ����θ� ���� ���� ����
		
		- ������ : �Ǽ��ο� ����θ� ���ڷ� �ϴ� ������
		
		- ���� �޼ҵ� add(Complex c1, Complex c2) : ���Ҽ� c1�� c2�� ���� ����� ���Ҽ��� ��ȯ
		
		* ���Ҽ� a + bi�� c + di�� �� : (a+c) + (c+d)i
		
		- ���� �޼ҵ� sub(Complex c1, Complex c2) : ���Ҽ� c1�� c2�� �� ����� ���Ҽ��� ��ȯ
		
		* ���Ҽ� a +bi�� c + di�� ���� : (a-c)+(c-d)i
		
		- �޼ҵ� abs() : ���Ҽ��� ���� �� ��ȯ
		
		* ���Ҽ� a+bi�� ���� �� ����� : Math.sqrt(a^2+b^2)
		
		- �޼ҵ� print() : a + bi ���·� ���
		
		- ���Ҽ� x = 3.4 + 4.5i, y =5.2 + -2.4i�� �����Ͽ� ���� ���, �� ���, x�� y�� ���� ���� ����ϴ� ���α׷��� �ۼ�
	 */
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Complex c1 = new Complex(3.4,4.5);
			Complex c2 = new Complex(5.2,-2.4);
			System.out.print("���� ��� : ");
			Complex.add(c1,c2).print();
			System.out.print("�� ��� : ");
			Complex.sub(c1,c2).print();
			System.out.println("x�� ���밪 : "+c1.abs());
			System.out.println("y�� ���밪 : "+c2.abs());
		}

}
