package Chapter09;

public class D1012_�͸�Ŭ���� {

	public static void main(String[] args) {
		Animal a = new Animal() {
			void eat() {
				System.out.println("�Խ��ϴ�");
			}
			@Override
			void cry() {
				System.out.println("�۸۸�");
				eat();
//				���� Ŭ������ �ش����� �ʴ� �޼ҵ�� ��� �� �� ���� ������ �ȿ� ������ �� �ֵ��� ������ �Ѵ�.
			}
		};
		
		a.cry();
		

	}

}

class Animal {
	void cry() {
		System.out.println("��ϴ�");
	}
}
