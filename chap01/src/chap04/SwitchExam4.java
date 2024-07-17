package chap04;

import java.util.Scanner;

public class SwitchExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inchar = new Scanner(System.in);
		String grade = "?";
		
		switch (grade) {
	
		case "플래티넘":
			System.out.println(grade + " 회원비 지급 : 1000만원");
			break;
		
		case "골드":
			System.out.println(grade + " 회원비 지급 : 500만원");
			break;	
		
		case "실버":
			System.out.println(grade + " 회원비 지급 : 250만원");
			break;
		
		case "브론즈":
			System.out.println(grade + " 회원비 지급 : 100만원");
			break;
			
		default :
			System.out.println("Unknown 입니다. ");
			System.out.println("회원가입 하시겠습니까? ");
			String newMember = inchar.next();
			
			if (newMember.equalsIgnoreCase("yes")) {
				System.out.println("회원가입을 진행 합니다. 어서오세요");
				System.out.println("아이디 : ");
				
				String id = inchar.next();
				System.out.println(id + "님 회원가입이 완료 되었습니다. 반갑습니다.");
				break;
			} else {
				System.out.println("정말 회원가입을 안하시겠습니까 ? ");
				System.out.println("정말로? 진짜로? 안한다고? ");
				break;
				
			} 	// 회원가입 if문 종료
				
				
			//break;
			
			
		}	//스위치문 종료
		

}	//메서드 종료
	
}	//클래스 종료
