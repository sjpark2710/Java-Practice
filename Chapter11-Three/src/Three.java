import java.io.*;
import java.net.*;

public class Three {
	public static void main(String[]args) {
		String name = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11-Three\\src";
		
		File f = new File(name);
		File[] flist = f.listFiles();
		for(File i : flist) {
			if(i.isDirectory()) {
				System.out.print("���� : ");
			}else {
				System.out.print("���� : ");
			}
			System.out.println(i.getName());
		}
		
		
		
	}

}
