package Network;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class ChatServer extends JFrame implements ActionListener {

	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;
	Scanner scanner = new Scanner(System.in);
	JTextArea jt = new JTextArea(40,25);
	JTextField jf = new JTextField(25);
	ServerBackground server = new ServerBackground();
	
	public ChatServer() throws IOException {
		setTitle("Server");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(jt,BorderLayout.CENTER);
		add(jf,BorderLayout.SOUTH);
		jf.addActionListener(this);
		setBounds(200,100,400,600);
		setVisible(true);
		
		server.setGui(this);
		server.setting();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = "¼­¹ö : " + jf.getText()+"\n";
		System.out.print(msg);
		jf.setText("");
		
		
	}
	
	void appendMsg(String msg) {
		jt.append(msg);
	}
	
	public static void main(String[] args) throws IOException{
		new ChatServer();
	}

}
