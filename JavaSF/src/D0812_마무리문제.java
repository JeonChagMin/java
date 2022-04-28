import java.util.Scanner;


public class D0812_마무리문제 {

	public static void main(String[] args) {

//		문제 9번 소스파일
		Scanner s = new Scanner(System.in);
//		System.out.print("첫 번째 수 : ");
//		double a =s.nextDouble();
		
		
		
		
		
//		System.out.print("두 번째 수 : ");
//		double b =s.nextDouble();
//		double c =a/b;
//		System.out.println("-----------------");
//		
//		if (c>0) {
//			System.out.println("결과 : "+a/b);
//			
//		}else {
//			System.out.println("결과 : 무한대");
//		}
//		

//		문제 11번
		
//		System.out.print("아이디 : ");
//		String name =s.nextLine();
//		System.out.print("패스워드 : ");
//		String password=s.nextLine();
//		int password1 = Integer.parseInt(password);
//		
//		if (name.equals("java"))//String 은 비교할 때 equals 를 사용하여 비교해야한다
//			{
//			if (password1 ==12345) {
//			System.out.println("success");
//		}else {
//			System.out.println("로그인 실패");
//		} 
//		} else {
//			System.out.println("로그인 실패 : 아이디 존재");
		
		
		
		System.out.print("아이디를 입력하세요 : ");
		String name = s.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		int password = s.nextInt();
		
		if (name.equals("java")) {
			if (password == 12345) {
				System.out.print("로그인 성공.");
	
			}else {
				System.out.print("로그인 실패 : 비밀번호 오류.");
			} 
		    }else {
				System.out.println("로그인 실패 : 없는 아이디.");
			}

		}
		
		
	}

