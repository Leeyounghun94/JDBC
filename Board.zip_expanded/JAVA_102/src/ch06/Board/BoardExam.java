package ch06.Board;

import java.util.Scanner;

public class BoardExam {
	public static Scanner input = new Scanner(System.in);
	public static Member[] members = new Member[100];
	public static Board[] boards = new Board[1000];

	public static void main(String[] args) {
		// 게시판 만들기
		// 회원, 게시판, 종료

		System.out.println("========== 회원제 게시판 ==========");

		boolean run = true;
		while (run) {
			System.out.println("1.회원 관리 | 2.게시판 관리 | 3.종료");
			System.out.print("원하시는 메뉴를 입력하세요 >>>");
			int mainMenu = input.nextInt();

			switch (mainMenu) {

			case 1:
				System.out.println("회원 관리 메뉴로 진입 합니다.");

				Member.menu(input, members);
				break;
			case 2:
				System.out.println("게시판 관리 메뉴로 진입 합니다.");

				break;
			case 3:
				System.out.println("시스템을 종료 합니다. ");
				run = false;
				break;
			default:
				System.out.println("1~3번까지의 숫자만 입력해주세요 ");
				break;
			} // switch문 종료

		} // while문 종료

	}// 메인 메서드 종료

}// class 종료
