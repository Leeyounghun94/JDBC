package com.board.www.service;

import java.sql.Connection;

import com.board.www.dao.BoardDAO;

public class BoardService {
	// Board의 부 메뉴( C, R, U, D, List메뉴)
	
	
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
