package Chapter08;

public class D1005_Ŭ��������01 {

	public static void main(String[] args) {
		TV1 myTv = new TV1("LG",2017,32);
		myTv.show();

	}

}

class TV1 {
	String brand;
	int year;
	int ich;
	TV1(String brand, int year, int ich) {
		this.brand=brand;
		this.year = year;
		this.ich=ich;
	}
	
	void show() {
		System.out.println(brand+"���� ����"+year+"���� "+ich+"��ġ TV");
	}
	
}