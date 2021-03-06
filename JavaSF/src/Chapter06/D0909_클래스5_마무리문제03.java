package Chapter06;

public class D0909_클래스5_마무리문제03 {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}

	}

}

class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {
	}
	
	static ShopService getInstance() {
		return singleton;
	}
}
