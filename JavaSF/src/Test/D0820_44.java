package Test;

import java.util.Scanner;

public class D0820_44 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("학점을 입력해주세요 : ");
		int num = s.nextInt();
		String grade = "";
		if (num >= 90) {
			if (num < 94) {
				grade += "A-";
			} else if (num >= 98) {
				grade += "A+";
			} else {
				grade = "A";
			}
		}

		else if (num >= 80 && num < 90) {
			if (num >= 80 && num < 84) {
				grade += "B-";
			} else if (num >= 88) {
				grade += "B+";
			} else {
				grade = "B";
			}
		}

		else if (num >= 70 && num < 80) {
			if (num >= 70 && num < 74) {
				grade += "C-";
			} else if (num >= 78) {
				grade += "C+";
			} else {
				grade = "C";
			}
		}

		else if (num >= 60 && num < 70) {
			if (num >= 60 && num < 64) {
				grade += "D-";
			} else if (num >= 68) {
				grade += "D+";
			} else {
				grade = "D";
			}
		} else {
			grade = "F";
		}

		System.out.println("점수 : " + num + " 학점 : " + grade);
	}

}
