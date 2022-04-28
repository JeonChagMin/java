package GUI_Swing;

import javax.swing.*;

public class MyFrame extends JFrame{
	MyFrame() {
		setTitle("300X300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
	}

}
