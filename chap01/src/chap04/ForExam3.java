package chap04;

public class ForExam3 {

	public static void main(String[] args) {
		// 1부터 100 까지 for문을 이용해서 합을 구함.
		
		int sum = 0; // sum=0 이라고 변수를 선언함.
		
		for(int i = 1 ; i <= 100; i ++) { // 1 ~ 100까지의 증가값
			sum = sum + i;
	}	// for문 종료
		System.out.println(" 1 ~ 100 까지의 합 : " + sum);
		
		System.out.println("=========================================");
		
		
		int i = 1;
		for (	; i <=500 ; i++) {
				sum = sum + i;
				
		}
		System.out.println(" 1 ~ " + (i - 1) + " 까지의 합 : " + sum);
		
		
}	// 메서드 종료
}	// 클래스 종료