package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientBackground {
	Socket socket;
	DataInputStream in;
	DataOutputStream out;
	ClientGui gui;
	String msg;
	String nickName;
	
	final void setGui(ClientGui gui) {
		this.gui=gui;
	}
	
	void connet() {
		try {
			socket= new Socket("192.168.0.95",7777);
			System.out.println("서버 연결됨");
			
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			
			out.writeUTF(nickName);
			System.out.println("클라이언트 : 메세지 전송완료");
			while (in!=null) {
				msg=in.readUTF();
				gui.appendMsg(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void sendMessage(String msg2){
		try {
			out.writeUTF(msg2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void setNickname(String nickName) {
		this.nickName = nickName;
	}
	
	public static void main(String[] args) {
		ClientBackground clientBackground = new ClientBackground();
		clientBackground.connet();
	}

}
