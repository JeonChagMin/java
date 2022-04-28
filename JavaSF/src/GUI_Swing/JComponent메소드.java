package GUI_Swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JComponent메소드 extends JFrame{
	JComponent메소드() {
		setTitle("레이블 에제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다");
		ImageIcon beauty = new ImageIcon("images\\beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon nor = new ImageIcon("images\\normalicon.gif");
		JLabel label = new JLabel("보고 싶으면 전화하세요",nor,SwingConstants.LEFT);
		label.setSize(300,300);
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(600,800);
		setVisible(true);
		
		
		
		
		}

	public static void main(String[] args) {
		new JComponent메소드();

	}

}
