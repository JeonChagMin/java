package �⺻GUI��������;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex02 extends JFrame {
	JPanel j = new JPanel();
	
	Ex02() {
		setTitle("�巡�� ���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		j.setBackground(Color.white);
		j.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Container c = (Container)e.getSource();
				j.setBackground(Color.yellow);
			}
		});
		j.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Container c = (Container)e.getSource();
				j.setBackground(Color.white);
			}
			
		});
		c.add(j);
		
		
		setSize(500,500);
		setVisible(true);
//		j.setFocusable(true);
//		j.requestFocus();
//		key event �� ���� ����Ѵ�.

	}

	public static void main(String[] args) {
		new Ex02();
	}

}
