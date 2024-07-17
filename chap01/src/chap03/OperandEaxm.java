package chap03;

public class OperandEaxm {

	public static void main(String[] args) {
		// 단항 연산자는 항이 한개로 처리하는 연산 기법
		// 부호 연산자 는 + -
		// 증감 연산자 ++, -- 는 값을 증가 하거나 감소 함
		// 논리 부정 연산자 = T/F 
		// 비트 반전 연산자 = ~ = 0을 1 , 1을 0으로
		
		int x=100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		// int = x=100 하니까 100, -100 이 나왔는데 
		
		int t=-100;
		int result3= +t;
		int result4= -t;
		
		System.out.println(result3);
		System.out.println(result4);
		
		// 이번엔 int = -100 을 해보니까 -100 / 100이 나왔다.
		// 결국, +,-는 첫번째 값에 부호가 양수나 음수냐애 따라 결과값이 달라진다.
		
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ");
		int a = 10;
		int b = 10;
		int c = 0;
		
		a++; //피연산자 1 증가 시킨다./ 증감연산자가 변수 앞에 있으면 우선 변수를 1증가, 1감소를 시키고 다른 연산자와 계산한다
		++a; //피연산자 1 감소  "   / 증감연산자가 변수 뒤에 있으면 다른 연산자를 먼저 처리한 후 변수를 1증가, 1감소 시킨다.

		
		
		System.out.println("a= " + a);
		// a= 10 , +1 , +1 = 12?
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
