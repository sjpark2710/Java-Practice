
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatFile {
	public static void main(String[]args) {
		//읽을 파일 이름 지정
		String fname = "src/basicio/newfile.txt";
		
		//File 객체 생성
		File f = new File(fname);
		
		//실제 파일 존재 여부 확인
		if(! f.exists()) {
			//처음 실행하면 파일이 없으므로 실행됨
			System.out.println("다음 파일을 찾을 수 없습니다." + fname);
		}
		
		//새로 파일을 만들어 문자열을 쓰기
		try {
			f.createNewFile();
			if(f.exists()) {
				System.out.println("다음 파일이 있습니다 : " + fname);
			}
			FileWriter fr = new FileWriter(f);
			fr.write("파일 내용이 들어갑니다.");
			fr.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
