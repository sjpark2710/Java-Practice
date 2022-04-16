import java.io.*;

public class Four {
	public static void main(String[]args) {
		String path = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11_Four1";
		File f = new File(path,args[0]);
		try {
			f.mkdir();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
