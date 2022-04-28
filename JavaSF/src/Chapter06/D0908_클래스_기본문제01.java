package Chapter06;

public class D0908_클래스_기본문제01 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());

	}

}

class SutdaCard{
	int num;
	boolean isKwang;
	SutdaCard(){
		this(1,true);
	}
	
//	SutdaCard(int num){
//		this.num=num;
//	}
//	
//	SutdaCard(boolean isKwang){
//		this.isKwang=isKwang;
//	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		String result;
		if (isKwang) {
			result = num+"k";
		} else {
			result = num+"";
		}
//		조건이 두가지면 else if를 쓰면 안된다.
		
		return result;
//		String result = isKwang ? num+"k" : num+"";
//		return result;
	}
}
