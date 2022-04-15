import java.io.*;
import java.net.*;

public class MyClass {
	
	public static void main(String[]args) {
		int data;
		int num = 1;	//�� ��ȣ
		//�ҷ��� ���� ���  + �̸�
		String inFname = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11_one\\src\\MyClass.java";
		//���� ���� ���� ��� + �̸�
		String outFname = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11_one\\src\\MyNum.java";
		
		try {
			// ���� ���� �̸����� FileInputStream ����
			FileInputStream fis = new FileInputStream(inFname);
			FileOutputStream fout = new FileOutputStream(outFname);
			//���ڵ��� ����
			InputStreamReader isr = new InputStreamReader(fis, "MS949");
			OutputStreamWriter osw = new OutputStreamWriter(fout,"ms949");
			while((data = isr.read()) != -1) {
				char c = (char)data;
				if(num == 1){	//ù��° �ٿ� ��ȣ�� �ű� ���� ���� ó��
					osw.write(num+++"  ");
				}
				osw.write(c);
				if(c == '\n') {
					osw.write(num+++"  ");
				}
			}
			osw.flush();
			isr.close();
			osw.close();
			fis.close();
			fout.close();
			System.out.println(outFname + "  : ������ �����Ǿ����ϴ�.");
		}catch(FileNotFoundException e) {
			System.err.println("���� ������ �����ϴ�. : " + inFname);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
