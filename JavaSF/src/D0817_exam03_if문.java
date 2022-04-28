import java.util.Scanner;

public class D0817_exam03_if문 {

	public static void main(String[] args) {

//		int score = 75;
//
//		if (score >= 90) {
//			System.out.println("점수가 100~90입니다.");
//			System.out.println("등급은 A입니다");
//		} else if (score >= 80) {
//			System.out.println("점수가 80~89입니다");
//			System.out.println("등급은 B입니다.");
//		} else if (score >= 70) {
//			System.out.println("점수가 70~79입니다.");
//			System.out.println("등급은 C입니다");
//		} else {
//			System.out.println("점수가 70 미만입니다.");
//			System.out.println("등급은 D입니다");
//		}
		
//		int kor = 75, mat=65;
//		국어가 90이상이고 수학이 88이상이면 "A"
//		국어가 80이상이고 수학이 76이상이면 "B"
//		국어가 70이상이고 수학이 65이상이면 "C"
//		국어가 70미만이고 수학이 65미만이면 "D"
//		
//		if (kor >= 90 && mat >=88) {
//			System.out.println("등급은 A입니다.");
//		} else if (kor >= 80 && mat >=76) {
//			System.out.println("등급은 B입니다.");
//		} else if (kor >= 70 && mat >=65) {
//			System.out.println("등급은 C입니다.");
//		} else {
//			System.out.println("등급은 D입니다.");
//		}
//		
//		Scanner 이용, 국어, 영어, 수학 입력 받아서 평균을 구한 후
//		평군이 90 이상이면 등급이 "A"
//		평군이 88 이상이면 등급이 "B"
//		평군이 78 이상이면 등급이 "C"
//		평군이 70 이상이면 등급이 "D"
//	    나머지는 "F"
		Scanner s= new Scanner(System.in);
		
		System.out.print("국어점수를 입력해주세요 : ");
		int kor = s.nextInt();
		System.out.print("수학점수를 입력해주세요 : ");
		int mat = s.nextInt();
		System.out.print("영어점수를 입력해주세요 : ");
		int eng = s.nextInt();
		int ave = (kor + mat + eng)/3;
		
		if (ave >=90) {
			System.out.println("A 등급입니다.");
		} else if (ave >=88) {
			System.out.println("B 등급입니다.");
		} else if (ave >=78) {
			System.out.println("C 등급입니다.");
		} else if (ave >=70) {
			System.out.println("D 등급입니다.");
		} else {
			System.out.println("F 등급입니다.");
		}
		

	}

}
