package Chapter09;

public class D1008_중첩클래스_마무리문제03 {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
		
		
		

	}

}

class Car {
	class Tire{
	}
	static class Engine{
		
	}
}