package chap04;

public class ForPrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0 , j=100; i<=10 && j >=90; i++, j--) {
		System.out.println("i값의 증가 : " + i + " // j값의 감소 : " + j);
	
	}
		
		System.out.println("=====================================");
		
		for(int i = 1 ; i <=10 ; i++) {	// i는 1이며, i가 10이하에서 돌고 돈다. 
			System.out.println(" 1 ~ 10까지의 출력 : " + i); 
		}
		
		System.out.println("=====================================");
		
		for(int a = 1 ; a <= 20 ; a = a + 5 ) {	// a는 1인데, 20이하인 a에서 + 5 씩 더해본다.
			System.out.println(" 1 ~ 20까지의 숫자를 출력 : " + a);
			
		}
	}
}
