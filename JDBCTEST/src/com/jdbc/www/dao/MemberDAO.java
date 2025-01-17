package com.jdbc.www.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jdbc.www.dto.MemberDTO;

public class MemberDAO {

	public MemberDAO() {
		
	}// 기본 생성자( 커스텀 생성자가 생성되면 기본 생성자도 만들어 줘야 한다.)
	
	
	public MemberDAO(Connection connection) {
		// TODO Auto-generated constructor stub
	}// 커스텀 생성자



	public void register(Connection connection) {
		
		
		MemberDTO joinMemberDTO = new MemberDTO();
		
		try {
			String sql = "insert into mno, mid, mpw from Member order by mno desc";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
		
		
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("mno"));
				System.out.println(resultSet.getString("mid"));
				System.out.println(resultSet.getString("mpw"));
			}
			
			resultSet.close();
			preparedStatement.close();
			
			

			
			
		} catch (SQLException e) {
			System.out.println("MemberDAO 오류");
			e.printStackTrace();
		}
		
		
		
	}
	
	

	public  MemberDTO login(Connection connection, MemberDTO loginMemberDTO) {
		// connection -> main에서 넘어온 jdbc 1,2단계

		MemberDTO loginDTO = new MemberDTO();
		
		
		try {
			String sql = "select mno, mid, mpw, mdate from member where min=? and mpw?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,loginDTO.getMid()); //서비스에서 받은 id가 ?에 들어감.
			preparedStatement.setString(2,loginDTO.getMpw()); //서비스에서 받은 pw가 다음 ? 에 들어감.

			ResultSet resultSet = preparedStatement.executeQuery(); //위에서 만든 쿼리문 실행하고 결과를 resultSet 표로 받는다.

			while (resultSet.next()) {
				loginDTO.setMno(resultSet.getInt("mno"));
				loginDTO.setMid(resultSet.getString("mid"));
				loginDTO.setMpw(resultSet.getString("mpw"));
				loginDTO.setMdate(resultSet.getDate("mdate"));
				// resultSet 표에 있는 정보를 MemberDTO 객체에 넣는다.

			}

			resultSet.close();
			preparedStatement.close();

		} catch (SQLException e) {
			System.out.println(" 계정이 없는데요 ?");
			System.out.println(" 관리자야 sql 확인좀 해봐라");
			System.out.println(" 회원님 맞을래요 ?");
			e.printStackTrace();
		}
		return loginDTO;

	}

	public void update() {

	}

	public void delete() {

	}

}
