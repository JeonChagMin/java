package Chapter06;

public class D0910_클래스_기본문제05 {
	
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}
	static int[] shuffle(int[] arr ) {
		for (int i = 0; i < 100; i++) {
		int st = (int)(Math.random()*arr.length);
		int ed = (int)(Math.random()*arr.length);
		int imsi = arr[st];
		arr[st] = arr[ed];
		arr[ed] = imsi;
		}
		return arr;
	}

}
