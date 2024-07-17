package chap08.WebBoard.Service;


import java.util.Scanner;

import chap08.WebBoard.DTO.Member;


public class LoginService {

	
	public static Member Loginmenu(Scanner scanner, RegisterService[] registers, Member[] members) {
		// WebBoard - 로그인 객체
		Member member = new Member();
		
		System.out.println("==========Login System ============");
		System.out.println("1.회원가입 | 2.로그인 |3.회원수정 |4. 메인화면 돌아가기");
		System.out.println(">>>");
		int select = scanner.nextInt();
		
		switch (select) {
		case 1 :
			System.out.println("회원가입을 시작합니다.");
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
			
			
			for(int i=0; i < members.length; i++ ) {
				if(members[i] ==null) {
					members[i] = member;
					System.out.println("회원가입이 완료 되었습니다.");
					break;
				}//if문 종료
			}//for문 종료
			
			
			
		case 2 :
			System.out.println(" 로그인을 시작합니다. ");
			System.out.println("ID : ");
			String id1 = scanner.next();
			
			System.out.println("P.W : ");
			String pw1 = scanner.next();

			Member login= new Member();
			login.setId(id1);
			login.setPw(pw1);
			
			for(int i=0; i < members.length; i++) {
				if(members[i] !=null) {
					if(members[i].getId().equals(login.getId()))	{//겟아이디랑 겟 아이디랑 비교해서
						System.out.println("해당하는 id가 있습니다.");
						if(members[i].getPw().equals(login.getPw())) {//겟 pw랑 겟pw 비교
							System.out.println("해당하는 pw가 있습니다.");
							login = members[i]; 
							System.out.println("로그인 성공 !");
							member=login;
							break;
							
						} else {
							System.out.println("해당하는 pw가 없습니다.");
						}
					}else {
						System.out.println("해당하는 id가 없습니다.");
						
					}
				}else {
					System.out.println("해당하는 정보가 없습니다.");
					break;
				}//빈 객체 비교
			
			}//for문 종료
		case 3:
			System.out.println("회원정보를 수정합니다.");
			
			break;
			
			
		case 4:
			System.out.println("메인화면으로 돌아갑니다.");	
			break;
			
			
		default:
			System.out.println("값 제대로 넣으세요");
			
		}// 스위치문 종료
	
		return member;
	}//로그인 종료


}//클래스 종료
