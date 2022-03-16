
import java.util.Scanner;

public class Student extends Person{
	
	String school;			//�б�
	String department;		//�а�
	int classNum;			//�й�
	double score[];			//���� �迭
	
	//������
	Student(String name, int age, String address, String school, String department, int classNum){
		super(name, age, address);
		this.school = school;
		this.department = department;
		this.classNum = classNum;
		score = new double[8];
	}
	
	//��� ���ϱ�
	double average() {
		double sum = 0;
		for(double i : score) {
			sum += i;
		}
		return sum/score.length;
	}
	
	public void printInfo() {
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("�б� : " + school);
		System.out.println("�а� : " + department);
		System.out.println("�й� : " + classNum);
		System.out.println("========================");
		System.out.println("8�б� ������ ������� �Է��ϼ���");
		for(int i = 0 ; i <score.length; i++) {
			System.out.print(i + 1 + "�б� ���� ->");
			score[i] = s.nextDouble();
		}
		System.out.println("=======================");
		System.out.println("8�б� �� ��� ������" + average() + "�� �Դϴ�.");
	}

}
