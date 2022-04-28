package Chapter14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class D1028_writer {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println(" 생성 : 1 , 수정 : 2");
		System.out.println("-------------------");
		int num = s.nextInt();
		s.nextLine();
		boolean a = true;
		switch (num) {
		case 1:
			a =false;
			System.out.println("-생성할 내용을 입력해주세요-");
			break;
		case 2:
			a=true;
			System.out.println("-추가할 내용을 입력해주세요-");
			break;
		}
		Writer op = new FileWriter("C:\\Temp\\print.txt",a);
		if (a==true) {
			op.write("\r\n",0,4);
		}
		System.out.println("  문자를 입력하세요  ");
		while (true) {
			String word = s.nextLine();
			op.write(word);
			op.write("\r\n",0,2);
			if (word.equals("")) {
				System.out.println("시스템 종료");
				break;
			}
		}
		op.flush();
		op.close();

	}

}
