import java.util.ArrayList;

public class easad {
	public static void main(String[] args) {
		ArrayList<String> carlist = new ArrayList<String>();
		carlist.add("A");
		carlist.add("B");
		carlist.add("C");
		
		String[] check = {"A","C"};
		int size = carlist.size();
		String product;
		int result = 0;
		boolean aaa =true;
		
		for (int i = 0; i < size; i++) {
			product=carlist.get(result);
			for (int j = 0; j < check.length; j++) {
				if (product.equals(check[j])) {
					carlist.remove(product);
					aaa=false;
				}
			}
			
			if (aaa=true) {
				result++;
			}
			aaa=true;
		}
		
		for (int i = 0; i < carlist.size(); i++) {
			System.out.println(carlist.get(i));
		}
		
		}

}
