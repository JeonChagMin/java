package GUI_Swing;

import java.awt.*;
import javax.swing.*;

public class Calculater extends JFrame{
	
	Calculater() {
		
		setTitle("내가 만든 계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(new BorderLayout(5,50));
		GridLayout grid = new GridLayout(4,3);
		grid.setVgap(5);
		grid.setHgap(5);
		Container a = new Container();
		a.setLayout(grid);
		JButton one = new JButton("1");
		one.setSize(30,20);
		JButton two = new JButton("2");
		two.setSize(30,20);
		JButton three = new JButton("3");
		three.setSize(30,20);
		JButton four = new JButton("4");
		four.setSize(30,20);
		JButton five = new JButton("5");
		five.setSize(30,20);
		JButton six = new JButton("6");
		six.setSize(30,20);
		JButton seven = new JButton("7");
		seven.setSize(30,20);
		JButton eight = new JButton("8");
		eight.setSize(30,20);
		JButton nine = new JButton("9");
		nine.setSize(30,20);
		JButton zero = new JButton("0");
		zero.setSize(30,20);
		JButton result = new JButton("=");
		result.setSize(30,20);
		a.add(seven);
		a.add(eight);
		a.add(nine);
		a.add(four);
		a.add(five);
		a.add(six);
		a.add(one);
		a.add(two);
		a.add(three);
		a.add(zero);
		a.add(result);
		
		Container j = new Container();
		GridLayout grid1 = new GridLayout(4,1);
		grid1.setVgap(5);
		grid1.setHgap(5);
		j.setLayout(grid1);
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton multi = new JButton("*");
		JButton division = new JButton("/");
		j.add(plus);
		j.add(minus);
		j.add(multi);
		j.add(division);
		
		JLabel la = new JLabel("계산결과");
		la.setSize(200,100);
		
		
		c.add(la,BorderLayout.NORTH);
		c.add(a,BorderLayout.CENTER);
		c.add(j,BorderLayout.EAST);
		setSize(200,400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Calculater();

	}

}
