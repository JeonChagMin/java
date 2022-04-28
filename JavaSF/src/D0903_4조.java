
public class D0903_4조 {

	public static void main(String[] args) {
		int[] score = {18, 50, 79, 90, 81, 92};
//		List클래스 생성
//		메소드 - 평균(ave)/총합계(sum)/등급(grade)
//		과목별 등급-90점이상(A),80-b,70-c,60-d,나머지f
//		평균=소숫점 둘째자리까지 나타나게
	}

}

class List {
	void ave(int[] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
		sum += sum+score[i];
		}
		System.out.println("평균 : "+(double)sum/score.length);
	}
	void sum(int[] score) {
		int sum =0;
		for (int i = 0; i < score.length; i++) {
			sum+=sum+score[i];
		}
		System.out.println("총합계 : "+sum);
	}
	void grade(int[] score) {
			
		}
		
}