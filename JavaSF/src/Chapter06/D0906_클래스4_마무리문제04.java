package Chapter06;

public class D0906_Ŭ����4_����������04 {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		

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
