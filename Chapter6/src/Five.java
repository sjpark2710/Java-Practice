
public class Five {
	
	/*
	 * 5. ����, ���, ��, ������ ǥ���� Ŭ������ ����� �̵� ���� ���踦 ����Ͽ� �ϳ��� Ŭ������ �߻� Ŭ������ ����� �޼ҵ� print()�� �����ϰ� ������ ���� �ҽ��� ����� �������� Ŭ������ �ۼ��Ͻÿ�.

		- �ҽ�

				Fruit fAry[] = {new Grape(), new Apple(), new Pear());
				
				for(Fruit f : fAry)
		
				f.print();
		
		- ���
		
				���� �����̴�.
		
				���� ����̴�.
		
				���� ���̴�.
			 */
	
	public static void main(String[]args) {
		Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
		for(Fruit f : fAry) {
			f.print();
		}
	}

}
