package Project;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ChatRoomDisplay extends JFrame
		implements ActionListener, KeyListener, ListSelectionListener, ChangeListener {
	private ClientThread cr_thread;
	private String idTo;
	private boolean isSelected;
	public boolean isAdmin;

	private JLabel roomer;
	public JList roomerInfo;
	public JButton coerceOut;
//	��ư�� �ܺο��� �����ϱ� ���� private�� public���� ��ü
	private JButton sendWord, sendFile, quitRoom;
	private Font font;
	private JViewport view;
	private JScrollPane jsp3;
	public JTextArea messages;
	public JTextField message;

	public ChatRoomDisplay(ClientThread thread) {
		super("Chat-Application-��ȭ��");

		cr_thread = thread;
		isSelected = false;
		isAdmin = false;
		font = new Font("SanSerif", Font.PLAIN, 12);

		Container c = getContentPane();
		c.setLayout(null);

		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBounds(425, 10, 140, 175);
		p.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "������"));

		roomerInfo = new JList();
		roomerInfo.setFont(font);
		JScrollPane jsp2 = new JScrollPane(roomerInfo);
		roomerInfo.addListSelectionListener(this);
		
		jsp2.setBounds(15, 25, 110, 135);
		p.add(jsp2);

		c.add(p);

		p = new JPanel();
		p.setLayout(null);
		p.setBounds(10, 10, 410, 340);
		p.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "ä��â"));

		view = new JViewport();
		messages = new JTextArea();
		messages.setFont(font);
		messages.setEditable(false);
		view.add(messages);
		view.addChangeListener(this);
		jsp3 = new JScrollPane(view);
		jsp3.setBounds(15, 25, 380, 270);
		p.add(jsp3);

		message = new JTextField();
		message.setFont(font);
		message.addKeyListener(this);
		message.setBounds(15, 305, 380, 20);
		message.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
		p.add(message);

		c.add(p);

		coerceOut = new JButton("�� �� �� ��");
		coerceOut.setFont(font);
		coerceOut.addActionListener(this);
		coerceOut.setBounds(445, 195, 100, 30);
		coerceOut.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
//		---------------------------------------------------------
//		admin���� �ƴ����� ���� ��ư Ȱ��ȭ or ��Ȱ��ȭ
		if (isAdmin==true) {
			coerceOut.setEnabled(true);
		} else {
			coerceOut.setEnabled(false);
		}
//		---------------------------------------------------------
		c.add(coerceOut);

		sendWord = new JButton("�Ӹ�������");
		sendWord.setFont(font);
		sendWord.addActionListener(this);
		sendWord.setBounds(445, 235, 100, 30);
		sendWord.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		c.add(sendWord);

		sendFile = new JButton("�� �� �� ��");
		sendFile.setFont(font);
		sendFile.addActionListener(this);
		sendFile.setBounds(445, 275, 100, 30);
		sendFile.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		c.add(sendFile);

		quitRoom = new JButton("�� �� �� ��");
		quitRoom.setFont(font);
		quitRoom.addActionListener(this);
		quitRoom.setBounds(445, 315, 100, 30);
		quitRoom.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		c.add(quitRoom);

		Dimension dim = getToolkit().getScreenSize();
		setSize(580, 400);
		setLocation(dim.width / 2 - getWidth() / 2, dim.height / 2 - getHeight() / 2);
		show();

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				message.requestFocusInWindow();
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cr_thread.requestQuitRoom();
			}
		});
	}

	public void resetComponents() {
//		�� �� ä�� ���� ����
		messages.setText("");
		message.setText("");
		message.requestFocusInWindow();
	}

	public void keyPressed(KeyEvent ke) {
		if (ke.getKeyChar() == KeyEvent.VK_ENTER) {
			String words = message.getText();
			String data;
			String idTo;
			if (words.startsWith("/w")) {
				StringTokenizer st = new StringTokenizer(words, " ");
				String command = st.nextToken();
				idTo = st.nextToken();
				data = st.nextToken();
				cr_thread.requestSendWordTo(data, idTo);
				message.setText("");
//				----------------------------------------------
//				�߰�
//				help�� ���ؼ� �ٸ� ��ɾ ���� ���� ȣ��
			} else if (words.startsWith("/help")) {
				messages.append("/w : �ӼӸ� ���\n/r : ���� ���(1~100 ���ڸ� �������� ���)\n"
						+ "/c : ä�ù� û��\n/t : ���� ��¥ �ð� ���ϴ� ���\n");
				message.setText("");
			} else if (words.startsWith("/r")) {
				int ran = (int) (Math.random() * 100) + 1;
				messages.append(ran + "\n");
				message.setText("");
			} else if (words.startsWith("/c")) {
				messages.setText("");
				message.setText("");
			} else if (words.startsWith("/t")) {
				SimpleDateFormat format1 = new SimpleDateFormat("yyyy�� MM��dd�� HH�� mm�� ss��");
				Date time = new Date();
				String time1 = format1.format(time);
				messages.append(time1 + "\n");
				message.setText("");
//				----------------------------------------------
			} else {
				cr_thread.requestSendWord(words);
				message.requestFocusInWindow();
			}
		}
	}

	public void valueChanged(ListSelectionEvent e) {
		isSelected = true;
		idTo = String.valueOf(((JList) e.getSource()).getSelectedValue());
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == coerceOut) {
			if (!isAdmin) {
				JOptionPane.showMessageDialog(this, "����� ������ �ƴմϴ�.", "��������", JOptionPane.ERROR_MESSAGE);
			} else if (!isSelected) {
				JOptionPane.showMessageDialog(this, "�������� ID�� �����ϼ���.", "��������", JOptionPane.ERROR_MESSAGE);
			} else {
				cr_thread.requestCoerceOut(idTo);
				isSelected = false;
			}
		} else if (ae.getSource() == quitRoom) {
			cr_thread.requestQuitRoom();
		} else if (ae.getSource() == sendWord) {
			String idTo, data;
			if ((idTo = JOptionPane.showInputDialog("���̵� �Է��ϼ���.")) != null) {
				if ((data = JOptionPane.showInputDialog("�޼����� �Է��ϼ���.")) != null) {
					cr_thread.requestSendWordTo(data, idTo);
				}
			}
		} else if (ae.getSource() == sendFile) {
			String idTo;
			if ((idTo = JOptionPane.showInputDialog("���� ���̵� �Է��ϼ���.")) != null) {
				cr_thread.requestSendFile(idTo);
			}
		}
	}

	public void stateChanged(ChangeEvent e) {
		jsp3.getVerticalScrollBar().setValue((jsp3.getVerticalScrollBar().getValue() + 20));
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

}
