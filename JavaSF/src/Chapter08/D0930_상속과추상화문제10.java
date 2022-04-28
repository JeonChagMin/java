package Chapter08;

public class D0930_상속과추상화문제10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));

	}

}

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();

}

class Dictionary extends PairMap {
	int index=0;
	int length;
	String result;

	Dictionary(int x) {
		this.keyArray = new String[x];
		this.valueArray = new String[x];
	}

	@Override
	String get(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i]==key) {
				this.result = valueArray[i];
			}
		}
		return result;
	}

	@Override
	void put(String key, String value) {
		this.keyArray[index] =key;
		this.valueArray[index] = value;
		index++;
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i]==key) {
				valueArray[i]=value;
			}
		}

	}

	@Override
	String delete(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i].equals(key)) {
				valueArray[i]=null;
			}
		}
		return null;
	}

	@Override
	int length() {
		this.length=index+1;
		return this.length;
	}

}