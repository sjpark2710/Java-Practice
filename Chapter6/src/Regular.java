
public class Regular extends Employee{
	
	//������
	Regular(String name, int age, String address, String department){
		//���� ������ ȣ��
		super(name, age, address, department);
	}
	
	public void setSalary(int salary) {
		this.salary= salary;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("������");
		System.out.println("���� :" +salary);
		System.out.println();
	}

}
