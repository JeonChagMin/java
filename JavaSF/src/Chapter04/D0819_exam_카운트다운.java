package Chapter04;

import java.util.Scanner;

public class D0819_exam_카운트다운 {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
//	    System.out.println("숫자를 입력하세요 : ");
//	    String x= s.nextLine();
//	    int num = Integer.parseInt(x);
//	    System.out.println("카운트 다운을 시작합니다..");
//
//	    
//	     while (num!=0) {
//	       System.out.print(num+"...\n");
//	       num--;
//	     }
//
//	    System.out.println("발사!!");
		

	    System.out.println("정수를 입력하세요 : ");
	    int x = s.nextInt();
	    
	    for ( int i =1; i <= x; i++) {
	    	System.out.print(i+" ");
	    
		}
	    System.out.println("\n끝!");
	
	}
	
}
	



