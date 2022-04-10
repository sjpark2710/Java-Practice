public class MultiChatClient {
  private Scanner scan = new Scanner(System.in);
  private String name;

  // 1. ���� �޼���
  public void clientStart() {

  // 2. ��ȭ�� �Է¹ޱ�
  System.out.prin("��ȭ�� : ");
  name = scan.next();

  Socket socket = null;

try {
socket = new Socket("192.168.45.2", 7777);

System.out.println("������ ����Ǿ����ϴ�.");

// 8.
// 9.
} catch (UnknownHostException e) {
  e.printStackTrace();
} catch (IOException e) {
  e.printStackTrace();
}
}

  // ������ �޽����� receive & �� �޽��� send -> sender, receiver �Ѵ� �ʿ�

  // 3. �޽����� �����ϴ� Thread (����Ŭ����)
  class ClientSender extends Thread {
    private Socket socket;
    private DataOutputStream dos;
    private String name;

    public ClientSender(Socket socket, String name) {
      this.socket = socket;
      this.name = name;

    try {
      dos = new DataOutputStream(socket.getOutputStream());
    } catch (IOException e) {
      e.printStackTrace();
    }

    @Override
    public void run() {
      try {
      // 4. �������ڸ��� �ڽ��� ��ȭ���� ���÷� ����
        if(dos != null) {
          dos.writeUTF(name);
        }

        while(dos!= null) {
          // 5. Ű����� �Է¹��� �޽����� ������ ����
          dos.writeUTF(scan.nextLine());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  } // ����Ŭ����
  
  // 6. ���ſ� Thread Ŭ����
  class ClientReceiver extends Thread {
    private Socket socket;
    private DataInputStream dis;

    public ClientReceiver(Socket socket) {
      this.socket = socket;

      try {
        dis = new DataInputStream(socket.getInputStream());
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
    @Override
    public void run() {
      while (dis != null) {
        try {
          // 7. �����κ��� ������ �޽��� ����ϱ�
          System.out.println(dis.readUTF());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }// ����Ŭ����

  public static void main(String[] args) {
      new MultiChatClient().clientStart();
  }
} // MultiChatClient class