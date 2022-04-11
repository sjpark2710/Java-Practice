
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class MsgSender extends Thread{
	
	String nickname;
	Socket socket;
	PrintWriter out;
	
	public MsgSender(String nickname, Socket socket) {
		this.nickname = "[" + nickname+"]";
		this.socket = socket;
		try {
			//���Ͽ� ��� ��Ʈ���� ����
			out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		}catch(IOException e) {
			System.out.println(e.toString());
		}
	}
	
	public void run() {
		Scanner s = new Scanner(System.in);
		while(out != null) {
			String msg = s.nextLine();
			//������ ����� ������� �տ� �ٿ� ����
			out.println(nickname + msg);
			out.flush();
		}
	}

}
