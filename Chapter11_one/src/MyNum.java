1  import java.io.*;
2  import java.net.*;
3  
4  public class MyClass {
5  	
6  	public static void main(String[]args) {
7  		int data;
8  		int num = 1;	//줄 번호
9  		//불러올 파일 경로  + 이름
10  		String inFname = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11_one\\src\\MyClass.java";
11  		//새로 만들 파일 경로 + 이름
12  		String outFname = "C:\\Users\\seongjin\\eclipse-workspace\\Chapter11_one\\src\\MyNum.java";
13  		
14  		try {
15  			// 읽을 파일 이름으로 FileInputStream 생성
16  			FileInputStream fis = new FileInputStream(inFname);
17  			FileOutputStream fout = new FileOutputStream(outFname);
18  			//인코딩을 위해
19  			InputStreamReader isr = new InputStreamReader(fis, "MS949");
20  			OutputStreamWriter osw = new OutputStreamWriter(fout,"ms949");
21  			while((data = isr.read()) != -1) {
22  				char c = (char)data;
23  				if(num == 1){	//첫번째 줄에 번호를 매기 위한 예외 처리
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
36  			System.out.println(outFname + "  : 파일이 생성되었습니다.");
37  		}catch(FileNotFoundException e) {
38  			System.err.println("다음 파일이 없습니다. : " + inFname);
39  		}catch(IOException e) {
40  			System.out.println(e);
41  		}
42  	}
43  
44  }
45  