

/*
 * 10. �̸��� ��ȭ��ȣ, �̵���Ż簡 ����Ǵ� ������ ��ȭ��ȣ�θ� ����� ����, Ű �ϳ��� ���� 2�� �Է��� �� �ִ� Ŭ���� MyData�� �����Ͽ� ���� ������ �����ϵ��� ���α׷��� �ۼ��Ͻÿ�.

	- �Ϲ�ȭ ������ �����ϴ� Ŭ���� MyData�� ����
	
	class MyData<K, V1, V2> {
	 
	
	}
	
	- ����� ��� ȭ��
	
	�˻��� �̸��� ��������. >>
	
	���̿� 
	
	 �Է��Ͻ� ���̿��� ��ȭ��ȣ�� 010-3196-3985, �̵���Ż�� KT�Դϴ�.
 */
import java.util.HashMap;
import java.util.Scanner;

class MyData<K, V1, V2>{
	private HashMap<K,V1> m1; // �̸�, (����ȣ,��Ż�)
	private HashMap<K,V2> m2; // ����ȣ, ��Ż�
	public MyData() {
		m1=new HashMap<K,V1>();
		m2=new HashMap<K,V2>();
	}
	public void add(K n, V1 p, V2 a) { // �̸�, ����ȣ, ��Ż�
		m1.put(n, p);
		m2.put(n, a);
	}
	public V1 getV1(K n){
		return m1.get(n);
	}
	public V2 getV2(K n) {
		return m2.get(n);
	}
}
public class Ten {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData<String, String, String> my = new MyData<String, String, String>();
		my.add("���̿�", "010-3196-3985", "KT");
		my.add("���ƿ�", "010-1342-1453", "SK");
		my.add("������", "010-1236-4573", "LG");
		
		Scanner s = new Scanner(System.in);
		System.out.println("�˻��� �̸��� ��������. >>");
		String name = s.nextLine();
		System.out.println("�Է��Ͻ� "+name+"�� ��ȭ��ȣ�� "+my.getV1(name)+", �̵���� ��� "+my.getV2(name)+"�Դϴ�.");
	}

}