
import java.io.*;
import java.net.*;

public class MsgReciever extends Thread{
	
	String nickname;
	Socket socket;
	BufferedReader in;
	
	public MsgReciever(String nickname, Socket socket) {
		this.nickname = "[" + nickname + "]";
		this.socket = socket;
		try {
			//���Ͽ� �Է� ��Ʈ���� ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		}catch(IOException e){
			System.out.println(e.toString());
		}
	}
	
	public void run() {
		while(in != null) {
			try {
				//�������κ��� ���� �޽����� ȭ�鿡 ���
				System.out.println(in.readLine());
			}catch(IOException e) {
				System.out.println(e.toString());
			}
		}
	}

}
