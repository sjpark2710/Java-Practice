
public class Two {
	
	/*2. ���� ������ �����ϵ��� 8���� ���� Ŭ���� ��ü�� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

		- �ڽ� ����� ����Ͽ� 8���� ���� Ŭ������ ��ü�� ����
		
		- ��ڽ� ��ɰ� �޼ҵ� printf()�� ����Ͽ� �� ��ü�� �״�� ���
	 */
	
	static void printf(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[]args) {
		Byte b1 = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4l;
		Float f = 5f;
		Double d = 6.0;
		Character c = 'a';
		Boolean b2 = true;
		
		Two.printf(b1);
		Two.printf(s);
		Two.printf(i);
		Two.printf(l);
		Two.printf(f);
		Two.printf(d);
		Two.printf(c);
		Two.printf(b2);
	}

}
