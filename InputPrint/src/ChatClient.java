import java.io.*;
import java.net.*;

public class ChatClient {
	
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	
	public ChatClient (String ip, int port) {
		try {
			socket = new Socket(ip, port);
			printInfo();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void communicate() {
		MsgSender sender = new MsgSender("Ŭ���̾�Ʈ", socket);
		MsgReciever receiver = new MsgReciever("Ŭ���̾�Ʈ", socket);
		
		//sender�� receiver�� ������ ����
		sender.start();
		receiver.start();
	}
	
	public void close() {
		try {
			//Ŭ���̾�Ʈ ���� ����
			socket.close();
		}catch(IOException e) {
			System.out.println(e.toString());
		}
	}
	
	public void printInfo() {
		System.out.println(">>>  ���� ���ӿ� �����߽��ϴ�.");
		//���� ��Ʈ ��ȣ�� Ŭ���̾�Ʈ �ּҿ� ��Ʈ��ȣ ���
		System.out.println("     Ŭ���̾�Ʈ ��Ʈ��ȣ : " + socket.getLocalPort());
		System.out.println("     ���� �ּ� : " + socket.getInetAddress());
		System.out.println("     ���� ��Ʈ ��ȣ : " + socket.getPort() + '\n');
		System.out.println(">>>  ������ ������ �޽����� ���� enter�� ��������" + '\n');
	}
	
	public static void main(String[]args) {
		//���� �ּҿ� ��Ʈ��ȣ�� �����Ͽ� ������ ����
		ChatClient client = new ChatClient("127.0.0.1",7070);
		
		//������ ���
		client.communicate();
	}

}
