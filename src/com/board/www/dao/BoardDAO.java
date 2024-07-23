package com.board.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.board.www.dto.BoardDTO;

public class BoardDAO {
	// 데이터베이스 처리용 C R U D

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
			e.printStackTrace();
		} 
		
	}
}
