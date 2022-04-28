package Chapter08;

import java.util.Scanner;

public class D1005_클래스문제10 {

	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
		game.run();
	}
}

class WordGameApp {
	Scanner scanner = new Scanner(System.in);
	String startWord = "아버지";
	void run() {
		System.out.println("끝말잇기 게임을 시작합니다...");
//		createPlayers(); // 참가자를 위한 Player []을 생성한다. 
		System.out.print("게임에 참가하는 인원은 몇명입니까 >> ");
		int num=scanner.nextInt();
		Player[] players=new Player[num];

		
		for (int i = 0; i < players.length; i++) {
			System.out.print("참가자의 이름을 입력하세요 >> ");
			String name= scanner.next();
			players[i]=new Player(name);
		}
		String lastWord = startWord; // startWord에서 부터 시작한다.
		System.out.println("시작하는 단어는 "+lastWord+ "입니다");
		
		
		int next = 0; // 참가자들의 순서대로 증가
		// 게임이 끝날 때까지 루프
		while (true) {
			String newWord = players[next].getWordFromUser(); // next 참가자가 단어를 말하도록 한다.
			if (!players[next].checkSuccess(lastWord)) { // next 참가자가 성공하였는지 검사. 
				System.out.print(players[next].getName() + "이 졌습니다.");
				break; // 게임을 종료한다.
			}
			next++; // 다음 참가자
			next %= players.length; // next가 참가자의 개수보다 많게 증가하는 것을 막는다.
			lastWord = newWord;
		}
	}
}
	
class Player {
	private Scanner scanner; // 키보드 입력
	private String name; // 게임 참가자의 이름
	private String word; // 참가자가 말한 단어

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
