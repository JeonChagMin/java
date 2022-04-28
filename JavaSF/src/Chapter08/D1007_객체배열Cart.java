package Chapter08;

import java.util.Scanner;

public class D1007_객체배열Cart {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("카트의 크기를 정하세요 : ");
		int num= s.nextInt();
		Cart[] c = new Cart[num];
		for (int i = 0; i < c.length; i++) {
			System.out.print("상품명 : ");
			String product=s.next();
			System.out.print("가격 : ");
			int money=s.nextInt();
			c[i]=new Cart(product, money);
			
		}
		System.out.println("담은 상품의 정보 " );
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
		return "상품명 : "+product+" 가격 : "+money;
	}
	
	
}