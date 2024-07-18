package chap06.Account;

import java.util.Scanner;

public class BankExam {

	private static Scanner input = new Scanner(System.in);

	private static Account[] accountArrays = new Account[100]; // 계좌 배열 생성 100개
	private static WAccount[] accountArrays1 = new WAccount[100];
	
	// K(W,S) Account[] accountArrays = new Account[100]; -> 앞에 글자 붙여서 여러 은행을 추가 할 수가 있다 .
	
	public static void main(String[] args) {
		// BankExam

			System.out.println("================== ★ LLL 은행에 오신걸 환영합니다. ★ ===================");
		boolean run = true;
		while (run) {
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.고객센터 | 6.종료 ");
			System.out.println("================================================================");
			System.out.print(" > > >");
			int select = input.nextInt();

			switch (select) {

			case 1:
				System.out.println("계좌생성 클래스로 진입합니다.");
				createAccount.create(accountArrays);
				break;

			case 2:
				System.out.println("계좌목록 클래스로 진입합니다.");
				accountList.list(accountArrays, accountArrays1);
				break;

			case 3:
				System.out.println("예금 클래스로 진입합니다.");
				deposit.deposit(accountArrays);
				break;

			case 4:
				System.out.println("출금 클래스로 진입합니다.");
				withdraw.withdraw(accountArrays);
				break;

			case 5:
				System.out.println("고객센터 클래스로 진입합니다.");
				break;

			case 6:
				System.out.println("프로그램 종료 합니다. 이용해 주셔서 감사합니다. ");
				run=false;
				break;

			case 999:
				System.out.println("관리자 전용 클래스 입니다.");
				Admin.adminMenu(input);
				break;

			default:
				System.out.println("1 ~ 6번 번호를 입력해 주십시오.");
			}
			/// 스위치문 종료
		} // 와일문 종료
	}// 메인메서드 종료


}// 클래스종료