package Chapter08;

import java.util.Scanner;

public class D1007_��ü�迭Cart {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("īƮ�� ũ�⸦ ���ϼ��� : ");
		int num= s.nextInt();
		Cart[] c = new Cart[num];
		for (int i = 0; i < c.length; i++) {
			System.out.print("��ǰ�� : ");
			String product=s.next();
			System.out.print("���� : ");
			int money=s.nextInt();
			c[i]=new Cart(product, money);
			
		}
		System.out.println("���� ��ǰ�� ���� " );
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]+" ");
		}

	}

}

class Cart {
	
	private String product;
	private int money;
	Cart() {
		
	}
	Cart( String p, int m) {
		money=m;
		product=p;
	}
	@Override
	public String toString() {
		return "��ǰ�� : "+product+" ���� : "+money;
	}
	
	
}