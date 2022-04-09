
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
	
	URL url;
	BufferedReader input;
	String inLine;
	
	public URLReader(String site) {
		
		
		try {
			this.url = new URL(site);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//������ ������ ������ ǥ����¿� ���
	public void printPage() {
		try {
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			while((inLine = input.readLine()) != null) {
				System.out.println(inLine);
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//������ �������� ������ ������ ǥ����¿� ���
	public void printConnectionInfo() {
		try {
			URLConnection conn = url.openConnection();
			System.out.println(conn);
			System.out.println(conn.getURL() + "\n");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[]args) {
		String site = "http://www.infinitybooks/index.html";
		URLReader homePage = new URLReader(site);
		homePage.printConnectionInfo();
		homePage.printPage();
	}

}
