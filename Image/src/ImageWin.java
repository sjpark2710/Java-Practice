
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageWin extends JFrame{
	
	private static final long serialVERSIONUID = 1L;
	
	public ImageWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("image.png","대자연 풍경");
		JLabel lb = new JLabel(img);
		add(lb);
		Integer height = new Integer(img.getIconHeight());
		Integer width = new Integer(img.getIconWidth());
		JLabel size = new JLabel(img.getDescription() + ":" + height + " "+height);
		add(size, "South");
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[]args) {
		new ImageWin().setTitle("그림 처리");
	}

}
