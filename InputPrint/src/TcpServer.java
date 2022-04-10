
import java.io.*;
import java.net.*;

public class TcpServer {
	
	public final static int SERVER_PORT=9999;
	public static void main(String[] ar) {
		ServerSocket ss=null;
		try {
			ss=new ServerSocket(SERVER_PORT);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				System.out.println("Waiting connection...");
				Socket s=ss.accept();		//���� Socket �Ѱ���
				System.out.println("[ Connection Info ]");
				System.out.println("client address:"+s.getInetAddress());	//Ŭ���̾�Ʈ IP�ּ�
				System.out.println("client port:"+s.getPort());			//Ŭ���̾�Ʈ ��Ʈ ��ȣ
				System.out.println("my port:"+s.getLocalPort());		//��(Server, Local)�� ��Ʈ
				
				PrintWriter pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
				pw.println("Hello!! From server");
			
				pw.close();
				s.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}