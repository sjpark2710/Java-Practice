
public class One {
	
	/*
	 * 1. ���� ������ �����ϴ� Ŭ���� Person�� �����Ͽ� �׽�Ʈ�ϴ� ���α׷��� �ۼ��Ͻÿ�.

		- Ŭ���� Person�� �̸��� �����ϴ� �ʵ� ����
		
		- Ŭ���� Person�� ���� Ŭ���� Object�� �޼ҵ� equals()�� �������̵��Ͽ� �̸��� ������ true�� ��ȯ�ϴ� �޼ҵ� ����
		
		- ������ ���� �ҽ��� Ŭ���� Person�� ����
		
		Person p1 = new Person("ȫ�浿");
		System.out.println(p1.equals(new Person("ȫ�浿")));
		
		System.out.println(p1.equals(new Person("�ָ���")));
	 */
	
	public static void main(String[]args) {
		Person p1 = new Person("ȫ�浿");
		System.out.println(p1.equals(new Person("ȫ�浿")));
		System.out.println(p1.equals(new Person("�ָ���")));
		
	}
	
}
