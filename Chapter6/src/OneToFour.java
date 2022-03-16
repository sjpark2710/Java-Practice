
public class OneToFour {
	
	/*
	 * 1. ������ �����ϴ� Ŭ���� Employee�� �ۼ��Ͻÿ�(1���� 4������ ���õ� �����Դϴ�).

		- Ŭ���� Employee(����)�� Ŭ���� Regular(������)�� Temporary(��������)�� ���� Ŭ����

		- �ʵ�: �̸�, ����, �ּ�, �μ�, ���� ������ �ʵ�� ����

		- ������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ������ ����

		-�޼ҵ� printInfo() : ���ڴ� ���� �ڽ��� �ʵ� �̸�, ����, �ּ�, �μ��� ���
	 * 
	 * 2. ������ �����ϴ� Ŭ���� Regular�� �ۼ��Ͻÿ�.

		- Ŭ���� Regular�� ������ ������ Ŭ���� Employee�� ���� Ŭ����

		- ������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ���� ������ ȣ��

		- Setter : ���� ���� �ʵ带 ����

		- �޼ҵ� printInfo() : ���ڴ� ���� "������"�̶�� ������ ������ ���
	 * 
	 * 3. ������ �����ϴ� Ŭ���� Temporary�� �ۼ��Ͻÿ�.

		- Ŭ���� Temporary�� �� Ŭ���� Employee�� ���� Ŭ����

		- �ʵ� : ���� �ð�, �ð��� ������ �����ϰ� �ð��� ������ �ʱ� ������ 10000 ����

		- ������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ���� ������ ȣ��

		- Setter : ���� �ð��� �����ϸ鼭 �޿��� ���� �ð� * �ð��� ������ ����Ͽ� ����

		- �޼ҵ� printInfo() : ���ڴ� ���� "��������"�̶�� ������ ���� �ð��� �޿��� ���

		- ���� ���� ���α׷����� Ŭ���� Employee, Regular, Temporary�� �����ϴ� ���α׷� ����

		Regular r = new Regular("�̼���", 35, "����", "�λ��");

		Temporary t = new Temporary("�庸��", 25, "��õ", "�渮��");

		r.setSalary(5000000);

		r.printInfo();

		t.setWorkHours(120);

		t.printInfo();


	 * 4. ���� ���α׷��� ���� Regular ��ü�� Temporary ��ü�� Employee ������ �����Ͽ� �����ų �� �ֵ��� ���α׷��� �����Ͻÿ�.

		Employee r = new Regular("�̼���", 35, "����", "�λ��");Employee t = new Temporary("�庸��", 25, "��õ", "�渮��");
		r.setSalary(5000000);

		r.printInfo();

		t.setWorkHours(120);

		t.printInfo();
	 */
	
	public static void main(String[]args) {
		
		Employee r = new Regular("�̼���", 35, "����", "�λ��");
		Employee t = new Temporary("�庸��", 25, "��õ" , "�渮��");
		
		r.setSalary(500000);
		r.printInfo();
		t.setWorkHour(120);
		t.printInfo();
		
		
	}

}
