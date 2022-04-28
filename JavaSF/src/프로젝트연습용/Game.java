package 프로젝트연습용;

import java.awt.*;

import java.awt.event.*;
import java.util.Iterator;
import javax.swing.*;

import 프로젝트연습용.Game.Easy;
import 프로젝트연습용.Game.Falling;

public class Game extends JFrame {
	String[] name = { "Easy", "Normal", "Hard" };
	JRadioButton[] jc = new JRadioButton[name.length];
	JLabel jl;
	int n = 5;

	Game() {
		setTitle("똥 피하기 게임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(Color.white);
		c.add(new Score(), BorderLayout.NORTH);
		c.add(new Level(), BorderLayout.CENTER);
		setSize(460, 500);
		setVisible(true);
	}

	class Score extends JPanel {
		Score() {
			JLabel jl = new JLabel("*************************** 똥 피하기 게임 ***************************");
			add(jl);
		}
	}

	class Level extends JPanel {
		private Easy easy;
		private Normal normal;
		private Hard hard;

		Level() {
			setLayout(null);
			ButtonGroup bg = new ButtonGroup();
			MyListener listener = new MyListener();
			for (int i = 0; i < jc.length; i++) {
				jc[i] = new JRadioButton(name[i]);
				jc[i].addItemListener(listener);
				bg.add(jc[i]);
				jc[i].setSize(100, 50);
				jc[i].setLocation(190, 50 + i * 50);
				add(jc[i]);
			}

			JButton btn = new JButton("시작");
			add(btn);
//			어차피 버튼마다 실행하는 것이 다르기 때문에 각각 이벤트를 달아줘야한다.
			btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (n == 0) {
						Container a = getContentPane();
						setVisible(false);
						easy = new Easy();
						easy.startGame();
						a.add(easy);

					} else if (n == 1) {
						Container a = getContentPane();
						setVisible(false);
						normal = new Normal();
						normal.startGame();
						a.add(normal);
					} else if (n == 2) {
						Container a = getContentPane();
						setVisible(false);
					}
				}
			});

			btn.addActionListener(null);
			btn.setSize(70, 30);
			btn.setLocation(130, 230);

//			종료버튼을 누르면 종료된다
			JButton btn1 = new JButton("종료");
			btn1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					System.exit(0);
				}
			});
			btn1.setSize(70, 30);
			btn1.setLocation(230, 230);
			add(btn1);
		}

	}

	class MyListener implements ItemListener {
//		난이도를 입력했을 경우 숫자를 변경하여 어떤 클래스를 불러올지 만들어야한다.
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getItem() == jc[0]) {
					n = 0;
				} else if (e.getItem() == jc[1]) {
					n = 1;
				} else if (e.getItem() == jc[2]) {
					n = 2;
				}
			}

		}

	}

	class Easy extends JPanel {
		ImageIcon dd = new ImageIcon("images\\ddong.png");
		Image img = dd.getImage();
		Image changeImage = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImage);
		JLabel ddong = new JLabel(changeIcon);
		JLabel enemy[] = new JLabel[10];

		ImageIcon pImage = new ImageIcon("images\\player.png");
		Image pimg = pImage.getImage();
		Image playerImage = pimg.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon playerIcon = new ImageIcon(playerImage);
		JLabel player = new JLabel(playerIcon);
		int[] ok = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 };
		boolean stop = true;
		Container a;
		int x = 40;

		Easy() {
			a = getContentPane();
			a.setLayout(null);
			player.setSize(30, 30);
			player.setLocation(40, 380);
			a.add(player);
//			좌우 키를 누를경우 플레이어가 움직이는 이벤트 설정
			a.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					int num = 40;
					switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT:
						x -= num;
						if (x <= 40) {
							x = 40;
						}
						player.setLocation(x, 380);
						a.repaint();
						break;

					case KeyEvent.VK_RIGHT:
						x += num;
						if (x >= 400) {
							x = 400;
						}
						player.setLocation(x, 380);
						a.repaint();

						break;
					}
				}
			});
			a.requestFocus();
		}

		void startGame() {
			Replay newReplay[] = new Replay[4];
			for (int i = 0; i < newReplay.length; i++) {
				newReplay[i] = new Replay(this);
				newReplay[i].start();
			}

			for (int i = 0; i < newReplay.length; i++) {
				Falling play = new Falling(this);
				play.start();
			}
		}
	}

	class Normal extends JPanel {

		ImageIcon pImage = new ImageIcon("images\\player.png");
		Image pimg = pImage.getImage();
		Image playerImage = pimg.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon playerIcon = new ImageIcon(playerImage);
		JLabel player = new JLabel(playerIcon);
		int[] ok = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 };
		private Falling thread = null;
		boolean stop = true;
		private Replay newThread = null;
		Container a;
		int x = 40;

		Normal() {
			a = getContentPane();
			a.setLayout(null);
			player.setSize(30, 30);
			player.setLocation(40, 380);
			a.add(player);
//			startGame();
			a.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					int num = 40;
					switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT:
						x -= num;
						if (x <= 40) {
							x = 40;
						}
						player.setLocation(x, 380);
						a.repaint();
						break;

					case KeyEvent.VK_RIGHT:
						x += num;
						if (x >= 400) {
							x = 400;
						}
						player.setLocation(x, 380);
						a.repaint();

						break;
					}
				}
			});
			a.requestFocus();
		}

		void startGame() {
			Replay newReplay[] = new Replay[6];
			for (int i = 0; i < newReplay.length; i++) {
				newReplay[i] = new Replay(this);
				newReplay[i].start();
			}

			for (int i = 0; i < newReplay.length; i++) {
				Falling play = new Falling(this);
				play.start();
			}
		}
	}

	class Hard extends JPanel {

		ImageIcon pImage = new ImageIcon("images\\player.png");
		Image pimg = pImage.getImage();
		Image playerImage = pimg.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon playerIcon = new ImageIcon(playerImage);
		JLabel player = new JLabel(playerIcon);
		int[] ok = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 };
		private Falling thread = null;
		boolean stop = true;
		private Replay newThread = null;
		Container a;
		int x = 40;

		Hard() {
			a = getContentPane();
			a.setLayout(null);
			player.setSize(30, 30);
			player.setLocation(40, 380);
			a.add(player);
			a.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					int num = 40;
					switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT:
						x -= num;
						if (x <= 40) {
							x = 40;
						}
						player.setLocation(x, 380);
						a.repaint();
						break;

					case KeyEvent.VK_RIGHT:
						x += num;
						if (x >= 400) {
							x = 400;
						}
						player.setLocation(x, 380);
						a.repaint();

						break;
					}
				}
			});
			a.requestFocus();
		}

		void startGame() {
			Replay newReplay[] = new Replay[6];
			for (int i = 0; i < newReplay.length; i++) {
				newReplay[i] = new Replay(this);
				newReplay[i].start();
			}

			for (int i = 0; i < newReplay.length; i++) {
				Falling play = new Falling(this);
				play.start();
			}
		}
	}

	class Falling extends Thread {
//		똥이 떨어지는 스레드
		Replay rePlay;
		private JLabel label;
		private JLabel gameOver = new JLabel("Game Over");
		int delay;
		int speed;
		JLabel player;
		boolean stop;

		public Falling(JPanel panel) {
			if (panel instanceof Easy) {
				delay = 300;
				speed = 15;
				player = ((Easy) panel).player;
				stop = ((Easy) panel).stop;
			} else if (panel instanceof Normal) {
				this.label = label;
				delay = 300;
				speed = 15;
				player = ((Normal) panel).player;
				stop = ((Normal) panel).stop;
			} else {
				this.label = label;
				delay = 300;
				speed = 30;
				player = ((Hard) panel).player;
				stop = ((Hard) panel).stop;
			}
		}

		@Override
		public void run() {

			while (true) {

				try {
					sleep(delay);
					System.out.println(rePlay.ddong.getX());

					int y = label.getY() + speed;
					label.setLocation(label.getX(), y);
					if (player.getX() == label.getX() && player.getY() == label.getY()) {
						player.setVisible(false);
						label.setVisible(false);
//						플레이어가 똥에 맞을경우 stop이 false가 되고 시스템이 종료가 됩니다.
						stop = false;
						break;
					}

					if (player.getY() <= label.getY()) {
//						똥이 바닥에 닿으면 보이지 않게 설정
						label.setVisible(false);
					}
					repaint();
				} catch (InterruptedException e) {
					return;
				}

			}
		}
	}

	class Replay extends Thread {
//		똥 이미지를 설정하는 스레드
		ImageIcon dd = new ImageIcon("images\\ddong.png");
		Image img = dd.getImage();
		Image changeImage = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImage);
		JLabel ddong;
		JLabel enemy[] = new JLabel[10];
		int delay;
		boolean stop;
		JPanel panel;

		public Replay(JPanel panel) {
			if (panel instanceof Easy) {
				this.panel = panel;
				delay = 2000;
				stop = ((Easy) panel).stop;
			} else if (panel instanceof Normal) {
				this.panel = panel;
				delay = 2000;
				stop = ((Normal) panel).stop;
			} else {
				this.panel = panel;
				delay = 2000;
				stop = ((Hard) panel).stop;
			}

		}

		@Override
		public void run() {
			try {
				sleep(delay);

				ddong = new JLabel(changeIcon);
				ddong.setSize(30, 30);
				ddong.setLocation(40 + 40 * (int) (Math.random() * 9), 20);
				add(ddong);
				repaint();

				if (stop == false) {
//					게임이 끝나면 모든 똥 사진을 안 보이도록 설정
					ddong.setVisible(false);
				}
			} catch (InterruptedException e) {
				return;
			}

		}

	}

	public static void main(String[] args) {
		new Game();
	}

}
