package GUI_Swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame{
	ButtonEx(){
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalicon = new ImageIcon("images\\normalicon.gif");
		ImageIcon roll = new ImageIcon("images\\rollovericon.gif");
		ImageIcon pressed = new ImageIcon("images\\pressedicon.gif");
		
		JButton btn = new JButton("call~",normalicon);
		btn.setPressedIcon(pressed);
		btn.setRolloverIcon(roll);
		
		c.add(btn);
		setSize(250,150);
		setVisible(true);
	}
	
public static void main(String[] args) {
	new ButtonEx();
}
}
