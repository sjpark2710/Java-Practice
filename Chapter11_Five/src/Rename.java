import java.io.*;

public class Rename {
	public static void main(String[]args) {
		String path = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11_Five\\src";
		File file = new File(path,args[0] + ".txt");
		File newfile = new File(path,args[1] + ".txt");
		if(file.exists()) {
			file.renameTo(newfile);
			System.out.println(args[0] + "->" + args[1]);
		}else {
			System.out.println(args[0] + ".txt라는 이름의 파일이 존재하지 않습니다.");
		}
	}

}
