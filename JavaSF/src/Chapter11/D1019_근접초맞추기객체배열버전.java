package Chapter11;

import java.util.Calendar;
import java.util.Scanner;

public class D1019_근접초맞추기객체배열버전 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("참가자 수 : ");
		int num = s.nextInt();
		Player p[] = new Player[num];
		System.out.println("몇 초에 근접할 것인가");
		int o = s.nextInt();
		int second = 0;
		int second1 = 0;
		int index = 0;
		for (int i = 0; i < p.length; i++) {
			System.out.print("참가자 이름 : ");
			String name = s.next();
			s.nextLine();
			System.out.println(name+"의 차례");
			System.out.println("시작");
			System.out.print("엔터를 입력해주세요");
			String a = s.nextLine();
			if (a.equals("")) {
				Calendar now = Calendar.getInstance();
				second = now.get(Calendar.SECOND);
				System.out.print("초는 : " + second);
			} else {
				System.out.println("잘못된 값을 입력하셨습니다. 처음부터 다시진행해주세요.");
				break;
			}
			String b = s.nextLine();
			if (b.equals("")) {
				Calendar now1 = Calendar.getInstance();
				second1 = now1.get(Calendar.SECOND);
				System.out.println("초는 : " + second1);
			} else {
				System.out.println("잘못된 값을 입력하셨습니다. 처음부터 다시진행해주세요.");
				break;
			}
			if (second1 > second) {
				p[i]=new Player(name,second1-second);
			} else {
				p[i]=new Player(name,second1 + 60 - second);
			}
			
		}
		if (p[0]!=null) {
			
		for (int i = 0; i < p.length; i++) {
			p[i].cal(o);
		}
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num; j++) {
				if (p[i].result>p[j].result) {
					index = i;
				} else {
					index = j;
				}
			}
		}
		System.out.println("참가자 "+p[index].name+"이 목표 초인 "+o+"와 "+p[index].result+"차이로 가장 근접하여 우승했습니다.");
		}

		
	}

}

class Player {
	String name;
	int second;
	int result;
	
	Player(String name, int se) {
		this.name = name;
		second=se;
	}
	
	void cal(int o) {
		this.result = Math.abs(o-second);
	}
}
