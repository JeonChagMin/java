package GUI_Swing;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class D1102_���콺Ŭ�� extends JFrame{
JLabel jl = new JLabel("Here");

	public D1102_���콺Ŭ��() {
		setTitle("���콺 Ŭ�� ������");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c= getContentPane();
//		c.addMouseListener(new MouseListener() {
//			@Override
//			public void mousePressed(MouseEvent e) {
//			int x = e.getX();
//			int y = e.getY();
//			jl.setLocation(x,y);
//			}
//			@Override
//			public void mouseReleased(MouseEvent e) {}
//			@Override
//			public void mouseExited(MouseEvent e) {}
//			@Override
//			public void mouseEntered(MouseEvent e) {}
//			@Override
//			public void mouseClicked(MouseEvent e) {}
//		});
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				jl.setLocation(x,y);
			}
		});
		c.setLayout(null);
		jl.setSize(50,20);
		jl.setLocation(30,30);
		c.add(jl);
		setSize(500,500);
		setVisible(true);

			
			
		
		
	}
	public static void main(String[] args) {
		new D1102_���콺Ŭ��();

	}
}
