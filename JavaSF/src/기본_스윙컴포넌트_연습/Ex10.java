package �⺻_����������Ʈ_����;

import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.*;

public class Ex10 extends JFrame {
	String num[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	JLabel[] jb = new JLabel[num.length];
	int n = 0;
	int x;
	int y;
	Container c;
	Set<Point> sp = new HashSet<Point>();

	Ex10() {
		setTitle("Ten ���̺�Ŭ��");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(null);
		setSize(500, 500);
		setVisible(true);
		
		shuffle();

	}
//	���� �޼ҵ带 ����
	void shuffle() {
		c=getContentPane();
		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JLabel(num[i]);
			jb[i].setSize(15, 15);
			x = c.getWidth() - jb[i].getWidth();
			y = c.getHeight() - jb[i].getHeight();
			jb[i].addMouseListener(new Mymouse());
			c.add(jb[i]);
		}
		while (true) {
			if (sp.size()==jb.length) {
				break;
			}
			int xBound = (int) (Math.random() * x);
			int yBound = (int) (Math.random() * y);
			sp.add(new Point(xBound,yBound));
		}
		int dex=0;
		for (Point p : sp) {
			jb[dex].setLocation(p.x1,p.y1);
			dex++;
		}
		
		c.repaint();
	}

	class Mymouse implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			JLabel a = (JLabel) e.getSource();
			if (jb[n] == a) {
				a.setVisible(false);
				n++;
				if (n == 10) {
//					9�� Ŭ���ϸ� n�� 10�� �ǹǷ� ������ �ٽ��ϰ� �ٽ� 0���� �ʱ�ȭ
					n = 0;
					sp.clear();
					shuffle();
				}
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	}
	
	class Point {
		int x1;
		int y1;
		Point(int x, int y) {
			this.x1=x;
			this.y1=y;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Point) {
				Point point = (Point) obj;
				return point.x1==x1 && point.y1==y1;
			}else {
			return false;
			}
		}
	}

	public static void main(String[] args) {
		new Ex10();
	}
}
