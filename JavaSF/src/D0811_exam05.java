import java.util.Scanner;

public class D0811_exam05 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ� : \""+inputData + "\"");
			if (inputData.equals("q")) {
				break;
			}
		}
		System.out.println("����");
	}

}
