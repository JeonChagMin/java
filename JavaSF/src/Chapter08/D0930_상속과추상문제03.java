package Chapter08;

import java.util.Scanner;

public class D0930_��Ӱ��߻���03 {
	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+ "��"+getDestString()+"�� �ٲߴϴ�");
		System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ��� : "+res+getDestString()+"�Դϴ�");
		scanner.close();
	}
}

class Won2Dollar extends Converter {

	Won2Dollar(double money) {
		this.ratio = money;
		
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "��";
	}

	@Override
	protected String getDestString() {
		return "�޷�";
	}
}	

