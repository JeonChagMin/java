package 기본GUI연습문제;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D1102_practice extends JFrame{
	
	private JLabel jl;
	int count=0;
	D1102_practice() {
		setTitle("이벤트 연습용");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new Center(),BorderLayout.CENTER);
		c.add(new South(),BorderLayout.SOUTH);
		
		setSize(500,500);
		setVisible(true);
	}
	
	class Center extends JPanel {
		Center(){
			setBackground(Color.white);
			jl= new JLabel(count+"");
			add(jl);
			setSize(250,250);
		}
	}
	
	class South extends JPanel {
		South(){
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		JButton btn = new JButton("Up");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton j = (JButton)e.getSource();
				count++;
				jl.setText(count+"");
			}
		});
		JButton btn1 = new JButton("Down");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton j = (JButton)e.getSource();
				count--;
				jl.setText(count+"");
			}
		});
		
		add(btn);
		add(btn1);
		}
	}
	
	public static void main(String[] args) {
		new D1102_practice();
	}
}
