package Chapter14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class D1028_writer {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println(" ���� : 1 , ���� : 2");
		System.out.println("-------------------");
		int num = s.nextInt();
		s.nextLine();
		boolean a = true;
		switch (num) {
		case 1:
			a =false;
			System.out.println("-������ ������ �Է����ּ���-");
			break;
		case 2:
			a=true;
			System.out.println("-�߰��� ������ �Է����ּ���-");
			break;
		}
		Writer op = new FileWriter("C:\\Temp\\print.txt",a);
		if (a==true) {
			op.write("\r\n",0,4);
		}
		System.out.println("  ���ڸ� �Է��ϼ���  ");
		while (true) {
			String word = s.nextLine();
			op.write(word);
			op.write("\r\n",0,2);
			if (word.equals("")) {
				System.out.println("�ý��� ����");
				break;
			}
		}
		op.flush();
		op.close();

	}

}
