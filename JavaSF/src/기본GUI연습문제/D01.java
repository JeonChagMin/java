package �⺻GUI��������;

import java.awt.*;
import javax.swing.JFrame;

public class D01 extends JFrame {
	
	D01() {
		setTitle("�ڹ� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		setSize(400,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D01();

	}

}
