
public class USBMemory extends Device implements Connectable {
	
	//Ŭ���� Debice�� �߻� �޸�
	public void print() {
		System.out.println("�Ｚ usb �޸��Դϴ�");
	}
	
	//�������̽�  Connectable�� �߻� �޼ҵ� ����
	public void connect() {
		System.out.println(name + ", usb �޸𸮸� �����մϴ�. ");
	}

}
