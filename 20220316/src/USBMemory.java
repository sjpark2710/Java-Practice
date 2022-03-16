
public class USBMemory extends Device implements Connectable {
	
	//클래스 Debice의 추상 메모리
	public void print() {
		System.out.println("삼성 usb 메모리입니다");
	}
	
	//인터페이스  Connectable의 추상 메소드 구현
	public void connect() {
		System.out.println(name + ", usb 메모리를 연결합니다. ");
	}

}
