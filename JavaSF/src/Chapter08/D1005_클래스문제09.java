package Chapter08;

public class D1005_클래스문제09 {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9};
		int[] array2 = { 3, 6, -1, 100, 77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);

	}

}

class ArrayUtil {
	static int[] concat(int[] a, int[] b) {
		int[] concat= new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			concat[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			concat[i+a.length]=b[i];
		}
		return concat;
	}
	static void print(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	}
}