package chap06.Borad;

import java.util.Scanner;

public class Member {	// 멤버 클래스가 하는 일 = 회원에 대한 C R U D

	
	
	
	//필드 -> 멤버 클래스에 대한 변수 선언
	
	String id;
	String pw;
	String nickName;
	String email;
	
	int phNum; // 휴대폰 번호
	
	
	
	
	//생성자
	
	
	
	
	
	
	//메서드
	
	
	public static Member register(Scanner input) {
		// 새로운 Member 객체를 생성하여 키보드로 넣은 필드값을 삽입하고 객체로 리턴
		Member newMember = new Member();
		
		System.out.println("아이디를 입력하세요.");
		newMember.id = input.next();
		
		System.out.println("암호를 입력하세요");
		newMember.pw = input.next();
		
		System.out.println("닉네임을 입력하세요");
		newMember.nickName = input.next();
		
		System.out.println("이메일을 입력하세요");
		newMember.email = input.next();
		
		System.out.println("등록할 휴대폰 번호를 입력해주세요(-제외)");
		newMember.phNum = input.nextInt();
		
		return newMember;
	}//회원가입 메서드 종료
	
	
	public static Member login(Scanner input, Member[] members) { 
		//		매개값 =		키보드 입력값,			회원배열
		Member loginMember = new Member();	//키보드로 입력한 객체 생성
		
		System.out.println("아이디를 입력하세요");
		System.out.print(">>>");
		loginMember.id = input.next(); // 키보드로 입력받은 id를 새로 만든 객체에 넣는다
		
		System.out.println("비밀번호를 입력하세요");
		System.out.print(">>>");
		loginMember.pw = input.next(); // 키보드로 입력받은 pw를 새로 만든 객체에 넣는다
		
		// 배열에 있는 객체와 새로 만든 객체 비교 시작
		for (int i=0; i < members.length; i++) {
			if(members[i] != null) { //배열에 빈칸이 아니면!
				if(members[i].id.equals(loginMember.id) &&
						members[i].pw.equals(loginMember.pw) ) {
					//배열에 있는 id와 키보드로 입력한 id가 같고 배열에 있는 pw와 입력한 pw가 같다
					//loginMember는 2개의 값과 members[i] 4개의 값을 가지고 있다
					loginMember = members[i];	// 교체
				}// if문 종료(id, pw 비교 -> 객체로 바꿈)
				
				
			}else {
				System.out.println("회원 정보가 없습니다.");
				System.out.println("id와 pw를 확인하세요");
				break;
				//register(input); -> 가입을 진행하세요 하면서 회원가입으로 넘어가면서 메서드가 진행// 이런식으로 응용 가능 
			}//if문 종료
		}//for문 종료
		return loginMember;
		
	}//로그인 메서드 종료
	
	
	public static Member modify(Scanner input, Member[] members) {
		System.out.println("회원정보 수정을 시작합니다.");
		Member modifyMember = new Member(); // -> 키보드로 입력한 수정할 멤버 객체 생성
		
		System.out.println("회원님의 아이디를 입력해주세요");
		System.out.print(">>>");
		modifyMember.id = input.next(); // -> 수정하고 싶은 id를 키보드로 입력받음
		System.out.println("비밀번호를 입력하세요");
		System.out.print(">>>");
		modifyMember.pw = input.next(); // -> pw를 키보드로 입력받음..
		
		if(modifyMember == null)
			System.out.println("회원정보가 없습니다. 다시 한번 입력해주세요.");
		else { // 수정할 회원정보가 있으면 ?
			System.out.println("수정할 번호를 입력 해주세요.");
			System.out.println("1.닉네임 | 2.이메일 주소 | 3.핸드폰 번호");
			System.out.println(">>>");
			int select = input.nextInt();
			
			switch (select) {
			case 1: 
				System.out.println("닉네임을 수정합니다.");
				modifyMember.nickName = input.next();
				System.out.println("닉네임 수정 완료");
				break;
			
			case 2:
				System.out.println("이메일 주소를 수정합니다.");
				modifyMember.email = input.next();
				System.out.println("이메일 수정 완료");
				break;
				
			case 3:
				System.out.println("핸드폰 번호를 수정합니다.");
				modifyMember.phNum = input.nextInt();
				
			default :
				System.out.println("1~3번만 입력 가능합니다.");
				
			}//스위치종료문	
		}// if-else문 종료
		
		return modifyMember;
		
	}//회원수정 메서드 종료
	
	public static Member delete(Scanner input,  Member[] members) {
		System.out.println("회원탈퇴를 시작합니다.");
		Member deleteMember = new Member(); // -> 키보드로 입력한 삭제할 멤버 객체 생성	
		
		System.out.println("☆★회원탈퇴 서비스를 이용하기 전에 아이디와 비밀번호를 다시 한번 입력해 주세요★☆");
		
		System.out.println("아이디를 입력하세요");
		System.out.print(">>>");
		 deleteMember.id = input.next(); // 키보드로 입력받은 id를 새로 만든 객체에 넣는다
		System.out.println("비밀번호를 입력하세요");
		System.out.print(">>>");
		 deleteMember.pw = input.next(); // 키보드로 입력받은 pw를 새로 만든 객체에 넣는다
		 
		 for (int i=0; i < members.length; i++) {
				if(members[i] != null) { //배열에 빈칸이 아니면!
					if(members[i].id.equals(deleteMember.id) &&
							members[i].pw.equals(deleteMember.pw) ) {
						//배열에 있는 id와 키보드로 입력한 id가 같고 배열에 있는 pw와 입력한 pw가 같다

						deleteMember = members[i];	// 교체
					}// if문 종료(id, pw 비교 -> 객체로 바꿈)
					
					
				}else {
					System.out.println("회원 정보가 없습니다.");
					System.out.println("id와 pw를 확인하세요");
					break; 
				}//if문 종료
			}//for문 종료
		
		 System.out.println("정말 회원 탈퇴를 하시겠습니까?");
		 System.out.println("1. 탈퇴하기 | 2.취소하기");
		 System.out.println(">>>");
			int select = input.nextInt();
			switch (select) {
			case 1:
				System.out.println("회원 탈퇴가 완료 되었습니다. 안녕히 가십시오.");
				break;
				
			case 2:
				System.out.println("더 나은 서비스로 보답하겠습니다.");
				
			}//스위치 종료문
		 return deleteMember;
	}
	
	public static void menu(Scanner input, Member[] members) { // << 순서 바뀌면 안된다.
		//			매개값을 = 스캐너		멤버배열
		System.out.println("-----------회원 전용 메뉴 입니다.----------");
		boolean run = true;
		while(run) {
			System.out.println("1.회원가입 | 2.로그인 | 3. 정보수정 | 4.회원탈퇴 | 5.종료");
			System.out.println(">>>");
			int select = input.nextInt();
				switch(select) {
				case 1:
					System.out.println("회원 가입을 진행합니다.");
					Member newMember = register(input);
					// 	키보드로 입력받을 필드 완성 후 객체로 받음
					
					// 2번째 작업 = 멤버배열 null을 찾아서 삽입
					
					for(int i=0; i < members.length; i++) {
						if(members[i] == null) {
							members[i] = newMember;
							System.out.println(newMember.nickName + "객체가 배열에 저장됨");
							break; // for문이 끝나야되서 break를 넣어줘야 한다.
						}
					}// for문 종료(null을 찾아서 객체를 삽입)
					
					break;
					
					
				case 2:
					System.out.println("로그인을 진행합니다.");
					Member loginMember = login(input, members); //호출 시 스캐너와 배열 객체 전달
					System.out.println(loginMember.nickName + "님 환영합니다.");
					break;
					
					
				case 3:
					System.out.println("회원 정보를 수정합니다.");
					Member modifyMember= modify(input, members); //
					System.out.println(modifyMember.id + "님 수정이 완료되었습니다.");
					break;
					
					
				case 4:
					System.out.println("탈퇴를 진행합니다.");
					Member deleteMember = delete(input, members); //
					System.out.println(deleteMember.id + "님 정상적으로 회원 탈퇴가 되었습니다. 감사합니다.");
					break;
					
					
				case 5:
					System.out.println("회원전용 메뉴를 종료 합니다.");
					
					run = false;
					break;	
					
					
				default:
					System.out.println("1 ~ 5 사이의 값만 입력하세요");
					
					
				}//스위치문 종료
			
			
			
			
		}//while문 종료
		
		
		
	}//메뉴메서드 종료
}
