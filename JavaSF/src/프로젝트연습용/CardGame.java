package 프로젝트연습용;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardGame extends JFrame {
	Deck d = new Deck();
	JLabel jls;
	JLabel jls1;
	JLabel jlw;
	JLabel jlw1;
	JLabel jle;
	JLabel jle1;
	JLabel jln;
	JLabel jln1;

	CardGame() {
		setTitle("Card Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(new BorderLayout());
		c.add(new Center(), BorderLayout.CENTER);
		c.add(new South(), BorderLayout.SOUTH);
		c.add(new West(), BorderLayout.WEST);
		c.add(new North(), BorderLayout.NORTH);
		c.add(new East(), BorderLayout.EAST);

		setSize(500, 500);
		setVisible(true);

	}

	class Center extends JPanel {
		South s = new South();
		North n = new North();
		West w = new West();
		East ea = new East();

		Center() {
			setLayout(null);
			JButton btn = new JButton("start");
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton j = (JButton) e.getSource();
					Deck d = new Deck();
					jls.setText(d.card[0] + "");
					jls1.setText(d.card[1] + "");
					jln.setText(d.card[2] + "");
					jln1.setText(d.card[3] + "");
					jlw.setText(d.card[4] + "");
					jlw1.setText(d.card[5] + "");
					jle.setText(d.card[6] + "");
					jle1.setText(d.card[7] + "");
				}
			});

			btn.setSize(75, 30);
			btn.setLocation(150, 200);
			add(btn);

		}

	}

	class South extends JPanel {
		JLabel name = new JLabel("Player2", JLabel.CENTER);

		South() {
			setLayout(new BorderLayout(5, 5));
			JPanel jp = new JPanel();
			jp.setLayout(new FlowLayout());
			jls = new JLabel("", JLabel.CENTER);
			jls1 = new JLabel("", JLabel.CENTER);
			add(name, BorderLayout.NORTH);
			jp.add(jls);
			jp.add(jls1);
			add(jp, BorderLayout.CENTER);

		}
	}

	class West extends JPanel {
		JLabel name = new JLabel("Player1", JLabel.CENTER);

		West() {
			setLayout(new BorderLayout(5, 5));
			JPanel jp = new JPanel();
			jp.setLayout(new FlowLayout());
			jlw = new JLabel("", JLabel.CENTER);
			jlw1 = new JLabel("", JLabel.CENTER);
			add(name, BorderLayout.NORTH);
			jp.add(jlw);
			jp.add(jlw1);
			add(jp, BorderLayout.CENTER);
		}
	}

	class North extends JPanel {
		JLabel name = new JLabel("Player3", JLabel.CENTER);

		North() {
			setLayout(new BorderLayout(5, 5));
			JPanel jp = new JPanel();
			jp.setLayout(new FlowLayout());
			jln = new JLabel("", JLabel.CENTER);
			jln1 = new JLabel("", JLabel.CENTER);
			add(name, BorderLayout.NORTH);
			jp.add(jln);
			jp.add(jln1);
			add(jp, BorderLayout.CENTER);
		}
	}

	class East extends JPanel {
		JLabel name = new JLabel("Player4", JLabel.CENTER);

		East() {
			setLayout(new BorderLayout(5, 5));
			JPanel jp = new JPanel();
			jp.setLayout(new FlowLayout());
			jle = new JLabel("", JLabel.CENTER);
			jle1 = new JLabel("", JLabel.CENTER);
			add(name, BorderLayout.NORTH);
			jp.add(jle);
			jp.add(jle1);
			add(jp,BorderLayout.CENTER);
		}
	}

	public static void main(String[] args) {
		new CardGame();
	}
}

class Card {
	String name;
	int num;

	Card() {

	}

	Card(String n, int nu) {
		name = n;
		num = nu;
	}

	@Override
	public String toString() {
		return name + "\r\n";
	}

}

class Deck {
	Card[] card;

	Deck() {
		card = new Card[24];
		for (int i = 0; i < 12; i++) {
			if (i == 0 || i == 2 || i == 7) {
				card[i] = new Card(i + 1 + "광", i + 1);
			} else {
				card[i] = new Card(i + 1 + "", i + 1);
			}
		}

		for (int i = 12; i < card.length; i++) {
			card[i] = new Card(i - 12 + 1 + "", i + 1 - 12);
		}

		for (int i = 0; i < 100; i++) {
			int start = (int) (Math.random() * card.length);
			int end = (int) (Math.random() * card.length);
			Card imsi = new Card();
			imsi = card[start];
			card[start] = card[end];
			card[end] = imsi;
		}

	}
}