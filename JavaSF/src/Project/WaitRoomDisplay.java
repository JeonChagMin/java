package Project;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class WaitRoomDisplay extends JFrame implements ActionListener, KeyListener, MouseListener, ChangeListener {

	private ClientThread cc_thread;
	private int roomNumber;
	private String password, select;
	private boolean isRock, isSelected;

	private JLabel rooms, waiter, label;
	public JList roomInfo, waiterInfo;
	private JButton create, join, sendword, logout;
	private Font font;
	private JViewport view;
	private JScrollPane jsp3;
	public JTextArea messages;
	public JTextField message;

	public WaitRoomDisplay(ClientThread thread) {
		super("Chat-Application-대기실");

		cc_thread = thread;
		roomNumber = 0;
		password = "0";
		isRock = false;
		isSelected = false;
		font = new Font("SanSerif", Font.PLAIN, 12);

		Container c = getContentPane();
		c.setLayout(null);

		rooms = new JLabel("대화방");

		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBounds(5, 10, 460, 215);
		p.setFont(font);
		p.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "대화방 목록"));

		label = new JLabel("번 호");
		label.setBounds(15, 25, 40, 20);
		label.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		label.setFont(font);
		p.add(label);

		label = new JLabel("제 목");
		label.setBounds(55, 25, 210, 20);
		label.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		label.setFont(font);
		p.add(label);

		label = new JLabel("현재/최대");
		label.setBounds(265, 25, 60, 20);
		label.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		label.setFont(font);
		p.add(label);

		label = new JLabel("공개여부");
		label.setBounds(325, 25, 60, 20);
		label.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		label.setFont(font);
		p.add(label);

		label = new JLabel("개 설 자");
		label.setBounds(385, 25, 58, 20);
		label.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		label.setFont(font);
		p.add(label);

		roomInfo = new JList();
		roomInfo.setFont(font);
		WaitListCellRenderer renderer = new WaitListCellRenderer();
		JScrollPane jsp1 = new JScrollPane(roomInfo);
		roomInfo.addMouseListener(this);
		renderer.setDefaultTab(20);
		renderer.setTabs(new int[] { 40, 265, 285, 315, 375, 430 });
		roomInfo.setCellRenderer(renderer);
		jsp1.setBounds(15, 45, 430, 155);
		p.add(jsp1);
		roomInfo.addMouseListener(new MouseAdapter() {
//	    	-------------------------------------------
//	    	마우스 더블클릭으로 대기방에 들어갈 수 있게 설정
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
//	  		-------------------------------------------
					if (isRock && password.equals("0")) {
						if ((password = JOptionPane.showInputDialog("비밀번호를 입력하세요.")) != null) {
							if (!password.equals("")) {
								cc_thread.requestEnterRoom(roomNumber, password);
								password = "0";
							} else {
								password = "0";
								cc_thread.requestEnterRoom(roomNumber, password);
							}
						} else {
							password = "0";
						}
					} else {
						cc_thread.requestEnterRoom(roomNumber, password);
					}
				}
			}
		});

		c.add(p);

		p = new JPanel();
		p.setLayout(null);
		p.setBounds(470, 10, 150, 215);
		p.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "대기자"));

		waiterInfo = new JList();
		waiterInfo.setFont(font);
		JScrollPane jsp2 = new JScrollPane(waiterInfo);
		jsp2.setBounds(15, 25, 115, 175);
		p.add(jsp2);

		c.add(p);

		p = new JPanel();
		p.setLayout(null);
		p.setBounds(5, 230, 460, 200);
		p.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "채팅창"));

		view = new JViewport();
		messages = new JTextArea();
		messages.setEditable(false);
		messages.setFont(font);
		view.add(messages);
		view.addChangeListener(this);
		jsp3 = new JScrollPane(view);
		jsp3.setBounds(15, 25, 430, 135);
		view.addChangeListener(this);
		p.add(jsp3);

		view = (JViewport) jsp3.getViewport().getView();
		view.addChangeListener(this);

		message = new JTextField();
		message.setFont(font);
		message.setBounds(15, 170, 430, 20);
		message.addKeyListener(this);
		message.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
		p.add(message);

		c.add(p);

		create = new JButton("대화방개설");
		create.setFont(font);
		create.setBounds(500, 250, 100, 30);
		create.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		create.addActionListener(this);
		c.add(create);

		join = new JButton("대화방참여");
		join.setFont(font);
		join.setBounds(500, 290, 100, 30);
		join.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		join.addActionListener(this);
		c.add(join);

		sendword = new JButton("귓말보내기");
		sendword.setFont(font);
		sendword.setBounds(500, 330, 100, 30);
		sendword.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		sendword.addActionListener(this);
		c.add(sendword);

		logout = new JButton("로 그 아 웃");
		logout.setFont(font);
		logout.setBounds(500, 370, 100, 30);
		logout.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		logout.addActionListener(this);
		c.add(logout);

		Dimension dim = getToolkit().getScreenSize();
//	    스크린 사이즈에 따라 정중앙에 오도록 설정
		setSize(640, 460);
		setLocation(dim.width / 2 - getWidth() / 2, dim.height / 2 - getHeight() / 2);
		show();

		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
				message.requestFocusInWindow();
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cc_thread.requestLogout();
			}
		});
	}

	public void resetComponents() {
//		입력하였던 Compoenet 초기화  
		messages.setText("");
		message.setText("");
		roomNumber = 0;
		password = "0";
		isRock = false;
		isSelected = false;
		message.requestFocusInWindow();
	}

	public void keyPressed(KeyEvent ke) {
		if (ke.getKeyChar() == KeyEvent.VK_ENTER) {
			String words = message.getText();
			String data;
			String idTo;
//	      입력시 /w의 유무에 따라 귓속말 기능 추가
			if (words.startsWith("/w")) {
				StringTokenizer st = new StringTokenizer(words, " ");
				String command = st.nextToken();
				idTo = st.nextToken();
				data = st.nextToken();
				cc_thread.requestSendWordTo(data, idTo);
				message.setText("");
//				----------------------------------------------
//				추가
//				help를 통해서 다른 명령어에 대한 정보 호출
			} else if (words.startsWith("/help")) {
				messages.append("/w : 귓속말 기능\n/r : 랜덤 기능(1~100 숫자를 랜덤으로 출력)\n"
						+ "/c : 채팅방 청소\n/t : 현재 날짜 시간 구하는 기능\n");
				message.setText("");
			} else if (words.startsWith("/r")) {
				int ran = (int) (Math.random() * 100) + 1;
				messages.append(ran + "\n");
				message.setText("");
			} else if (words.startsWith("/c")) {
				messages.setText("");
				message.setText("");
			} else if (words.startsWith("/t")) {
				SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월dd일 HH시 mm분 ss초");
				Date time = new Date();
				String time1 = format1.format(time);
				messages.append(time1 + "\n");
				message.setText("");
//				----------------------------------------------
			} else {
				cc_thread.requestSendWord(words);
				message.requestFocusInWindow();
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		try {
			isSelected = true;
			String select = String.valueOf(((JList) e.getSource()).getSelectedValue());
			setSelectedRoomInfo(select);
		} catch (Exception err) {
		}
	}

	public void actionPerformed(ActionEvent ae) {
//		새로운 방 생성을 누를시 나오는 창
		if (ae.getSource() == create) {
			CreateRoomDisplay createRoom = new CreateRoomDisplay(this, cc_thread);
		} else if (ae.getSource() == join) {
			if (!isSelected) {
				JOptionPane.showMessageDialog(this, "방제목을 입력하세요.", "대화방 입장.", JOptionPane.ERROR_MESSAGE);
			} else if (isRock && password.equals("0")) {
				if ((password = JOptionPane.showInputDialog("비밀번호를 입력하세요.")) != null) {
					if (!password.equals("")) {
						cc_thread.requestEnterRoom(roomNumber, password);
						password = "0";
					} else {
						password = "0";
						cc_thread.requestEnterRoom(roomNumber, password);
					}
				} else {
					password = "0";
				}
			} else {
				cc_thread.requestEnterRoom(roomNumber, password);
			}
		} else if (ae.getSource() == logout) {
			cc_thread.requestLogout();
		} else if (ae.getSource() == sendword) {
			String idTo, data;
			if ((idTo = JOptionPane.showInputDialog("닉네임을 입력하세요.")) != null) {
				if ((data = JOptionPane.showInputDialog("메세지를 입력하세요.")) != null) {
					cc_thread.requestSendWordTo(data, idTo);
				}
			}
		}

	}

	private void setSelectedRoomInfo(String select) {
//		선택한 room의 정보 저장		  
		StringTokenizer st = new StringTokenizer(select, "=");
		roomNumber = Integer.parseInt(st.nextToken());
		String roomName = st.nextToken();
		int maxUser = Integer.parseInt(st.nextToken());
		int user = Integer.parseInt(st.nextToken());
		isRock = st.nextToken().equals("비공개") ? true : false;
	}

	public void stateChanged(ChangeEvent e) {
		jsp3.getVerticalScrollBar().setValue((jsp3.getVerticalScrollBar().getValue() + 20));
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
}