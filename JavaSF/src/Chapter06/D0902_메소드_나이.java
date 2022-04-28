package Chapter06;

import java.util.Scanner;

public class D0902_메소드_나이 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("출생연도 입력 : ");
		int year = s.nextInt();
		int age = calcAge(year);
		System.out.println(year+"년도에 출생한 사람 나이 : "+age);

	}

	private static int calcAge(int year) {
		int age = 2021-year+1;
		return age;
//		age 를 받아보고 난 후에 더 계산할 일이 있을경우에만 이렇게 한다.
//		출력만 하고 끝날거면 메소드에 출력까지 하는 걸 다 포함해서 적어도 된다.
	}
}
