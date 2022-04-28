package 기본GUI연습문제;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class D07 extends JFrame{
	D07(){
		setTitle("계산기 프레임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new BorderLayout());
		GridLayout grid = new GridLayout(4,4,5,5);
		Container a = new Container();
		a.setLayout(grid);
		for (int i = 0; i < 10; i++) {
			a.add(new JButton(i+""));
		}
		a.add(new JButton("CE"));
		a.add(new JButton("계산"));
		JButton btn = new JButton("+");
		btn.setBackground(Color.CYAN);
		JButton btn1 = new JButton("-");
		btn1.setBackground(Color.CYAN);
		JButton btn2 = new JButton("X");
		btn2.setBackground(Color.CYAN);
		JButton btn3 = new JButton("/");
		btn3.setBackground(Color.CYAN);
		a.add(btn);
		a.add(btn1);
		a.add(btn2);
		a.add(btn3);
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jp.setBackground(Color.gray);
		JTextField text = new JTextField(25);
		jp.add(new JLabel("수식입력"));
		jp.add(text);
		
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp1.setBackground(Color.yellow);
		JTextField text1 = new JTextField(25);
		jp1.add(new JLabel("계산 결과"));
		jp1.add(text1);
		
		
		c.add(jp1,BorderLayout.SOUTH);
		c.add(jp,BorderLayout.NORTH);
		c.add(a,BorderLayout.CENTER);
		setSize(500,400);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new D07();
	}

}
