package 기본GUI연습문제;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex07 extends JFrame{
	Ex07(){
		setTitle("마우스 클릭연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel j = new JLabel("C");
		c.add(j);
		j.setLocation(100,100);
		j.setSize(20,20);
		j.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JLabel j = (JLabel) e.getSource();
				Container c = j.getParent();
				int xBound=c.getWidth()-j.getWidth();
				int yBound=c.getHeight()-j.getHeight();
				int x = (int)(Math.random()*xBound);
				int y = (int)(Math.random()*xBound);
				j.setLocation(x,y);
			}
		});
		
		
		
		setSize(500,500);
		setVisible(true);
	}
	

	
	public static void main(String[] args) {
		new Ex07();
	}
}
