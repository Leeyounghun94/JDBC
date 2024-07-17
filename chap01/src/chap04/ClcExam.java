package chap04;

import java.util.Scanner;

public class ClcExam {

	public static void main(String[] args) {
		// 실습 : 계산기 만들기

		//주메뉴
		
		Scanner in = new Scanner(System.in);
		
		
		
		int x =0; // x = 숫자
		int y =0;// y = 숫자
		int z =0;// z = 부호
		int result=0; // 계산 결과 값
		
		
		System.out.println("숫자를 입력해주세요.");
		x = in.nextInt(); // x에다가 숫자 넣음
		
		System.out.print("두번째 숫자를 입력해주세요.");
		y = in.nextInt();//	y에다가 숫자 넣음
		
		System.out.print("1. 더하기, 2.빼기, 3.곱하기, 4.나누기, 5.나머지");
		z = in.nextInt();	// z에다가 부호 넣음
		
		switch (z) {
		case 1 : 
			result = plus(x, y); // x, y 값을 플러스 메서드에 넣어서 z값을 받는다.
			break;
			
		case 2 :
			result = minus(x,y);	// x, y값을 마이너스 메서드에 넣어서 z값을 받는다.
			break;
			
		case 3 :
			result = times(x,y);	// x, y값을 타임스(곱하기) 메서드에 넣어서 z값을 받는다.
			break;
			
		case 4 :
			result = devide(x,y);	// x, y값을 디바이드(나누기) 메서드에 넣어서 z값을 받는다.
			break;	
		
		case 5 :
			result = remain(x,y);	// x, y값을 리마인(나머지) 메서드에 넣어서 z값을 받는다.
			break;
		}
		
		
		System.out.println(" 결과 값 : " + result); // 결과 값 산출
		
	}	//메인 메서드 종료
	

static int plus(int x, int y) {
	int z = 0;
	z = x + y;
	
	return z;
}

static int minus(int x, int y) {
	int z = 0;
	z = x - y;
	
	return z;
}
static int times(int x, int y) {
	int z = 0;
	z = x * y;
	
	return z;
}
static int devide(int x, int y) {
	int z = 0;
	z = x / y;
	
	return z;
}	
static int remain(int x, int y) {
	int z = 0;
	z = x % y;
	
	return z;
}


}	//클래스 종료
