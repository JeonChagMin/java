package Chapter08;

import java.util.Scanner;

public class D1005_Ŭ��������10 {

	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
		game.run();
	}
}

class WordGameApp {
	Scanner scanner = new Scanner(System.in);
	String startWord = "�ƹ���";
	void run() {
		System.out.println("�����ձ� ������ �����մϴ�...");
//		createPlayers(); // �����ڸ� ���� Player []�� �����Ѵ�. 
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ� >> ");
		int num=scanner.nextInt();
		Player[] players=new Player[num];

		
		for (int i = 0; i < players.length; i++) {
			System.out.print("�������� �̸��� �Է��ϼ��� >> ");
			String name= scanner.next();
			players[i]=new Player(name);
		}
		String lastWord = startWord; // startWord���� ���� �����Ѵ�.
		System.out.println("�����ϴ� �ܾ�� "+lastWord+ "�Դϴ�");
		
		
		int next = 0; // �����ڵ��� ������� ����
		// ������ ���� ������ ����
		while (true) {
			String newWord = players[next].getWordFromUser(); // next �����ڰ� �ܾ ���ϵ��� �Ѵ�.
			if (!players[next].checkSuccess(lastWord)) { // next �����ڰ� �����Ͽ����� �˻�. 
				System.out.print(players[next].getName() + "�� �����ϴ�.");
				break; // ������ �����Ѵ�.
			}
			next++; // ���� ������
			next %= players.length; // next�� �������� �������� ���� �����ϴ� ���� ���´�.
			lastWord = newWord;
		}
	}
}
	
class Player {
	private Scanner scanner; // Ű���� �Է�
	private String name; // ���� �������� �̸�
	private String word; // �����ڰ� ���� �ܾ�

	public Player(String name) {
		this.name = name;
		scanner = new Scanner(System.in);
	}
	
	String getName() {
		return this.name;
	}
	
	
	String getWordFromUser() {
		System.out.print(this.name+" >> ");
		this.word=scanner.next();
		return word;
	}
	
	boolean checkSuccess(String lastWord) {
		if (lastWord.charAt(lastWord.length()-1)==this.word.charAt(0)) {
			return true;
		}
		return false;
		
	}
}
