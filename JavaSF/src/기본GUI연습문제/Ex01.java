package �⺻GUI��������;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex01 extends JFrame {
	JLabel jl = new JLabel("Love Java");

	Ex01() {
		setTitle("���콺 �ø��� ������ ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		jl.setSize(100,30);
		jl.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				jl.setText("Love Java");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				jl.setText("�ڹ� ����");
			}
		});
		
		c.add(jl);
		
		
		
		setSize(500,500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex01();

	}
}
