package Chapter08;

public class D0930_상속과추상문제01 {

	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32,1024);
		myTv.printProperty();

	}

}

class Tv {
	private int size;
	Tv(int size){
		this.size =size;
	}
	
	protected int getSize() {
		return size;
	}
}

class ColorTv extends Tv {
	private int color;
	
	ColorTv(int size) {
		super(size);
	}
	
	ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}
	
	void setColor(int color) {
		this.color = color;
	}
	
	int getColor() {
		return color;
	}
	
	void printProperty() {
		System.out.println(getSize()+"인치 "+getColor()+"컬러");
	}

	
}