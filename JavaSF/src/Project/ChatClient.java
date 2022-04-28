package Project;

import javax.swing.*;


public class ChatClient {
	
	private static String id = "";
	
	public static String getLogonID() {
		
		String logonID="";
		
		try {
			while(logonID.equals("")) {
				logonID=JOptionPane.showInputDialog("�α׿� ID�� �Է��ϼ���.");
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
//		��Ʈ��ũ�� �̿��ϱ� ���� �ʿ��� �ڵ�
		String id=getLogonID();
		try {
			if(args.length==0) {
//				����ǻ�� ��Ʈ��ũ�� ����ϱ�����
				ClientThread thread=new ClientThread();
				thread.start();
				thread.requestLogon(id);
			}else if(args.length==1) {
//				�ٸ���ǻ�� �����ϱ� ���� ���
				ClientThread thread=new ClientThread(args[0]);
				thread.start();
				thread.requestLogon(id);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
