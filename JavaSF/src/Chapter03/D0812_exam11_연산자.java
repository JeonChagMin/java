package Chapter03;
import java.util.Scanner;

public class D0812_exam11_연산자 {

	public static void main(String[] args) {

//		int score = 85;
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
//		System.out.println(score + "점은 " + grade + "등급입니다");

		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num=s.nextInt();
		String str = num>0 ? "양수" : num==0 ? "영" : "음수";
		System.out.println("입력한 값은 "+str+"입니다");
		
		
	}

}
