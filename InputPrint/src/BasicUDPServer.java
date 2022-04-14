
import java.io.*;
import java.net.*;

public class BasicUDPServer {
	
	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress client;
	int sport = 7777, cport;
	
	public BasicUDPServer(int sport) {
		try {
			//DatagramPacket�� sport�� �����Ͽ� ����
			this.sport = sport;
			System.out.println(">> ������ �����մϴ�.");
			System.out.println(">> Ŭ���̾�Ʈ�� �����ϱ� ��ٸ��� �ֽ��ϴ�" + "\n");
			this.dsock = new DatagramSocket(sport);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void communicate() {
		try {
			//Ű����κ��� ������ ���ڿ��� �Է��ޱ� ���� BufferedReader ���·� ��ȯ
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				byte[] buffer = new byte[1024];
				
				//Ŭ���̾�Ʈ���� ���۵Ǵ� DatagramPacket�� �ޱ� ���� rPack ������ �� ���
				rPack = new DatagramPacket(buffer, buffer.length);
				
				dsock.receive(rPack);
				
				//���۹��� ����� ���ڿ��� ��ȯ
				//String (byte[] bytes, int offset, int length)
				String strIn = new String(rPack.getData(), 0, rPack.getData().length);
				
				//Ŭ���̾�Ʈ�� �ּҿ� ��Ʈ��ȣ�� ��ȯ
				client = rPack.getAddress();
				cport = rPack.getPort();
				
				//���۹��� ����� ����ϰ� quit�̸� ����
				System.out.println("[Ŭ���̾�Ʈ" + client + ":" + client + "]" + strIn );
				if(strIn.trim().equals("quits"))break;
				
				//ǥ���Է����� �Էµ� ������ DatagramPack���� ����� Ŭ���̾�Ʈ�� ����
				String strOut = br.readLine();
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);
				dsock.send(sPack);
				
			}
			System.out.println("UDP ������ �����մϴ�.");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[]args) {
		BasicUDPServer client = new BasicUDPServer(7777);
		client.communicate();
	}
	
	

}
