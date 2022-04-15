1  import java.io.*;
2  import java.net.*;
3  
4  public class MyClass {
5  	
6  	public static void main(String[]args) {
7  		int data;
8  		int num = 1;	//�� ��ȣ
9  		//�ҷ��� ���� ���  + �̸�
10  		String inFname = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11_one\\src\\MyClass.java";
11  		//���� ���� ���� ��� + �̸�
12  		String outFname = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11_one\\src\\MyNum.java";
13  		
14  		try {
15  			// ���� ���� �̸����� FileInputStream ����
16  			FileInputStream fis = new FileInputStream(inFname);
17  			FileOutputStream fout = new FileOutputStream(outFname);
18  			//���ڵ��� ����
19  			InputStreamReader isr = new InputStreamReader(fis, "MS949");
20  			OutputStreamWriter osw = new OutputStreamWriter(fout,"ms949");
21  			while((data = isr.read()) != -1) {
22  				char c = (char)data;
23  				if(num == 1){	//ù��° �ٿ� ��ȣ�� �ű� ���� ���� ó��
24  					osw.write(num+++"  ");
25  				}
26  				osw.write(c);
27  				if(c == '\n') {
28  					osw.write(num+++"  ");
29  				}
30  			}
31  			osw.flush();
32  			isr.close();
33  			osw.close();
34  			fis.close();
35  			fout.close();
36  			System.out.println(outFname + "  : ������ �����Ǿ����ϴ�.");
37  		}catch(FileNotFoundException e) {
38  			System.err.println("���� ������ �����ϴ�. : " + inFname);
39  		}catch(IOException e) {
40  			System.out.println(e);
41  		}
42  	}
43  
44  }
45  