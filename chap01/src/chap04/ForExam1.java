package chap04;

public class ForExam1 {

	public static void main(String[] args) {
		// 반복문 for문 복습하기
		// for문은 회수를 알고 있을 때 사용한다.
		
		

		int sum = 0;
		sum = sum +1 ;
		sum = sum +2 ;
		sum = sum +3 ;
		sum = sum +4 ;
		sum = sum +5 ;
		System.out.println("1 ~ 5까지의 합 : " + sum);
		
		
		for(int i = 1 ; i <= 100; i++) { sum = sum + i ;	// i는 1이고 1이 100 이하 수, i ++
	}
		System.out.println("1 ~ 100 까지의 합 : " + sum);
		
		System.out.println("==========================================");
		
		int sum1;
		
		for (sum1 = 1; sum1 <=10; sum1++) {
			System.out.print(sum1 + "");
}
	
	
}}