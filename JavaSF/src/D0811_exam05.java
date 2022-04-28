import java.util.Scanner;

public class D0811_exam05 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \""+inputData + "\"");
			if (inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
	}

}
