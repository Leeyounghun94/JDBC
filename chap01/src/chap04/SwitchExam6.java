package chap04;

import java.util.Scanner;

public class SwitchExam6 {

	public static void main(String[] args) {
		// 자바마스터 실습 따라해보기 (switch문)
		
		char grade = 'E';
		
		switch (grade) {
		case 'A' : 
			System.out.println("매우 우수");
			break;
			
		case 'B' :
			System.out.println("우수");
			break;
		
		case 'C' :
			System.out.println("좋음");
			break;
		
		case 'D' :
			System.out.println("미약");
			break;
		
		case 'E' :
			System.out.println("분발");
			break;
		
		default :
			System.out.println("잘못 입력된 등급");
			
			
		}//스위치문 종료
System.out.println("=========================================");

System.out.println("당신의 점수인 5에서 10이하 값을 입력하시오.");

Scanner in = new Scanner(System.in);

int num = in.nextInt();
switch (num) {

case 10 :
	System.out.println(" A 학점");
	break;
	
case 9 :
	System.out.println(" B 학점");
	break;
	
case 8 :
	System.out.println(" C 학점");
	break;
	
case 7 :
	System.out.println(" D 학점");
	break;
	
case 6 :
	System.out.println(" E 학점");
	break;
	
case 5 :
	System.out.println(" F 학점");
	break;
	
default :
	System.out.println("넌 나가라 ");
	
	

}
	}//메서드문 종료

}//클래스문 종료
