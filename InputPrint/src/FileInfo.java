
import java.io.*;
import java.util.Date;

public class FileInfo {
	public static void main(String[]args) {
		
		//���� ���� �̸� ����
		String fname = "src/basicio/FileInfo.java";
	
		//File ��ü ����
		File f = new File(fname);
		System.out.println("\t�н� : " + f.getPath());
		System.out.println("\t�����н� : " + f.getAbsolutePath());
		System.out.println("\t�θ� : " + f.getParent());
		System.out.println("\t���⿩�� : " + f.canWrite());
		System.out.println("\t�������� : " + f.canRead());
		System.out.println("\t������ : " + f.isDirectory());
		System.out.println("\t����ũ�� : " + f.length());
		
		
		
		
		
	}

}
