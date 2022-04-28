package Chapter08;

public class D0930_상속과추상문제04 {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();

	}

}

class Km2Mile extends Converter {
	
	Km2Mile(double mile) {
		this.ratio = mile;
	}

	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}
	
}
