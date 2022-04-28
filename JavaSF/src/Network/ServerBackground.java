package Network;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerBackground {
	ServerSocket serverSocket;
	Socket socket;
	ChatServer gui;
	String msg;
	Map<String, DataOutputStream> clientsMap = new HashMap<>();

	final void setGui(ChatServer gui) {
		this.gui = gui;
	}

	void setting() throws IOException {
		Collections.synchronizedMap(clientsMap);
		while (true) {
			System.out.println("서버대기중...");
			socket = serverSocket.accept();
			System.out.println(socket.getInetAddress() + "에서 접속했습니다");
			Receiver receiver = new Receiver(socket);
			receiver.start();
		}
	}

	void addClient(String nick, DataOutputStream out) throws IOException {
		sendMessage(nick + "님이 접속하셨습니다");
		clientsMap.put(nick, out);
	}

	void removeClient(String nick) {
		sendMessage(nick + "님이 나가셨습니다");
		clientsMap.remove(nick);
	}

	void sendMessage(String msg) {
		Iterator<String> it = clientsMap.keySet().iterator();
		String key = "";
		while (it.hasNext()) {
			key = it.next();
			try {
				clientsMap.get(key).writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	class Receiver extends Thread {
		DataInputStream in;
		DataOutputStream out;
		String nick;

		Receiver(Socket socket) throws IOException {
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			nick = in.readLine();
			addClient(nick, out);
		}

		public void run() {
			try {
				while (in != null) {
					msg = in.readUTF();
					sendMessage(msg);
					gui.appendMsg(msg);
				}
			} catch (IOException e) {
				removeClient(nick);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		ServerBackground serverBackground = new ServerBackground();
		serverBackground.setting();

	}
}
