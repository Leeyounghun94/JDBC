package chap06.VendingMachine;

import java.util.Scanner;

public class Admin {// 자판기 프로그램 -> 관리자 객체

	/*
	  관리자 C R U D
	  
	  C = 상품등록 
	  R = 상품보기, 통계보기 
	  U = 음료리필, 메뉴변경 
	  D = 상품삭제
	 
	 */

	// 필드

	String id; // -> 관리자용 ID
	String pw; // -> 관리자용 PW
	String email; // -> 관리자용 이메일
	int ph; // 관리자용 핸드폰번호

	// 생성자

	// 메서드
	public static Scanner input = new Scanner(System.in);

	public static void menuAdmin(Admin[] admins, Item[] items) {

		System.out.println("=====================관리자(Admin) 전용 메뉴====================");
		boolean run = true;
		while (run) {
			System.out.println("|1.계정생성(관리자용) |2.로그인(관리자용) |3.상품 등록하기 |4.상품 삭제 |5.초기화면으로 돌아가기");
			System.out.print(">>>");
			int select = input.nextInt();

			switch (select) {

			case 1:
				System.out.println("관리자용 계정 생성을 진행합니다. ");
				Admin newAdmin = register(input);
				break;

			case 2:
				System.out.println("로그인을 진행하겠습니다. ");
				Admin loginAdmin = loginAdmin(input, admins);
				break;
				
			case 3:
				System.out.println("상품 등록 시스템으로 진입합니다. ");
				Item addAdmin = addItem(input, admins, items);
				break;

			case 4:
				System.out.println("상품 삭제 시스템으로 진입합니다. ");
				Item delAdmin = delItem(input, admins, items);
				break;
				
			case 5:
				System.out.println("초기화면으로 돌아갑니다.");
				run = false;
				break;
			
			default :
				System.out.println("다른 번호를 입력하셨습니다. 1~6번 번호를 선택해주세요");
				
					

			}// 스위치 종료문
		} // while 종료

	}//관리자 전용 메뉴 종료

	private static Item addItem(Scanner input2, Admin[] admins, Item[] items) {
		//관리자 전용 상품 등록 메서드
		Item addItem = new Item();
		System.out.println("등록할 상품의 이름을 입력해주세요");
		addItem.itemName = input.next();
		for(int k=0; k < items.length; k++) {
			if(items[k] == null) {
				System.out.println("상품명 : " + items[k].itemName + "수량 : " + items[k].itemEa + "가격 : "
						+ items[k].itemPrice + "원(개당)" + "번호 : " + items[k].itemNum);
			}//if문 종료
		}//for문 종료
		return addItem;
	}//관리자 전용 상품 등록 메서드 종료

	public static Item delItem(Scanner input2, Admin[] admins, Item[] items) {
		//관리자 전용 상품 삭제 메서드
				Item delItem = new Item();
				System.out.println("삭제할 상품의 이름을 입력해주세요.");
				delItem.itemName = input.next();
				for(int i=0; i < items.length; i++) {
					if(items[i] !=null) {
						if(items[i].itemName.equals(delItem.itemName)) {
							items[i] = null;
							
						}//if문2 종료
					}//if문1 종료
				}//for문 종료
				
		return delItem;
	}//관리자 전용 상품 삭제 메서드 종료

	public static Admin loginAdmin(Scanner input2, Admin[] admins) {
		// 관리자용 계정 로그인 메서드!
		Admin loginAdmin = new Admin(); // 키보드로 로그인 관리자 객체 생성

		System.out.println("아이디를 입력하세요(관리자용)");
		System.out.print("> > >");
		loginAdmin.id = input.next(); // -> 키보드로 입력받은 관리자 id 입력.

		System.out.println("PW를 입력하세요(관리자용)");
		System.out.print("> > >");
		loginAdmin.pw = input.next(); // -> 키보드로 입력받은 관리자 pw 입력.

		for (int i = 0; i < admins.length; i++) {
			if (admins[i] != null) { // 배열에 빈칸이 아니면
				if (admins[i].id.equals(loginAdmin.id) && admins[i].pw.equals(loginAdmin.pw)) { // 배열에 있는 ID와 키보드로 입력한
																								// ID가 같으며, 배열에 있는 PW와
																								// 키보드로 입력한 PW가 같다
					loginAdmin = admins[i];
				} else {
					System.out.println("ID 와 PW를 다시 입력해주세요.");
				}
			} // if문종료
		} // for문 종료
					System.out.println("관리자 계정으로 로그인이 되었습니다.");
					
		return loginAdmin;
	}// 관리자용 계정 로그인 메서드 종료

	public static Admin register(Scanner input2) {
		// 관리자용 계정 생성 메서드
		Admin newAdmin = new Admin();

		System.out.println("생성할 ID를 입력하세요.");
		newAdmin.id = input.next();

		System.out.println("PW를 입력하세요.");
		newAdmin.pw = input.next();

		System.out.println("이메일를 입력하세요.");
		newAdmin.email = input.next();

		System.out.println("본인 핸드폰 번호를 입력하세요.");
		newAdmin.ph = input.nextInt();

		System.out.println("정상적으로 회원가입이 완료되었습니다.");
		return newAdmin;
	}// 관리자용 계정 생성 메서드 종료

}
