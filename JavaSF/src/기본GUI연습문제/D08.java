package 기본GUI연습문제;

import java.awt.*;
import javax.swing.*;

public class D08 extends JFrame {

	D08() {
		setTitle("여러 개 패널 프레임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.add(new JButton("열기"));
		panel.add(new JButton("닫기"));
		panel.add(new JButton("나가기"));

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.setBackground(Color.yellow);
		panel1.add(new JButton("Word Input"));
		JTextField text = new JTextField(20);
		panel1.add(text);

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.white);
		panel2.setLayout(null);
		for (int i = 0; i < 10; i++) {
			int x = (int) (Math.random() * 350);
			int y = (int) (Math.random() * 350);
			JLabel jlabel = new JLabel("@");
			jlabel.setForeground(Color.red);
			jlabel.setLocation(x, y);
			jlabel.setSize(15, 15);
			jlabel.setOpaque(true);
			panel2.add(jlabel);
		}
 
		c.add(panel, BorderLayout.NORTH);
		c.add(panel1, BorderLayout.SOUTH);
		c.add(panel2, BorderLayout.CENTER);
		setSize(400, 500);
		setVisible(true);
	}

	class CenterPanel extends JPanel {
		
		CenterPanel() {
			JPanel panel2 = new JPanel();
			panel2.setBackground(Color.white);
			panel2.setLayout(null);
			for (int i = 0; i < 10; i++) {
				int x = (int) (Math.random() * 350);
				int y = (int) (Math.random() * 350);
				JLabel jlabel = new JLabel("@");
				jlabel.setForeground(Color.red);
				jlabel.setLocation(x, y);
				jlabel.setSize(15, 15);
				jlabel.setOpaque(true);
				panel2.add(jlabel);
			}

		}

	}

	class NorthPanel extends JPanel {
		
		NorthPanel() {

			JPanel panel = new JPanel();
			panel.setBackground(Color.gray);
			panel.add(new JButton("열기"));
			panel.add(new JButton("닫기"));
			panel.add(new JButton("나가기"));
		}
	}

	class SouthPanel extends JPanel {
		
		SouthPanel() {
			JPanel panel1 = new JPanel();
			panel1.setLayout(new FlowLayout());
			panel1.setBackground(Color.yellow);
			panel1.add(new JButton("Word Input"));
			JTextField text = new JTextField(20);
			panel1.add(text);

		}

	}

	public static void main(String[] args) {
		new D08();

	}

}
