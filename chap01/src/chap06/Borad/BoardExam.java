package chap06.Borad;

import java.util.Scanner;

public class BoardExam {

	public static Scanner input = new Scanner(System.in);
	public static Member[] members = new Member[100];
	public static Board[] boards = new Board[1000];
//public static Member loginMember; -> 로그인한 정보 유지용
	

	public static void main(String[] args) {
		// 게시판을 구현해보는 실습을 복습//
		// 객체 2개 (Member, Board)
		// 회원용 게시판 구현

		System.out.println("==============회원제 게시판==============");
		boolean run = true;
		while (run) {
			System.out.println("1.회원관리 | 2.게시판 | 3.종료");
			System.out.print("> > >");
			int select = input.nextInt();

			switch (select) {

			case 1:
				System.out.println("회원관리 클래스로 진입합니다.");
				Member.menu(input, members); 
				break;

			case 2:
				System.out.println("게시판 클래스로 진입합니다.");
				
				break;

			case 3:
				System.out.println("시스템 종료 합니다. 이용해 주셔서 감사합니다.");
				run = false;
				break;

			default:
				System.out.println("1 ~ 3번만 선택해주세요.");

			}// 스위치문 종료
		} // while문 종료
	}// 메인 메서드 종료

}// 클래스 종료
