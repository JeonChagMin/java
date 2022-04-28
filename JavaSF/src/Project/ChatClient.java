package Project;

import javax.swing.*;


public class ChatClient {
	
	private static String id = "";
	
	public static String getLogonID() {
		
		String logonID="";
		
		try {
			while(logonID.equals("")) {
				logonID=JOptionPane.showInputDialog("로그온 ID를 입력하세요.");
			}
		}catch(NullPointerException e) {
			System.exit(0);
		}
		id = logonID;
		return logonID;
	}
		
	public static String getId() {
		return id;
	}	

	public static void main(String[] args) {
//		네트워크를 이용하기 위해 필요한 코드
		String id=getLogonID();
		try {
			if(args.length==0) {
//				내컴퓨터 네트워크를 사용하기위한
				ClientThread thread=new ClientThread();
				thread.start();
				thread.requestLogon(id);
			}else if(args.length==1) {
//				다른컴퓨터 접근하기 위한 방법
				ClientThread thread=new ClientThread(args[0]);
				thread.start();
				thread.requestLogon(id);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
