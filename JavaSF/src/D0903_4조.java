
public class D0903_4�� {

	public static void main(String[] args) {
		int[] score = {18, 50, 79, 90, 81, 92};
//		ListŬ���� ����
//		�޼ҵ� - ���(ave)/���հ�(sum)/���(grade)
//		���� ���-90���̻�(A),80-b,70-c,60-d,������f
//		���=�Ҽ��� ��°�ڸ����� ��Ÿ����
	}

}

class List {
	void ave(int[] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
		sum += sum+score[i];
		}
		System.out.println("��� : "+(double)sum/score.length);
	}
	void sum(int[] score) {
		int sum =0;
		for (int i = 0; i < score.length; i++) {
			sum+=sum+score[i];
		}
		System.out.println("���հ� : "+sum);
	}
	void grade(int[] score) {
			
		}
		
}