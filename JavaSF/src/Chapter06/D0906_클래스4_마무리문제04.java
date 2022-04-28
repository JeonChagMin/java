package Chapter06;

public class D0906_클래스4_마무리문제04 {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		

	}

}

class Printer {
	void println(int value) {
		System.out.println(value);
	}
	void println(boolean value) {
		System.out.println(value);
		
	}
	void println(double value) {
		System.out.println(value);
	}
	void println(String value) {
		System.out.println(value);
	}
	
}
