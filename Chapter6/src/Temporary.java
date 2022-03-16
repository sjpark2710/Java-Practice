
public class Temporary extends Employee{
	
	int workhour;		//���� �ð�
	int time_pay;		//�ð��� ����
	
	Temporary(String name, int age, String address, String department){
		super(name, age, address, department);
		time_pay = 10000;
	}
	
	public void setWorkHours(int workhour) {
		this.workhour = workhour;
		this.salary = workhour * time_pay;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("��������");
		System.out.println("���� �ð� : " + workhour);
		System.out.println("�޿� : "+salary);
		System.out.println();
	}

}
