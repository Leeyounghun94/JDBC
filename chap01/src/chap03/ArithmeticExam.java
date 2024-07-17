package chap03;

public class ArithmeticExam {

	public static void main(String[] args) {
		// 이항 연산자는 2개의 항으로 계산 되어 결과 산출.
		
		
		int v1 =5;
		int v2 =10;
		int result1 = v1 * v2;
		System.out.println("result = " + result1);
		
		
		int result2 = v1 + v2;
		System.out.println("result = " + result2);
		
		int result3 = v1 / v2;
		System.out.println("result = " + result3);
		
		int result4 = v1 % v2;
		System.out.println("result = " + result4);
		
		double result5 = v1 / v2;
		System.out.println("result = " + result5);
		
		double result6 = (double) v1 / v2;
		System.out.println("result = " + result6);
		
		
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println("x값 * y값 = " + z);	// <- 이렇게 하면 자리범위 값이 오버가 되기 때문에 -72737 . . . 이 뜬다.
		
		
		long zl = (long) x * y;
		System.out.println("long 강제 + 자동타입 변환 : " + zl);
		
		
		
		
		System.out.println("소수점 정확한 계산은 float, double ?? ");
		
		int apple = 1;
		double  appleUnit = 0.1;
		int piece = 7;
		
		double result = apple - (piece*appleUnit); //-> 1 - (7 * 0.1) = 1.0-0.7=0.3 인데 ?
		System.out.println("남은 사과 조각 수는 : " + result); // -> 0.299999999 가 나오네?  그래서 결국, double ㄴㄴ
		
		
		int appleint =1;
		int totalpieces = appleint * 10; // = 나누지 말고 곱해봐
		int number = 7; // 7개
		int temp = totalpieces - number; // 10조각 - 7 조각 = 3조각
		
		double resultint = temp / 10.0; // 3 나누기 10.0 하면 ? 
		
		System.out.println(" 사과 1개 에서 0.7 빼면 ? + " + resultint);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
