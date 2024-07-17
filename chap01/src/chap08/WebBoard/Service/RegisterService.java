package chap08.WebBoard.Service;

import java.util.Scanner;

public class RegisterService {


	public static void register(Scanner scanner, RegisterService[] registers) {
		// WebBoard - 회원가입 객체
		
		System.out.println("================ 회원가입 System =============");
		System.out.println("1.생성할 ID를 입력해주세요.");
		System.out.println(">>>");
		String id = scanner.next();
		
		System.out.println("2.PassWord를 입력해주세요.");
		System.out.println(">>>");
		String pw = scanner.next();
		
		System.out.println("3.e-mail를 입력해주세요.");
		System.out.println(">>>");
		String email = scanner.next();
		
		System.out.println("4.본인의 핸드폰 번호를 입력해주세요.");
		System.out.println(">>>");
		int ph = scanner.nextInt();
		
		
		RegisterService newRegister = new RegisterService();
		for(int i=0; i < registers.length; i++) {
			if(registers[i] == null) {
				registers[i] = newRegister;
				System.out.println("회원가입이 완료 되었습니다.");
				break;
			}//if문 종료
			                       
		}//for문 종료
		
		
		
	}

	

	
	
}
