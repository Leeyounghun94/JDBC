package chap08.WebBoard;

import java.util.Scanner;

import chap08.WebBoard.DTO.BoardDTO;
import chap08.WebBoard.DTO.FoodBoardDTO;
import chap08.WebBoard.DTO.Member;
import chap08.WebBoard.DTO.fileBoardDTO;
import chap08.WebBoard.Service.FileBoardService;
import chap08.WebBoard.Service.FoodBoardService;
import chap08.WebBoard.Service.LoginService;
import chap08.WebBoard.Service.PictureService;
import chap08.WebBoard.Service.RegisterService;

public class WebBoardExam {

	public static Scanner scanner = new Scanner(System.in);

	public static RegisterService[] registers = new RegisterService[100]; // 회원가입 배열 100개 생성
	public static Member[] members = new Member[100];

	public static BoardDTO[] boards = new BoardDTO[100];
	public static FoodBoardDTO[] foods = new FoodBoardDTO[1000];
	public static fileBoardDTO[] FileDTOs = new fileBoardDTO[1000];
// static Pi
	
	//fileBoardDTO FileDTOs
	public static void main(String[] args) {
		// WebBoard게시판 을 구현해 봅시다.
		Member member = new Member();
		System.out.println("♠♤♠♤♠♤♠♤ W e b B o a r d System ♠♤♠♤♠♤♠♤♠♤♠♤");
		
		boolean run = true;
		while (run) {
			System.out.println("1.로그인 |2.파일게시판 |3.음식게시판  |4.아이템게시판  |5.사진게시판 |6.종료");
			System.out.print(">>>");
			int select = scanner.nextInt();

			switch (select) {

			case 1:
				System.out.println("로그인을 진행합니다.");
				member.loginMember=LoginService.Loginmenu(scanner, registers, members);
				

				break;

			case 2:
				System.out.println("파일 게시판으로 이동합니다.");
				FileBoardService.fileBoard(scanner,FileDTOs);
				break;

			case 3:
				System.out.println("음식 게시판으로 이동합니다.");
				FoodBoardService.foodBoard(scanner,foods,member.loginMember);

				break;

			case 4:
				System.out.println("아이템 게시판으로 이동합니다.");
				break;

			case 5:
				System.out.println("사진 게시판으로 이동합니다.");
				PictureService.pictureBoard();
				break;

			case 6:
				System.out.println("시스템을 종료 합니다.");
				run = false;
				break;

			default:
				System.out.println("1 ~ 6 값만 입력해 주세요");
			}// 스위치문 종료
		} // 와일문 종료
	}// 메인메서드 종료
}// 클래스 종료
