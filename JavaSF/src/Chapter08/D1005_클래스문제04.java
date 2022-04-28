package Chapter08;

public class D1005_Ŭ��������04 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ "+s.square());
		if (t.contains(r)) {
			System.out.println("t�� r�� �����մϴ�.");
		}
		if (t.contains(s)) {
			System.out.println("t�� s�� �����մϴ�.");
		}

	}

}

class Rectangle {
	int x,y,width,height;
	
	Rectangle(int x, int y, int width, int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	int square() {
		return this.width*this.height;
	}
	
	void show() {
		System.out.println("("+this.x+", "+this.y+")���� ũ�Ⱑ "+this.width+"x"+this.height+"�� �簢��");
	}
	
	boolean contains(Rectangle r) {
		if (this.x+this.width>r.x+r.width && this.y+this.height>r.y+r.height) {
			return true;
		}
		else {
			return false;
		}
	}
}