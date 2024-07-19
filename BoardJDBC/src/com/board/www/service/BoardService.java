package com.board.www.service;

import java.sql.Connection;
import java.util.Scanner;

import com.board.www.dao.BoardDAO;
import com.board.www.dto.BoardDTO;
import com.board.www.dto.MemberDTO;

public class BoardService {
	// Board의 부 메뉴( C, R, U, D, List메뉴)
	
	/*
	 * C = 게시물 작성하기 (writer)
	 * R = 
	 * U = 게시물 수정하기 (udboard)
	 * D = 게시물 삭제하기 (delBoard)
	 * 
	 * 대나무 숲 게시판 메뉴 만들어서 1.게시물 작성하기 2.게시물 보기 3.게시물 수정하기 4.게시물 삭제하기 
	 * 
	 */	
	
	public void boardMenu(Scanner scanner,Connection  connection, MemberDTO loginMember) {
		BoardDAO boardDAO = new BoardDAO();
		boolean run = true;
		while (run) {
			System.out.println("1. 게시글 작성하기");
			System.out.println("2. 게시글 보기");
			System.out.println("3. 게시글 수정하기");
			System.out.println("4. 게시글 삭제하기");
			System.out.println("5. 종료");
			int select = scanner.nextInt();
			switch (select) {

			case 1:
				System.out.println("작성 메서드 진입");
				BoardDTO boardDTO = new BoardDTO();
				System.out.println("작성할 제목과 내용을 입력해주세요");
				System.out.print(">>>");
				boardDTO.setBtitle(scanner.next());
				System.out.print(">>>");
				boardDTO.setBcontent(scanner.next());
				boardDTO.setBwriter(loginMember.getMid());

				boardDAO.writer(connection, scanner, boardDTO);
				break;

			case 2:
				System.out.println("보기 메서드 진입");
				boardDAO.list(connection);

				break;
			case 3:
				System.out.println("수정 메서드 진입");
				boardDAO.modify(scanner, connection, loginMember);
				break;

			case 4:
				System.out.println("삭제 메서드 진입");
				boardDAO.delete(scanner, connection, loginMember);
				break;

			case 5:
				System.out.println("종료");
				run = false;
				break;

			default:
				System.out.println("1 ~ 5번만 입력해주세요");

			}
		}
	}
	
	
	
	public void list(Connection connection) {//게시물 목록 보기
		
		
		BoardDAO boardDAO = new BoardDAO();
		
		System.out.println("================================================");
		System.out.println("================ 대나무 숲 게시판 ==================");
		System.out.println("[게시물 목록]");
		System.out.println("-------------------------------------------------");
		System.out.println("no       title       writer       date ");
		System.out.println("-------------------------------------------------");

		boardDAO.list(connection);

	}

}
