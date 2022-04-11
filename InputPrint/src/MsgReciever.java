
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
			//소켓에 입력 스트림을 연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		}catch(IOException e){
			System.out.println(e.toString());
		}
	}
	
	public void run() {
		while(in != null) {
			try {
				//소켓으로부터 받은 메시지를 화면에 출력
				System.out.println(in.readLine());
			}catch(IOException e) {
				System.out.println(e.toString());
			}
		}
	}

}
