package Chapter06;

public class D0909_클래스6_예제06 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setspeed(60);
//		private의 접근제한자를 초기화한다.
		if (!myCar.isstop()) {
			myCar.setstop(true);
		}
		System.out.println("현재 속도 : " + myCar.getspeed());

	}

}

class Car {
	private int speed;
	private boolean stop;

	public int getspeed() {
		return speed;
	}

	public void setspeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isstop() {
		return stop;
	}

	public void setstop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
