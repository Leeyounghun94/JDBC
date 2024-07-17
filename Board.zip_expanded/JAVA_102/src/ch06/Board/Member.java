package ch06.Board;

import java.util.Scanner;

public class Member { // Member 객체

	String id;
	String pw;
	String nickName;
	String tel;
	String email;

	public static void menu(Scanner input, Member[] members) {
		boolean run = true;
		while (run) {
			System.out.println("========================== 회원 관리 메뉴 ==========================");
			System.out.println("1.회원가입 | 2.로그인 | 3.정보수정 | 4.회원탈퇴 | 5.회원 정보 확인 | 6.종료");
			System.out.print("원하시는 메뉴의 번호를 입력하세요 >>>>>");
			int memMenu = input.nextInt();

			switch (memMenu) {

			case 1:
				System.out.println("회원가입을 진행 합니다.");
				Member newMember = join(input);

				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = newMember;
						System.out.println("회원 가입 완료");
						// System.out.println("-테스트용" + newMember.id + newMember.email);
						break;
					} // if문 종료
				} // for문 종료
				if (newMember.id == null) {
					System.out.println("회원 가입 실패");
				} // if 문 종료
				break;

			case 2:
				System.out.println("로그인을 진행 합니다.");
				Member loginMember = login(input, members);
				if (loginMember.email == null) {
					System.out.println("입력 오류 : ID, 비밀번호를 확인해주세요");
				}

				break;

			case 3:
				System.out.println("정보수정을 진행 합니다.");
				Member modMember = modify(input, members);

				if (modMember.nickName != null) {
					System.out.println("변경할 정보 선택");
					System.out.println("1.ID | 2.PW | 3.닉네임 | 4.핸드폰 | 5.이메일");
					int modMenu = input.nextInt();
					switch (modMenu) {

					case 1:
						System.out.println("현재 ID : " + modMember.id);
						System.out.print("변경할 ID : ");
						modMember.id = input.next();
						System.out.println("ID 변경 완료 : " + modMember.id);
						break;

					case 2:
						System.out.println("현재 PW : " + modMember.pw);
						System.out.print("변경할 PW : ");
						modMember.pw = input.next();
						System.out.println("PW 변경 완료 : " + modMember.pw);
						break;

					case 3:
						System.out.println("현재 닉네임 : " + modMember.nickName);
						System.out.print("변경할 닉네임 : ");
						modMember.nickName = input.next();
						System.out.println("닉네임 변경 완료 : " + modMember.nickName);
						break;

					case 4:
						System.out.println("현재 핸드폰 번호 : " + modMember.tel);
						System.out.println("변경할 핸드폰 번호 : ");
						modMember.tel = input.next();
						System.out.println("핸드폰 번호 변경 완료 : " + modMember.tel);

						break;

					case 5:
						System.out.println("현재 email 주소 : " + modMember.email);
						System.out.println("변경할 email 주소 : ");
						modMember.email = input.next();
						System.out.println("email 주소 변경 완료 : " + modMember.email);
						break;

					default:
						System.out.println("1~5번 까지의 숫자만 입력해주세요");

					}// switch문 종료

				}
				if (modMember.nickName == null) {
					System.out.println("메인 메뉴로 돌아갑니다.");
				} // if문 종료
				break;

			case 4:
				System.out.println("회원탈퇴를 진행 합니다.");
				delete(input, members);

				break;

			case 5:
				System.out.println("회원 정보 확인입니다.");
				Member findMember = find(input, members);

				if (findMember != null) {
					System.out.println(findMember.nickName + "님 의 회원 정보 입니다. ");
					System.out.println("ID : " + findMember.id);
					System.out.println("PW : " + findMember.pw);
					System.out.println("닉네임 : " + findMember.nickName);
					System.out.println("핸드폰 번호 : " + findMember.tel);
					System.out.println("이메일 주소 : " + findMember.email);
				} else {
					System.out.println("입력오류 : 핸드폰번호,email 주소를 확인하세요");
				}
				break;

			case 6:
				System.out.println("메인 메뉴로 돌아 갑니다");
				run = false;
				break;

			default:
				System.out.println("1~5사이의 숫자만 입력해주세요.");
				break;

			}// switch문 종료

		} // while문 종료
	}// 회원 관리 메뉴메서드 종료

	public static Member join(Scanner input) {
		Member newMember = new Member();
		System.out.print("사용하실 id를 입력 해주세요 : ");
		newMember.id = input.next();
		System.out.print("사용하실 비밀번호를 입력 해주세요 : ");
		newMember.pw = input.next();
		System.out.print("사용하실 닉네임을 입력 해주세요 : ");
		newMember.nickName = input.next();
		System.out.print("정보확인을 위한 고객님의 핸드폰 번호를 입력하세요(-제외) : ");
		newMember.tel = input.next();
		System.out.print("정보확인을 위한 고객님의 이메일 주소를 입력하세요 : ");
		newMember.email = input.next();

		return newMember;

	} // 회원가입 메서드 종료

	public static Member login(Scanner input, Member[] members) {
		Member loginMember = new Member();
		System.out.print("id를 입력 해주세요 : ");
		loginMember.id = input.next();
		System.out.print("비밀번호를 입력해주세요 : ");
		loginMember.pw = input.next();
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].id.equals(loginMember.id) && members[i].pw.equals(loginMember.pw)) {
				loginMember = members[i];
				System.out.println(loginMember.nickName + "님 환영 합니다.");
				break;
			}
			// for문 종료

		}
		return loginMember;

	} // 로그인 메서드 종료

	public static Member modify(Scanner input, Member[] members) {
		Member modMember = new Member();
		System.out.println("ID를 입력 해주세요 : ");
		modMember.id = input.next();
		System.out.println("비밀번호를 입력 해주세요 : ");
		modMember.pw = input.next();
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].id.equals(modMember.id) && members[i].pw.equals(modMember.pw)) {
				modMember = members[i];
				break;
			}
			if (modMember.id == null) {
				System.out.println("입력오류 : ID, 비밀번호를 확인하세요");

			}

		} // for문 종료
		return modMember;
	}// 정보 수정 메서드 종료

	public static Member delete(Scanner input, Member[] members) {
		Member delMember = new Member();
		System.out.println("삭제할 계정의 ID를 입력 하세요 : ");
		delMember.id = input.next();
		System.out.println("삭제할 계정의 비밀번호를 입력 하세요 : ");
		delMember.pw = input.next();
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].id.equals(delMember.id) && members[i].pw.equals(delMember.pw)) {
				System.out.println("정말 삭제 할까요 ? (Yes or No 입력) :  ");
				String yn = input.next();
				if (yn.equalsIgnoreCase("yes")) {
					members[i] = null;
					delMember = members[i];
					System.out.println("회원 탈퇴가 완료되었습니다. 감사합니다.");
					break;
				} else if (yn.equalsIgnoreCase("no")) {
					System.out.println("메뉴로 돌아갑니다.");
					break;
				} else {
					System.out.println("입력 오류 : yes, no 만 입력해주세요");
					break;
				}

			}
			if (delMember.email == null) {
				System.out.println("입력 오류 : ID, 비밀번호를 확인해주세요");
				break;
			}

		} // for문 종료
		return delMember;
	}// 회원 삭제 메서드 종료

	public static Member find(Scanner input, Member[] members) {
		Member findMember = new Member();
		System.out.println("정보 확인을 위해 회원가입시 입력한 핸드폰번호와, email주소를 입력하세요 : ");
		System.out.print("핸드폰 번호 입력(-제외) : ");
		findMember.tel = input.next();
		System.out.print("email 주소 입력 : ");
		findMember.email = input.next();

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].tel.equals(findMember.tel)
					&& members[i].email.equals(findMember.email)) {
				findMember = members[i];
				break;
			} else {
				findMember = members[i];
			}

		} // for문 종료

		return findMember;
	}// find 메서드 종료

}
