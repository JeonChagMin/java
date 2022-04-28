package Network;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGui extends JFrame implements ActionListener {
	JTextArea jta = new JTextArea(40, 25);
	JTextField jtf = new JTextField(25);
	ClientBackground client = new ClientBackground();
	static String nickName;

	ClientGui() {
		setTitle("Ŭ���̾�Ʈ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);
		setVisible(true);
		setBounds(200, 100, 400, 600);
		client.setGui(this);
		client.setNickname(nickName);
		client.connet();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = nickName + " : " + jtf.getText() + "\n";
		client.sendMessage(msg);
		jtf.setText("");

	}

	void appendMsg(String msg) {
		jta.append(msg);
		;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� �г��Ӻ��� �����ϼ���");
		nickName = scanner.nextLine();
		scanner.close();

		new ClientGui();

	}

}
