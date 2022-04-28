package Chapter04;
import java.util.Scanner;

public class D0817_문제 {

	public static void main(String[] args) {

//		<< 입력 형식 >>
//		필기점수 : 000
//		실기점수 : 000
//		
//		<< 출력 형식 >>
//		총점 : 000
//		평균 : 000
//		결과 : 합격 or 불합격
//		필기점수 40점 이상이고 실기도 40 이상이고 평균이 60점이상이면 "합격" 그렇지 않으면 "불합격"이라고 출력
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("필기 점수를 입력하세요 : ");
		int x = s.nextInt();
		System.out.print("실기 점수를 입력하세요 : ");
		int y=s.nextInt();
		int z=(x+y)/2;
		System.out.println("총점 : "+(x+y));
		System.out.println("평균 : "+z);
		
		if (x>=40 && y>=40 && z>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
			

		}
		
		
		
	}

}
