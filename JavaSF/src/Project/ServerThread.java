package Project;

import java.io.*;


import java.net.*;
import java.util.*;

public class ServerThread extends Thread {
	 private Socket st_sock;
	  private DataInputStream st_in;
	  private DataOutputStream st_out;
	  private StringBuffer st_buffer;
	  private WaitRoom st_waitRoom;
	  public String st_ID;
	  public int st_roomNumber;

	  private static final String SEPARATOR = "|";
	  private static final String DELIMETER = "'";
	  private static final int WAITROOM = 0;

	  private static final int REQ_LOGON = 1001;
	  private static final int REQ_CREATEROOM = 1011;
	  private static final int REQ_ENTERROOM = 1021;
	  private static final int REQ_QUITROOM = 1031;
	  private static final int REQ_LOGOUT = 1041;
	  private static final int REQ_SENDWORD = 1051;
	  private static final int REQ_SENDWORDTO = 1052;
	  private static final int REQ_COERCEOUT = 1053;
	  private static final int REQ_SENDFILE = 1061;

	  private static final int YES_LOGON = 2001;
	  private static final int NO_LOGON = 2002;
	  private static final int YES_CREATEROOM = 2011;
	  private static final int NO_CREATEROOM = 2012;
	  private static final int YES_ENTERROOM = 2021;
	  private static final int NO_ENTERROOM = 2022;
	  private static final int YES_QUITROOM = 2031;
	  private static final int YES_LOGOUT = 2041;
	  private static final int YES_SENDWORD = 2051;
	  private static final int YES_SENDWORDTO = 2052;
	  private static final int NO_SENDWORDTO = 2053;
	  private static final int YES_COERCEOUT = 2054;
	  private static final int YES_SENDFILE = 2061;
	  private static final int NO_SENDFILE = 2062;
	  private static final int MDY_WAITUSER = 2003;
	  private static final int MDY_WAITINFO = 2013;
	  private static final int MDY_ROOMUSER = 2023;

	  private static final int ERR_ALREADYUSER = 3001;
	  private static final int ERR_SERVERFULL = 3002;
	  private static final int ERR_ROOMSFULL = 3011;
	  private static final int ERR_ROOMERFULL = 3021;
	  private static final int ERR_PASSWORD = 3022;
	  private static final int ERR_REJECTION = 3031;
	  private static final int ERR_NOUSER = 3032;

	  public ServerThread(Socket sock){
//		  어느 socket에 서버를 열지 결정
	    try{
	      st_sock = sock;
	      st_in = new DataInputStream(sock.getInputStream());
	      st_out = new DataOutputStream(sock.getOutputStream());
	      st_buffer = new StringBuffer(2048);
	      st_waitRoom = new WaitRoom();
	    }catch(IOException e){
	      System.out.println(e);
	    }
	  }

	  private void sendErrCode(int message, int errCode) throws IOException{
	    st_buffer.setLength(0);
	    st_buffer.append(message);
	    st_buffer.append(SEPARATOR);
	    st_buffer.append(errCode);
	    send(st_buffer.toString());
	  }

	  private void modifyWaitRoom() throws IOException{
//		대기 room 정보 전달
	    st_buffer.setLength(0);
	    st_buffer.append(MDY_WAITINFO);
	    st_buffer.append(SEPARATOR);
	    st_buffer.append(st_waitRoom.getWaitRoomInfo());
	    broadcast(st_buffer.toString(), WAITROOM);
	  }  
	    
	  private void modifyWaitUser() throws IOException{
//		대기 user 정보 전달
	    String ids = st_waitRoom.getUsers();
	    st_buffer.setLength(0);
	    st_buffer.append(MDY_WAITUSER);
	    st_buffer.append(SEPARATOR);
	    st_buffer.append(ids);
	    broadcast(st_buffer.toString(), WAITROOM);
	  }

	  private void modifyRoomUser(int roomNumber, String id, int code) throws IOException{
//		생성된 room의 정보 전달
	    String ids = st_waitRoom.getRoomInfo(roomNumber);
	    st_buffer.setLength(0);
	    st_buffer.append(MDY_ROOMUSER);
	    st_buffer.append(SEPARATOR);
	    st_buffer.append(id);
	    st_buffer.append(SEPARATOR);
	    st_buffer.append(code);
	    st_buffer.append(SEPARATOR);
	    st_buffer.append(ids);
	    broadcast(st_buffer.toString(), roomNumber);
	  }

	  private void send(String sendData) throws IOException{
	    synchronized(st_out){
//	   대기실에서의 채팅 내용 작성
	      System.out.println(sendData);

	      st_out.writeUTF(sendData);
	      st_out.flush();
	    }
	  }

	  private synchronized void broadcast(String sendData, int roomNumber) throws IOException{
//	    방에 있는 모든 사람에게 전부 보여주기 위한 메소드
		  
	    ServerThread client;
	    Hashtable clients = st_waitRoom.getClients(roomNumber);
//	    Map을 상속받지만 HashMap과 달리 동기화와 null값을 사용 할 수 있는 배열
	    Enumeration enu = clients.keys();
//	    keys는 참여자의 이름
//	    스레드 전용 iterator
//	    hashtable에 있는 키를 전부 iterator인 enu에 넣고
	    while(enu.hasMoreElements()){	
//	    enu에 들어간 요소들이 있으면
//	    hashtable은 key(이름들)를 통해서 값을 가져오니까 iterator안에 있는 키를 통해서 serverThread타입의 값을 가져오는 변수
//	    가져온 사람들을 서버인 client에 메세지를 전달
	      client = (ServerThread) clients.get(enu.nextElement());
	      client.send(sendData);
	    }
	  }
	    
	  public void run(){
	    try{
	      while(true){
	        String recvData = st_in.readUTF();

	        System.out.println(recvData);

	        StringTokenizer st = new StringTokenizer(recvData, SEPARATOR);
	        int command = Integer.parseInt(st.nextToken());
	        switch(command){
	          case REQ_LOGON : {
	            st_roomNumber = WAITROOM;
	            int result;
	            st_ID = st.nextToken();
	            result = st_waitRoom.addUser(st_ID, this);
	            st_buffer.setLength(0);
	            if(result == 0){
	              st_buffer.append(YES_LOGON);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(st_waitRoom.getRooms());
	              send(st_buffer.toString());
	              modifyWaitUser();
	              System.out.println(st_ID + "의 연결요청 승인");
	            } else {
	              sendErrCode(NO_LOGON, result);
	            }
	            break;
	          }
	          case REQ_CREATEROOM : {
//	        	방만드는 요청
	            String id, roomName, password;
	            int roomMaxUser, result;
	            boolean isRock;
//				토큰 나눠지는 순서가 정해져있다는 가정하에 token하나씩 받아와서 저장 
	            id = st.nextToken();
	            String roomInfo = st.nextToken();
	            StringTokenizer room = new StringTokenizer(roomInfo, DELIMETER);
	            roomName = room.nextToken();
	            roomMaxUser = Integer.parseInt(room.nextToken());
	            isRock = (Integer.parseInt(room.nextToken()) == 0) ? false : true;
	            password = room.nextToken();

	            ChatRoom chatRoom = new ChatRoom(roomName, roomMaxUser,
	                                             isRock, password, id);
	            result = st_waitRoom.addRoom(chatRoom);
//	            아무 이상 없이 방이 생성이 되었으면 return = 0
	            if (result == 0) {
	              st_roomNumber = ChatRoom.getRoomNumber();
	              boolean temp = chatRoom.addUser(st_ID, this);
	              st_waitRoom.delUser(st_ID);

	              st_buffer.setLength(0);
	              st_buffer.append(YES_CREATEROOM);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(st_roomNumber);
	              send(st_buffer.toString());
	              modifyWaitRoom();
	              modifyRoomUser(st_roomNumber, id, 1);
	            } else {
	              sendErrCode(NO_CREATEROOM, result);
	            }
	            break;
	          }
	          case REQ_ENTERROOM : {
	            String id, password;
	            int roomNumber, result;
	            id = st.nextToken();
	            roomNumber = Integer.parseInt(st.nextToken());
	            try{
	              password = st.nextToken();
	            }catch(NoSuchElementException e){
	              password = "0";
	            }
	            result = st_waitRoom.joinRoom(id, this, roomNumber, password);

	            if (result == 0){
	              st_buffer.setLength(0);
	              st_buffer.append(YES_ENTERROOM);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(roomNumber);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(id);
	              st_roomNumber = roomNumber;
	              send(st_buffer.toString());
	              modifyRoomUser(roomNumber, id, 1);
	              modifyWaitRoom();
	            } else {
	              sendErrCode(NO_ENTERROOM, result);
	            }
	            break;
	          }
	          case REQ_QUITROOM : {
	            String id;
	            int roomNumber;
	            boolean updateWaitInfo;
	            id = st.nextToken();
	            roomNumber = Integer.parseInt(st.nextToken());

	            updateWaitInfo = st_waitRoom.quitRoom(id, roomNumber, this);

	            st_buffer.setLength(0);
	            st_buffer.append(YES_QUITROOM);
	            st_buffer.append(SEPARATOR);
	            st_buffer.append(id);
	            send(st_buffer.toString());
	            st_roomNumber = WAITROOM;

	            if (updateWaitInfo) {
	              modifyWaitRoom();
	            } else {
	              modifyWaitRoom();
	              modifyRoomUser(roomNumber, id, 0);
	            }
	            break;
	          }
	          case REQ_LOGOUT : {
	            String id = st.nextToken();
	            st_waitRoom.delUser(id);

	            st_buffer.setLength(0);
	            st_buffer.append(YES_LOGOUT);
	            send(st_buffer.toString());
	            modifyWaitUser();
	            release();
	            break;
	          }
	          case REQ_SENDWORD : {
	            String id = st.nextToken();
	            int roomNumber = Integer.parseInt(st.nextToken());

	            st_buffer.setLength(0);
	            st_buffer.append(YES_SENDWORD);
	            st_buffer.append(SEPARATOR);
	            st_buffer.append(id);
	            st_buffer.append(SEPARATOR);
	            st_buffer.append(st_roomNumber);
	            st_buffer.append(SEPARATOR);
	            try{
	              String data = st.nextToken();
	              st_buffer.append(data);
	            }catch(NoSuchElementException e){}

	            broadcast(st_buffer.toString(), roomNumber);
	            break;
	          }
	          case REQ_SENDWORDTO : {
	            String id = st.nextToken();
	            int roomNumber = Integer.parseInt(st.nextToken());
	            String idTo = st.nextToken(); 
	            
	            Hashtable room = st_waitRoom.getClients(roomNumber);
	            ServerThread client = null;
	            if ((client = (ServerThread) room.get(idTo)) != null){            
	              st_buffer.setLength(0);
	              st_buffer.append(YES_SENDWORDTO);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(id);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(idTo);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(st_roomNumber);
	              st_buffer.append(SEPARATOR);
	              try{
	                String data = st.nextToken();
	                st_buffer.append(data);
	              }catch(NoSuchElementException e){}
	              client.send(st_buffer.toString());
	              send(st_buffer.toString());
	              break;
	            } else {
	              st_buffer.setLength(0);
	              st_buffer.append(NO_SENDWORDTO);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(idTo);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(st_roomNumber);
	              send(st_buffer.toString());
	              break;
	            }
	          }
	          case REQ_SENDFILE : {
	            String id = st.nextToken();
	            int roomNumber = Integer.parseInt(st.nextToken());
	            String idTo = st.nextToken(); 
	            
	            Hashtable room = st_waitRoom.getClients(roomNumber);
	            ServerThread client = null;
	            if ((client = (ServerThread) room.get(idTo)) != null){
	              st_buffer.setLength(0);
	              st_buffer.append(REQ_SENDFILE);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(id);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(st_roomNumber);
	              client.send(st_buffer.toString());
	              break;
	            } else {
	              st_buffer.setLength(0);
	              st_buffer.append(NO_SENDFILE);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(ERR_NOUSER);
	              st_buffer.append(SEPARATOR);
	              st_buffer.append(idTo);
	              send(st_buffer.toString());
	              break;
	            }
	          }
	          case NO_SENDFILE : {
	            String id = st.nextToken();
	            int roomNumber = Integer.parseInt(st.nextToken());
	            String idTo = st.nextToken();

	            Hashtable room = st_waitRoom.getClients(roomNumber);
	            ServerThread client = null;
	            client = (ServerThread) room.get(idTo);

	            st_buffer.setLength(0);
	            st_buffer.append(NO_SENDFILE);
	            st_buffer.append(SEPARATOR);
	            st_buffer.append(ERR_REJECTION);
	            st_buffer.append(SEPARATOR);
	            st_buffer.append(id);

	            client.send(st_buffer.toString());
	            break;
	          }
	          case YES_SENDFILE : {
	            String id = st.nextToken();
	            int roomNumber = Integer.parseInt(st.nextToken());
	            String idTo = st.nextToken();
	            String hostaddr = st.nextToken();

	            Hashtable room = st_waitRoom.getClients(roomNumber);
	            ServerThread client = null;
	            client = (ServerThread) room.get(idTo);

	            st_buffer.setLength(0);
	            st_buffer.append(YES_SENDFILE);
	            st_buffer.append(SEPARATOR);
	            st_buffer.append(id);
	            st_buffer.append(SEPARATOR);
	            st_buffer.append(hostaddr);

	            client.send(st_buffer.toString());
	            break;
	          }
	          case REQ_COERCEOUT : {
	            int roomNumber = Integer.parseInt(st.nextToken());
	            String idTo = st.nextToken();
	            boolean updateWaitInfo;
	            Hashtable room = st_waitRoom.getClients(roomNumber);
	            ServerThread client = null;
	            client = (ServerThread) room.get(idTo);
	            updateWaitInfo = st_waitRoom.quitRoom(idTo, roomNumber, client);

	            st_buffer.setLength(0);
	            st_buffer.append(YES_COERCEOUT);
	            client.send(st_buffer.toString());
	            client.st_roomNumber = 0;

	            if (updateWaitInfo) {
	              modifyWaitRoom();
	            } else {
	              modifyWaitRoom();
	              modifyRoomUser(roomNumber, idTo, 2);
	            }
	            break;
	          }
	        }
	        Thread.sleep(100);
	      }
	    }catch(NullPointerException e){
	    }catch(InterruptedException e){
	      System.out.println(e);

	      if(st_roomNumber == 0){
	        st_waitRoom.delUser(st_ID);
	      } else {
	        boolean temp = st_waitRoom.quitRoom(st_ID, st_roomNumber, this);
	        st_waitRoom.delUser(st_ID);
	      } 
	      release();
	    }catch(IOException e){
	      System.out.println(e);

	      if(st_roomNumber == 0){
	        st_waitRoom.delUser(st_ID);
	      } else {
	        boolean temp = st_waitRoom.quitRoom(st_ID, st_roomNumber, this);
	        st_waitRoom.delUser(st_ID);
	      } 
	      release();
	    }
	  }

	  public void release(){
	    try{
	      if(st_in != null) st_in.close();
	    }catch(IOException e1){
	    }finally{
	      st_in = null;
	    }
	    try{
	      if(st_out != null) st_out.close();
	    }catch(IOException e1){
	    }finally{
	      st_out = null;
	    }
	    try{
	      if(st_sock != null) st_sock.close();
	    }catch(IOException e1){
	    }finally{
	      st_sock = null;
	    }

	    if(st_ID != null){
	      System.out.println(st_ID + "와 연결을 종료합니다.");
	      st_ID = null;
	    }
	  }
	}