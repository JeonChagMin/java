package Chapter07;

public class D0923_�⺻����01 {

	public static void main(String[] args) {
		Tv1 t = new Tv1();
	}

}

class Product0 {
	int price;
	int bonusPoint;
	
	Product0() {
		this(5);
	}
	Product0(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product0 {
	Tv1(){
		
	}
	public String toString() {
		return "TV";
	}
}
