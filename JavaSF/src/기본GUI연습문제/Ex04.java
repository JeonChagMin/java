package �⺻GUI��������;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 extends JFrame{
	String word="Love Java";
	JLabel j = new JLabel(word);
	
	Ex04(){
		setTitle("�� ���ھ� �̵�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_LEFT:
					String start = word.substring(1);
					String end = word.substring(0,1);
					word=start+end;
					j.setText(word);
					break;
				}
			}
		});
		j.setSize(200,100);
		j.setLocation(100,100);
		c.setFocusable(true);
		c.add(j);
		
		
		
		setSize(500,500);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
