package ch06.Board;

import java.util.Date;
import java.util.Scanner;

public class Board {
	// 필드
	int bno; // 게시물 번호
	String title; // 게시물 제목
	String content; // 내용
	String nickName; // 별명(작성자)
	Date regDate; // 작성일

	public Board regBoard(Scanner input, Board[] boards) {
		Board regBoard = new Board();
		System.out.println("게시물 제목을 입력하세요.");
		regBoard.title = input.next();
		System.out.println("게시물 내용을 입력하세요.");
		regBoard.content = input.next();
		System.out.println("작성자를 입력하세요.");
		regBoard.nickName = input.next();
		// 날짜 구현 예정
		return regBoard;
	}// end regBoard

	public Board editBoard2(Scanner input, Board[] boards) {
		Board editBoard2 = new Board();
		System.out.println("수정할 게시물의 제목을 입력하세요.");
		editBoard2.title = input.next();
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				if (boards[i].title.equals(editBoard2.title)) {
					System.out.println("수정할 내용을 입력해 주세요.");
					System.out.print(">>>");
					editBoard2.content = input.next();
					boards[i].content = editBoard2.content;
				} // end if
			} // end if
		} // end for
		return editBoard2;
	}// end editBoard2

	public Board delBoard2(Scanner input, Board[] boards) {
		Board delBoard2 = new Board();
		System.out.println("삭제할 게시물의 제목을 입력하세요.");
		System.out.print(">>>");
		delBoard2.title = input.next();
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				if (boards[i].title.equals(delBoard2.title)) {
					boards[i] = null;
				}
				break;
			} else {
				System.out.println("다시 입력해 주세요.");
				break;
			} // end if
		} // end for
		return delBoard2;
	}// end delBoard2

	public void menuBoard(Scanner input, Board[] boards) {
		System.out.println("■ 게시판 메뉴 입니다. ■");
		boolean run = true;
		while (run) {
			System.out.println("|1.게시물 작성|2.게시물 내용 수정|3.게시물 확인|4.게시물 삭제|5.종료|");
			int select = input.nextInt();
			switch (select) {
			case 1:
				System.out.println("게시물을 작성합니다.");
				Board newBoard = regBoard(input, boards);
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) {
						boards[i] = newBoard;
						System.out.println("*" + newBoard.title + "* - 게시글이 작성되었습니다.");
						break;
					} // end if
				} // end for
				break;
			case 2:
				System.out.println("게시물 내용을 수정 합니다.");
				Board editBoard1 = editBoard2(input, boards);
				System.out.println(editBoard1.title + "게시물의 내용이 수정이 완료 되었습니다.");
				break;
			case 3:
				System.out.println("게시물을 확인 합니다.");
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.println("게시글 번호 :" + boards[i].bno);
						System.out.println("작성자:" + boards[i].title);
						System.out.println("내용:" + boards[i].content);
						System.out.println("작성자:" + boards[i].nickName);
						break;
					} else {
						System.out.println("작성된 게시글이 없습니다.");
						break;
					} // end if
				} // end for
				break;
			case 4:
				System.out.println("게시물을 삭제 합니다.");
				Board delBoard1 = delBoard2(input, boards);
				for(int i=0; i<boards.length; i++) {
					if(boards[i] != null) {
						System.out.println("게시글 :" + delBoard1.title + "은(는) 삭제되었습니다.");
						break;
					}//end if
				}// end for
				break;
			case 5:
				System.out.println("게시물 작성을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("명령어 범위에서만 입력해 주세요.");

			}// switch
		} // end while
	}// end menuBoard

}// end class
