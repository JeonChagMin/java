package Chapter13;

public class D1021_Á¦³×¸¯ {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
//		Box aBox = new Box();
//		Box oBox = new Box();
		aBox.setOb(new Apple());
		oBox.setOb(new Orange());
//		Apple ap = (Apple)aBox.getOb();
//		Orange og = (Orange)oBox.getOb();
		Apple ap = aBox.getOb();
		Orange og = oBox.getOb();
		
		System.out.println(ap);
		System.out.println(og);

	}

}

class Box<T> {
	private T ob;
	
	void setOb(T ob) {
		this.ob = ob;
	}
	
	T getOb() {
		return ob;
	}
}


class Apple {
	@Override
	public String toString() {
		return "I am Apple";
	}
}

class Orange {
	@Override
	public String toString() {
		return "I am Orange";
	}
}
