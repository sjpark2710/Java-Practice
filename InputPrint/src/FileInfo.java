
import java.io.*;
import java.util.Date;

public class FileInfo {
	public static void main(String[]args) {
		
		//읽을 파일 이름 지정
		String fname = "src/basicio/FileInfo.java";
	
		//File 객체 생성
		File f = new File(fname);
		System.out.println("\t패스 : " + f.getPath());
		System.out.println("\t절대패스 : " + f.getAbsolutePath());
		System.out.println("\t부모 : " + f.getParent());
		System.out.println("\t쓰기여부 : " + f.canWrite());
		System.out.println("\t폴더여부 : " + f.canRead());
		System.out.println("\t수정일 : " + f.isDirectory());
		System.out.println("\t파일크기 : " + f.length());
		
		
		
		
		
	}

}
