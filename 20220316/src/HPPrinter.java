
public class HPPrinter extends Device implements Connectable{
	
	//Ŭ���� Device�� �߻� �޼ҵ� ����
	public void print() {
		System.out.println("HP ������ �Դϴ�");
	}
	
	//�������̽� Connectable�� �߻� �޼ҵ� ����
	public void connect() {
		System.out.println(name + ",HP �����͸� �����մϴ�.");
	}

}
