
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Two extends JFrame implements ActionListener{
	
	Panel btnPanel;		//버튼이 들어가는 panel
	 int x[] = {130, 180, 230, 205, 155};
	 int y[] = {180, 140, 180, 230, 230};
	 
	 Button pentagonBtn;
	 Button redBtn;
	 Button yellowBtn;
	 Button blueBtn;
	 Button blackBtn;
	 
	 Color color;
	 
	 //생성자
	 public Two(String title) {
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(500, 300);
		 setVisible(true);
		 drawPentagon();
	 }
	 
	 public void drawPentagon() {
		 btnPanel = new Panel();
		 pentagonBtn = new Button("pentagon");
		 redBtn = new Button("red");
		 yellowBtn = new Button("yellow");
		 blueBtn = new Button("blue");
		 blackBtn = new Button("black");
		 
		 color = Color.black;
		 
		 btnPanel.setLayout(new FlowLayout());
		 btnPanel.add(pentagonBtn);
		 btnPanel.add(redBtn);
		 btnPanel.add(yellowBtn);
		 btnPanel.add(blueBtn);
		 btnPanel.add(blackBtn);
		 
		 add(btnPanel, BorderLayout.NORTH);
		 
		 //버튼에 액선 리스너 추가
		 pentagonBtn.addActionListener(this);
		 redBtn.addActionListener(this);
		 yellowBtn.addActionListener(this);
		 blueBtn.addActionListener(this);
		 blackBtn.addActionListener(this);
		 
	 }
	 public void paint(Graphics g) {
		 g.setColor(color);
		 g.fillPolygon(new Polygon(x, y, 5));
	 }
	 
	 public static void main(String[]args) {
		 Two t = new Two("문제 2번");
	 }
	 
	 public void actionPerformed(ActionEvent e) {
		 
		 String strBtn = e.getActionCommand();
		 if(strBtn.equals("pentagon")) {
			 repaint();
		 }else {
			 setTitle(strBtn);
			 switch(strBtn) {
			 case "red" :
				 color = Color.red;
				 break;
			 case "yellow" :
				 color = Color.yellow;
				 break;
			 case "blue" :
				 color = Color.blue;
				 break;
			 case "black" :
				 color = Color.black;
				 break;
			default : 
				break;
			 
			 }
		 }
		 
		 
	 }
	 
	 
	 
	 
	 

}
