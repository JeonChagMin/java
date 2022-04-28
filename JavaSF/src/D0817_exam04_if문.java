
public class D0817_exam04_if문 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1;
		System.out.print("랜덤 주사위 값은 : " + num);
//		if (num == 1) {
//			System.out.println("1번이 나왔습니다.");
//		} else if (num == 2) {
//			System.out.println("2번이 나왔습니다.");
//		} else if (num == 3) {
//			System.out.println("3번이 나왔습니다.");
//		} else if (num == 4) {
//			System.out.println("4번이 나왔습니다.");
//		} else if (num == 5) {
//			System.out.println("5번이 나왔습니다.");
//		} else {
//			System.out.println("6번이 나왔습니다.");
//		}

		switch (num) {
		case 1:
			System.out.println("1이다.");
			break;
		case 2:
			System.out.println("2이다.");
			break;
		case 3:
			System.out.println("3이다.");
			break;
		case 4:
			System.out.println("4이다.");
			break;
		case 5:
			
			
			
			
			
			
			System.out.println("5이다.");
			break;
		default:
			System.out.println("6이다");
			break;
		}
	}

}
