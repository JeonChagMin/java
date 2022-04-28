package Project;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CreateRoomDisplay extends JDialog implements ActionListener, ItemListener {

	private ClientThread client;
	private String roomName, str_password;
	private int roomMaxUser, isRock;

	private JFrame main;
	private Container c;
	private JTextField tf;
	private JPanel radioPanel;
	private JRadioButton radio1, radio2, radio3, radio4, rock, unrock;
	private JPasswordField password;
	private JButton ok, cancel;

	public CreateRoomDisplay(JFrame frame, ClientThread client) {
		super(frame, true);
		main = frame;
		setTitle("대화방 개설");
		this.client = client;
		isRock = 0;
		roomMaxUser = 2;
		str_password = "0";

		c = getContentPane();
		c.setLayout(null);

		JLabel label;
		label = new JLabel("방제목");
		label.setBounds(10, 10, 100, 20);
		label.setForeground(Color.blue);
		c.add(label);

		tf = new JTextField();
		tf.setBounds(10, 30, 270, 20);
		tf.addKeyListener(new KeyListener() {
//			--------------------------------------------------------------------
//			방을 생성하는 것도 클릭만이 아닌 Enter 키 입력도 가능
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
						if (tf.getText().equals("")) {
							int result = JOptionPane.showConfirmDialog(main, "방제목을 입력하세요 \n Yes:자동입력 \tNo:직접입력 ", "대화방개설", JOptionPane.YES_NO_OPTION);
							if(result== JOptionPane.CLOSED_OPTION) {}
							else if(result == JOptionPane.YES_OPTION) {
								Calendar time = Calendar.getInstance();
								ChatClient cc = new ChatClient();
								SimpleDateFormat format0 = new SimpleDateFormat("HH:mm");
								String autoName = cc.getId()+" 님의 방 ("+format0.format(time.getTime())+")";
								tf.setText(autoName);}
						} else {
							roomName = tf.getText();
							if (isRock == 1) {
								str_password = password.getText();
							}
							if (isRock == 1 && str_password.equals("")) {
								JOptionPane.showMessageDialog(main, "비밀번호를 입력하세요", "대화방 개설.", JOptionPane.ERROR_MESSAGE);
							} else {
								client.requestCreateRoom(roomName, roomMaxUser, isRock, str_password);
								dispose();
							}
						}
				}
				
			}
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
		});
//			--------------------------------------------------------------------
		c.add(tf);
		
		label = new JLabel("최대인원");
		label.setForeground(Color.blue);
		setBounds(10, 60, 100, 20);
		c.add(label);

		radioPanel = new JPanel();
		radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		ButtonGroup group = new ButtonGroup();
		radio1 = new JRadioButton("2명");
		radio1.setSelected(true);
		radio1.addItemListener(this);
		group.add(radio1);
		radio2 = new JRadioButton("3명");
		radio2.addItemListener(this);
		group.add(radio2);
		radio3 = new JRadioButton("4명");
		radio3.addItemListener(this);
		group.add(radio3);
		radio4 = new JRadioButton("5명");
		radio4.addItemListener(this);
		group.add(radio4);
		radioPanel.add(radio1);
		radioPanel.add(radio2);
		radioPanel.add(radio3);
		radioPanel.add(radio4);
		radioPanel.setBounds(10, 80, 280, 20);
		c.add(radioPanel);

		label = new JLabel("공개여부");
		label.setForeground(Color.blue);
		label.setBounds(10, 110, 100, 20);
		c.add(label);

		radioPanel = new JPanel();
		radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		group = new ButtonGroup();
		unrock = new JRadioButton("공개");
		unrock.setSelected(true);
		unrock.addItemListener(this);
		group.add(unrock);
		rock = new JRadioButton("비공개");
		rock.addItemListener(this);
		group.add(rock);
		radioPanel.add(unrock);
		radioPanel.add(rock);
		radioPanel.setBounds(10, 130, 280, 20);
		c.add(radioPanel);

		label = new JLabel("비밀번호");
		label.setForeground(Color.blue);
		label.setBounds(10, 160, 100, 20);
		c.add(label);

		password = new JPasswordField();
		password.setBounds(10, 180, 150, 20);
		password.setEditable(false);
		c.add(password);

		ok = new JButton("확 인");
		ok.setForeground(Color.blue);
		ok.setBounds(75, 220, 70, 30);
		ok.addActionListener(this);
		c.add(ok);

		cancel = new JButton("취 소");
		cancel.setForeground(Color.blue);
		cancel.setBounds(155, 220, 70, 30);
		cancel.addActionListener(this);
		c.add(cancel);

		Dimension dim = getToolkit().getScreenSize();
		setSize(300, 300);
		setLocation(dim.width / 2 - getWidth() / 2, dim.height / 2 - getHeight() / 2);
		show();

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				tf.requestFocusInWindow();
			}
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		if (ie.getSource() == unrock) {
			isRock = 0;
			str_password = "0";
			password.setText("");
			password.setEditable(false);
		} else if (ie.getSource() == rock) {
			isRock = 1;
			password.setEditable(true);
		} else if (ie.getSource() == radio1) {
			roomMaxUser = 2;
		} else if (ie.getSource() == radio2) {
			roomMaxUser = 3;
		} else if (ie.getSource() == radio3) {
			roomMaxUser = 4;
		} else if (ie.getSource() == radio4) {
			roomMaxUser = 5;
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == ok) {
			if (tf.getText().equals("")) {
//			---------------------
//				기존
//				JOptionPane.showMessageDialog(main, "방제목을 입력하세요", "대화방 개설.", JOptionPane.ERROR_MESSAGE);
//				추가
				int result = JOptionPane.showConfirmDialog(main, "방제목을 입력하세요 \n Yes:자동입력 \tNo:직접입력 ", "대화방개설", JOptionPane.YES_NO_OPTION);
				if(result== JOptionPane.CLOSED_OPTION) {}
				else if(result == JOptionPane.YES_OPTION) {
					Calendar time = Calendar.getInstance();
					ChatClient cc = new ChatClient();
					SimpleDateFormat format0 = new SimpleDateFormat("HH:mm");
					String autoName = cc.getId()+" 님의 방 ("+format0.format(time.getTime())+")";
					tf.setText(autoName);}
//			---------------------
			} else {
				roomName = tf.getText();
				if (isRock == 1) {
					str_password = password.getText();
				}
				if (isRock == 1 && str_password.equals("")) {
					JOptionPane.showMessageDialog(main, "비밀번호를 입력하세요", "대화방 개설.", JOptionPane.ERROR_MESSAGE);
				} else {
					client.requestCreateRoom(roomName, roomMaxUser, isRock, str_password);
					dispose();
				}
			}
		} else {
			dispose();
		}
	}
}
