import java.io.*;
import java.net.*;

public class Two {
	public static void main(String[]args) {
		int data;
		String inFname = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11_two\\src\\car1.jpg";
		try {
			FileInputStream fis = new FileInputStream(inFname);
			while((data = fis.read()) != -1) {
				System.out.println((char)data);
			}
		}catch(FileNotFoundException e) {
			System.err.println("다음 파일이 없습니다" + inFname);
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
