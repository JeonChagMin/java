package FallingWord;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class FallingWordFrame extends JFrame {
	private GamePanel gamePanel = null;
	private ControlPanel controlPanel = null;
	private Btn btn = null;
	private int num = 0;
	
	public FallingWordFrame() {
		super("�������� �ܾ� ���߱�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		btn = new Btn();
		c.add(btn);
		setSize(700, 650);
		setVisible(true);
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}

//	�������ڸ��� �ٷ� ���۵Ǳ� ������ �װ��� �����ϱ� ���� ���۹�ư ����
	class Btn extends JPanel {
		private GamePanel gamePanel = null;
		private ControlPanel controlPanel = null;
		private JButton start, end;
		private JLabel option;

		Btn() {
			setLayout(null);
			option = new JLabel("�ѹ��̶� Ʋ���� ���̴�");
			option.setSize(250,100);
			option.setFont(option.getFont().deriveFont(20.0f));
			option.setLocation(220,80);
			start = new JButton("start");
			start.setSize(100, 50);
			start.setLocation(200, 300);
			end = new JButton("end");
			end.setSize(100, 50);
			end.setLocation(400, 300);
			start.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Container c = getContentPane();
					gamePanel = new GamePanel();
					c.add(gamePanel, BorderLayout.CENTER);
					controlPanel = new ControlPanel(gamePanel);
					c.add(controlPanel, BorderLayout.SOUTH);
					setVisible(false);
					gamePanel.startGame();

				}
			});

			end.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			add(start);
			add(end);
			add(option);

		}

	}

	class ControlPanel extends JPanel {
		private GamePanel gamePanel;
		private JTextField input = new JTextField(15);
//		������ ��Ÿ���� ���� ���� ����
		int num=0;

		public ControlPanel(GamePanel gamePanel) {
			this.gamePanel = gamePanel;
			this.setLayout(new FlowLayout());
			this.setBackground(Color.LIGHT_GRAY);
			add(input);

			input.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JTextField tf = (JTextField) e.getSource();
					String text = tf.getText();
					if (text.equals("�׸�")) {
						System.exit(0);
					}

					if (!gamePanel.isGameOn()) {
						return;
					}

					boolean match = gamePanel.matchWord(text);
					if (match == true) {
//						gamePanel.printResult("����");
//						���� ��� ������ ������
						num++;
						setNum(num);
						gamePanel.printScore(num);
						gamePanel.stopGame();
						gamePanel.startGame();
						tf.setText("");
					} else {
//						gamePanel.printResult(tf.getText() + " Ʋ��");
						tf.setText("");
					}

				}
			});
		}
	}

	class GamePanel extends JPanel {
		private JLabel label = new JLabel();
		private JLabel resLabel = new JLabel();
		private Words words = null;
		private String fallingWord;
		private FallingThread thread = null;
		private boolean gameOn = false;
		private JLabel score = new JLabel();
		
//		���� �� ������ �� �ְ� ����� �ڵ�
//		���� �����ϴ� �����带 ����� ���� �������� run�� �����̴� �����带 ������ �����ϴ�.
		

		public GamePanel() {
//			for (int i = 0; i < mutiLabel.length; i++) {
//				mutiLabel[i] = new JLabel();
//				fallingWord[i] = null;
//			}
			setLayout(null);
			add(label);
//			add(mutiLabel[0]);
//			add(mutiLabel[1]);
//			add(mutiLabel[2]);
			score.setLocation(630, 0);
			score.setSize(100, 30);
			add(score);

//			time.setLocation(300, 0);
//			time.setSize(100, 30);
//			add(time);

			resLabel.setLocation(0, 0);
			resLabel.setSize(100, 30);
			add(resLabel);
			words = new Words("words.txt");
		}

		public boolean isGameOn() {
			return gameOn;
		}

		public void stopGame() {
			if (thread == null) {
				return;
			}
			thread.interrupt();
			thread = null;
			gameOn = false;
		}

		public void stopSelfAndNewGame() {
			startGame();
		}

		public void printResult(String text) {
			resLabel.setText(text);
		}

		public void printScore(int sc) {
			score.setText("���� " + sc);
		}

		public void printTimer(int num) {
//			time.setText("���� �ð� " + num);
		}

		public void startGame() {
//			�� �������� �����ϴ� �κ��� ������� ������ �Ѵ�.
//			FallingThread multithread[] = new FallingThread[3];
//			for (int i = 0; i < 3; i++) {
//				fallingWord[i] = words.getRandomWord();
//				mutiLabel[i].setText(fallingWord[i]);
//				mutiLabel[i].setSize(200, 30);
//				mutiLabel[i].setLocation(50 + 70 * (int) (Math.random() * 9), 0);
//				mutiLabel[i].setForeground(Color.magenta);
//				mutiLabel[i].setFont(new Font("Tahoma", Font.ITALIC, 20));
//				multithread[i] = new FallingThread(this, mutiLabel[i]);
//				multithread[i].start();
//			}
			fallingWord = words.getRandomWord();
			label.setText(fallingWord);
			label.setSize(200,30);
			label.setLocation(50+70*(int)(Math.random()*9),0);
			label.setFont(new Font("Tahoma", Font.ITALIC, 20));
			label.setForeground(Color.magenta);
			thread = new FallingThread(this,label);
			thread.start();
			gameOn = true;

		}

		public boolean matchWord(String text) {
			if (fallingWord != null && fallingWord.equals(text)) {
				return true;
//			} else if (fallingWord[1] != null && fallingWord[1].equals(text)) {
//				return true;
//			} else if (fallingWord[2] != null && fallingWord[2].equals(text)) {
//				return true;
//			} else {
			}
				return false;
		}

		class FallingThread extends Thread {
			private GamePanel panel;
			private JLabel label;
			private long delay = 200;
			private boolean falling = false;
			int speed = 15;
			private ControlPanel control;

			public FallingThread(GamePanel panel, JLabel label) {
				this.panel = panel;
				this.label = label;
			}

			public boolean isFalling() {
				return falling;
			}

			@Override
			public void run() {
				falling = true;
				while (true) {
					try {
						sleep(delay);
						int y = label.getY() + speed;
						if (y >= panel.getHeight() - label.getHeight()) {
							falling = false;
							label.setText("");
//							�������� �ܾ �Է����� ��������� ���� ��
//							panel.stopSelfAndNewGame();
							new DDD(getNum());
							break;
						}

						label.setLocation(label.getX(), y);
						GamePanel.this.repaint();
					} catch (InterruptedException e) {
						falling = false;
						return;
					}
				}
			}

		}

	}
	
	class DDD extends JDialog {
		
		DDD(int score) {
			add(btn);
			JButton btn1 = new JButton("������");
			btn1.setSize(90,40);
			btn1.setLocation(150,100);
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			add(btn1);
			setTitle("����� ����");
			setLayout(null);
			JDialog asd = new JDialog();
			JLabel sc = new JLabel("���� : "+score);
			sc.setSize(200,50);
			sc.setFont(sc.getFont().deriveFont(18.0f));
			sc.setLocation(30,20);
			add(sc);
			setSize(300,200);
			setVisible(true);
//			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
//	Ÿ�̸Ӹ� �ִ� ���� ���� �� ����غ���
//	class Timer extends Thread {
//		private GamePanel panel;
//		private JDialog result;
//		
//		int time;
//
//		public Timer(GamePanel panel, int time) {
//			this.panel = panel;
//			this.time = time;
//
//		}
//
//		@Override
//		public void run() {
//			while (true) {
//				try {
//					panel.printTimer(time);
//					sleep(1000);
//					time--;
//					if (time == 0) {
//						panel.printResult("Ÿ�� ����");
//						break;
//					}
//
//				} catch (Exception e) {
//				}
//			}
//		}
//	}

	class Words {
		private Vector<String> wordVector = new Vector<String>();

		public Words(String fileName) {
			try {
				Scanner s = new Scanner(new FileReader(fileName));
				while (s.hasNext()) {
					String word = s.nextLine();
					wordVector.add(word);
				}
				s.close();
			} catch (FileNotFoundException e) {
				System.out.println("file not found error");
				System.exit(0);
			}
		}

		public String getRandomWord() {
			final int WORDMAX = wordVector.size();
			int index = (int) (Math.random() * WORDMAX);
			return wordVector.get(index);
		}
	}

	public static void main(String[] args) {
		new FallingWordFrame();
	}
}
