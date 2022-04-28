package 기본_스윙컴포넌트_연습;

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
		setTitle("Ten 레이블클릭");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(null);
		setSize(500, 500);
		setVisible(true);
		
		shuffle();

	}
//	섞는 메소드를 생성
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
//					9를 클릭하면 n이 10이 되므로 셔플을 다시하고 다시 0으로 초기화
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
