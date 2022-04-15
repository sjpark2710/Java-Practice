import java.io.*;
import java.net.*;

public class MyClass {
	
	public static void main(String[]args) {
		int data;
		int num = 1;	//줄 번호
		//불러올 파일 경로  + 이름
		String inFname = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11_one\\src\\MyClass.java";
		//새로 만들 파일 경로 + 이름
		String outFname = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11_one\\src\\MyNum.java";
		
		try {
			// 읽을 파일 이름으로 FileInputStream 생성
			FileInputStream fis = new FileInputStream(inFname);
			FileOutputStream fout = new FileOutputStream(outFname);
			//인코딩을 위해
			InputStreamReader isr = new InputStreamReader(fis, "MS949");
			OutputStreamWriter osw = new OutputStreamWriter(fout,"ms949");
			while((data = isr.read()) != -1) {
				char c = (char)data;
				if(num == 1){	//첫번째 줄에 번호를 매기 위한 예외 처리
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
			System.out.println(outFname + "  : 파일이 생성되었습니다.");
		}catch(FileNotFoundException e) {
			System.err.println("다음 파일이 없습니다. : " + inFname);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
