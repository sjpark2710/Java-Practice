package chapter11_Six;
import java.io.*;

public class FileCopy {
	public static void main(String[]args) {
		int data;
		String path = "C:\\Users\\seongjin\\eclipse-workspace\\chapter11_Six\\src\\chapter11_Six";
		// 입력받는 파일들은 txt라고 가정
		File file = new File(path,args[0]+".txt");
		File newfile = new File(path,args[1]+".txt");
		
		if(file.exists()) {
			try {
				newfile.createNewFile();
				// 읽을 파일 이름으로 FileInputStream 생성
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fout = new FileOutputStream(newfile);
				// 인코딩을 위해
				InputStreamReader isr = new InputStreamReader(fis, "MS949");
				OutputStreamWriter osw = new OutputStreamWriter(fout, "MS949");
				
				while((data=isr.read())!=-1) {
					char c = (char)data;
					osw.write(c);
				}
				osw.flush();//OutputStreamWriter의 버퍼를 비운다. (출력한다.) 
				isr.close();
				osw.close();
				fis.close();
				fout.close();
				System.out.println("복사가 완료되었습니다.");
			}catch(FileNotFoundException e) {
				System.out.println(e);
			}catch (IOException e) {
				System.out.println(e);
			}catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.err.println("파일이 없습니다.");
		}
	}

}
