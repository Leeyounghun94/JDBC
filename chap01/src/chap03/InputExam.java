package chap03;

import java.util.Scanner;

public class InputExam {

	public static void main(String[] args) {
		// Scanner 클래스의 nextInt, nextDouble 메서드 이용해보기
		
		
		
		Scanner s1 = new Scanner(System.in);
		System.out.println(" 정숫값 입력하기");
		int n = s1.nextInt();
		
		System.out.println("실숫값 입력하기");
		double aa = s1.nextDouble();
		
		System.out.println(" 정숫값 : " + n);
		System.out.println(" 실숫값 : " + aa);
		
	}

}
