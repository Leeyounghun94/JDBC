package chap04;

import java.util.Scanner;

public class SwitchExam5 {

	public static void main(String[] args) {
		// 주민번호 입력해서 남,녀 구분하기(switch문 활용)
		System.out.println("주민등록번호를 입력해주세요 (ex.20220222-7894568)");
		
		Scanner in = new Scanner(System.in);
		String number = in.nextLine();
		char gender = number.charAt(7);	// ->.charAt(숫자) -> 문자열중에 숫자에 해당하는 문자를 추출 한다.

		System.out.println(gender);
		
	
		switch(gender) {
		
		case '1' : case '3' : case '5' : case '7' :
			System.out.println("남자 입니다.");
			break;
			
		case '2' : case '4' : case '6' : case '8' :
			System.out.println("여자 입니다.");
			break;
			
		default :
			System.out.println("외계인 이시군요 ! ! ");
			System.out.println("너네 별로 가거라~");
			
		}	//스위치문 종료
		
	}	// 메서드 종료
	

}	//클래스 종료
