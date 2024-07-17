package chap06.Borad;

import java.util.Date;
import java.util.Scanner;

public class Board {	//보드 객체용
	
	
	//필드
	
	int bno; // 게시물 번호
	String title; // 게시물 제목
	String content; // 내용
	String nickName; // 닉네임(작성자) -> 주 요인이 멤버이기때문에 멤버클래스에 있는 닉네임과 같게 해야 한다.
	Date regDate; // 글 작성한 일자
	// ㄴ Date(alt + space) 하면 sql = jdbc에서 사용/ 여기서는 util 사용				


	

public void menuboard(Scanner input, Board[] boards) {
			System.out.println("♣♧ 게시판 메뉴로 진입하셨습니다.♧♣");
			
			
			System.out.println("================게시판 관리 프로그램================ ");
			System.out.println("1.게시물 작성하기 \t.2.게시물 수정하기");
			System.out.println("3.게시물 확인하기 \t.4.게시글 삭제하기");
			System.out.println("5.기타 문의 \t.6.종료");
			int select = input.nextInt();
			
			switch (select) {
				case 1 :
					System.out.println("게시물 작성합니다.");
					Board newBoard = regBoard(input, boards);
					for(int i = 0; i < boards.length; i++ ) {
						if(boards[i] == null) {
							boards[i] = newBoard;
							System.out.println(newBoard.title + " 게시물이 작성 되었습니다.");
							break;
						}//if문 종료
					}//for문 종료
					
				case 2 :
					System.out.println("게시물 수정합니다.");
					Board changeBoard = changeBoard2(input, boards);
					
					System.out.println(changeBoard.title + " 수정이 완료 되었습니다.");
					
				case 3 :
					System.out.println("게시글 확인합니다.");
					for(int i=0; i < boards.length; i++) {
						if(boards[i] != null) {
							System.out.println("게시물 번호 : " + boards[i].bno);
							System.out.println("게시물 제목 : " + boards[i].title);
							System.out.println("게시물 내용 : " + boards[i].content);
							System.out.println("게시물 작성자 : " + boards[i].nickName);
							break;
						}else {
							System.out.println(" 작성된 글이 없습니다 ! ");
							break;
							
						}//if문 종료
					}//for문 종료
					
				case 4 :
					System.out.println("게시글을 삭제 합니다.");
					Board deleteBoard = deleteBoard2(input, boards);
					for(int i=0; i < boards.length; i++) {
						if(boards[i] !=null) {
							System.out.println(" 게시글 : " + deleteBoard.title + "이 삭제되었습니다.");
							break;
						}//if문 종료
					}//for문 종료
					
				case 5 :
					System.out.println("기타 문의");
					System.out.println("게시판 프로그램 문의 할 사항이 있으면 관리자에게 연락 바랍니다.");
					
				case 6 :
					System.out.println("프로그램을 종료합니다.");
					System.out.println("이용해 주셔서 감사합니다.");
					
				default :
					System.out.println("1 ~ 6번 번호내에서만 입력해 주세요");
					
			}//게시판 메뉴 - 스위치 종료
			
		}
	public Board deleteBoard2(Scanner input, Board[] boards) {
		Board deleteBoard2 = new Board();
		System.out.println("삭제할 게시물의 제목을 입력하세요");
		System.out.print("> > >");
		deleteBoard2.title = input.next();
		for(int i = 0; i < boards.length; i++) {
			if(boards[i] !=null) {
				if(boards[i].title.equals(deleteBoard2.title)) {
					boards[i] = null;
				}
				break;
			} else {
				
				System.out.println("다시 입력해 주세요");
				break;
				
			}//if문 종료
		}//for문 종료
		return deleteBoard2;
	}// 게시물 삭제 메서드 종료
	
	public Board changeBoard2(Scanner input, Board[] boards) {
		Board changeBoard2 = new Board();
		System.out.println("수정할 게시물의 제목을 입력하세요");
		System.out.print("> > >");
		changeBoard2.title = input.next();
		
		for(int i = 0; i < boards.length; i++ ) {
			if(boards[i] == null) {
				if(boards[i].title.equals(changeBoard2.title)) {
					System.out.println("수정할 게시물의 내용을 입력하세요");
					System.out.print("> > >");
					changeBoard2.content = input.next();
					boards[i].content = changeBoard2.content;
				}//if문 종료
			}//if문 종료
		}//for문종료
		return changeBoard2;
	}// 게시글 수정 메서드 종료
	
	
	public Board regBoard(Scanner input, Board[] boards) {
		Board regBoard = new Board();
		
		System.out.println("게시물 제목을 입력하세요");
		regBoard.title = input.next();
		
		System.out.println("게시물 내용을 입력하세요");
		regBoard.content = input.next();
		
		System.out.println("작성자를 입력하세요");
		regBoard.nickName = input.next();
		
		System.out.println("작성일자를 입력하세요");
		//regBoard.regDate = input. -< ?
		return regBoard;
		
	}// 게시물 작성 메서드 종료

	
	
	}
	
	
	
	
	
	
	
	
	
