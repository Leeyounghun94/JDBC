package com.board.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.board.www.dto.BoardDTO;
import com.board.www.dto.MemberDTO;

public class BoardDAO {
	// 데이터베이스 처리용 C R U D
	
	/*
	 * insert into ? values ? ; -> 게시물 작성(제목, 내용)
	 * update ? set ? where ? ; -> 게시물 수정하기.
	 *  
	 * delete from ? where ? and ? ; -> 게시물 삭제.
	 * 
	 */
	public void writer(Connection connection, Scanner scanner, BoardDTO boardDTO) {

		try {
			String sql = "insert into board (bno, btitle, bcontent, bwriter, bdate) values (board_seq.nextval, ?, ?, ?, sysdate)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, boardDTO.getBtitle());
			preparedStatement.setString(2, boardDTO.getBcontent());
			preparedStatement.setString(3, boardDTO.getBwriter());
			
			int result = preparedStatement.executeUpdate();
			System.out.println(result);
			
			if (result > 0) {
				System.out.println(result + "행이 추가 되었습니다. ");
				
			}else {
				System.out.println("쿼리문 확인 바람.");
				
				
			}
			
		} catch (SQLException e) {
			System.out.println("입력 실패");
			System.out.println(boardDTO.getBtitle());
			System.out.println(boardDTO.getBcontent());
			System.out.println(boardDTO.getBwriter());
			
	
			//e.printStackTrace();
		}
		
		
	}
	
	
	public void list(Connection connection) {
		
		
//		BoardDTO boardDTO = null;
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from board order by bno desc";
			//보드 테이블에 있는 번호, 제목, 내용, 작성자, 작성일자 를 가져온다.
			PreparedStatement preparedStatement = connection.prepareStatement(sql); // 3단계
			ResultSet resultSet = preparedStatement.executeQuery(); // 4단계
//			boardDTO = new BoardDTO();
			
			while(resultSet.next()) {// 표 형식으로 리턴된 값 유무 판단.
				
				System.out.print(resultSet.getInt("bno") + "\t");
				System.out.print(resultSet.getString("btitle") + "\t");
//				System.out.print(resultSet.getString("bcontent") + "\t");
				System.out.print(resultSet.getString("bwriter") + "\t");
				System.out.println(resultSet.getDate("bdate") + "\t");
				
				/*
				 * boardDTO.setBno(resultSet.getInt("bno"));
				 * boardDTO.setBtitle(resultSet.getString("btitle"));
				 * boardDTO.setBcontent(resultSet.getString("bcontent"));
				 * boardDTO.setBwriter(resultSet.getString("bwriter"));
				 * boardDTO.setBdate(resultSet.getDate("bdate"));
				 */	
			}
			// 5단계
			resultSet.close();
			preparedStatement.close();
//			connection.close(); 계속 연결해야 되기 때문에 이것은 안한다.
			
		} catch (SQLException e) {
			System.out.println("BoardDAO.list() sql문 오류");
			//e.printStackTrace();
		} 
		
	}


	public void modify(Scanner scanner, Connection connection, MemberDTO loginMember) {
		// 로그인한 계정으로 제목이랑 내용 수정할래
		// 로그인한 정보랑 글쓴이랑 같을때 수정이 가능한다.
		// 내가 쓴 글중에 
		modifyList(loginMember, connection);// 내가 쓴 글 출력.
		BoardDTO boardDTO = new BoardDTO();
		boardDTO = modifyInput(scanner, boardDTO); //입력 정보 모아둔곳
		
		try {
			String sql = "update board set btitle =? , bcontent=? where bwriter=? and bno=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, boardDTO.getBtitle());
			preparedStatement.setString(2, boardDTO.getBcontent());
			preparedStatement.setString(3, loginMember.getMid());
			preparedStatement.setInt(4, boardDTO.getBno());
			
			
			
			int result = preparedStatement.executeUpdate();
			
			if(result > 0) {
				System.out.println("수정 되었습니다.");
			}else {
				System.out.println("수정 실패");
			}
			
			preparedStatement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}


	private BoardDTO modifyInput(Scanner scanner, BoardDTO boardDTO) {
		// TODO Auto-generated method stub

		System.out.println("수정하실 글의 번호를 입력해주세요");
		System.out.print(">>>");
		int bno = scanner.nextInt();
		
		System.out.println("수정하실 제목을 입력해주세요");
		System.out.print(">>>");
		String btitle = scanner.next();
		
		System.out.println("수정할 내용을 입력해주세요");
		System.out.print(">>>");
		String bcontent = scanner.next();
		
		
		boardDTO.setBno(bno);
		boardDTO.setBtitle(btitle);
		boardDTO.setBcontent(bcontent);
		return boardDTO;
	}


	private void modifyList(MemberDTO loginMember, Connection connection) {
		// 로그인한 상태에서 본인의 게시글 보기.
		
		
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from board where bwriter=?";
			//보드 테이블에 있는 번호, 제목, 내용, 작성자, 작성일자 를 가져온다.
			PreparedStatement preparedStatement = connection.prepareStatement(sql); // 3단계
			preparedStatement.setString(1, loginMember.getMid());
			
			ResultSet resultSet = preparedStatement.executeQuery(); // 4단계
//			boardDTO = new BoardDTO();
			
			while(resultSet.next()) {// 표 형식으로 리턴된 값 유무 판단.
				
				System.out.print(resultSet.getInt("bno") + "\t");
				System.out.print(resultSet.getString("btitle") + "\t");
				System.out.print(resultSet.getString("bcontent") + "\t");
				System.out.print(resultSet.getString("bwriter") + "\t");
				System.out.println(resultSet.getDate("bdate") + "\t");
				
				
			}
			// 5단계
			resultSet.close();
			preparedStatement.close();
//			connection.close(); 계속 연결해야 되기 때문에 이것은 안한다.
			
		} catch (SQLException e) {
			System.out.println("BoardDAO.list() sql문 오류");
			//e.printStackTrace();
		} 
		
	}


	public void delete(Scanner scanner, Connection connection, MemberDTO loginMember) {
		
		
		modifyList(loginMember, connection);
		
		System.out.println("삭제할 글의 번호를 입력해주세요");
		System.out.print(">>>");
		int bno = scanner.nextInt();
		
		try {
			String sql = "delete from board where bno=? and bwriter=?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, bno);
			preparedStatement.setString(2, loginMember.getMid());
			
			int result = preparedStatement.executeUpdate();
			
			if(result > 0) {
				System.out.println(" 삭제 되었습니다.");
				
			}else {
				System.out.println("삭제 실패.");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		
		
	}


	
}
