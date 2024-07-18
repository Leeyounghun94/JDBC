package com.board.www.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.board.www.dto.MemberDTO;

public class MemberDAO {

	public MemberDAO() {
		
	}// 기본 생성자( 커스텀 생성자가 생성되면 기본 생성자도 만들어 줘야 한다.)
	
	
	public MemberDAO(Connection connection) {
		// TODO Auto-generated constructor stub
	}// 커스텀 생성자



	public void register(Connection connection, MemberDTO joinMemberDTO) {
		
		try {
			String sql = "insert into member (mno,mid, mpw, mdate) values (board_seq.nextval, ?,?,sysdate)";
			//insert into member (mno, mid, mpw, mdate) values (emp_seq.nextval, '이영훈','1234', sysdate );
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, joinMemberDTO.getMid());
			preparedStatement.setString(2, joinMemberDTO.getMpw());
	
			int result = preparedStatement.executeUpdate();

		
			if(result > 0) {
				System.out.println("회원가입이 완료");
			}else {
				System.out.println("다시 확인바람.");
			}
			
		
			preparedStatement.close();
	
			
		} catch (SQLException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
			//e.printStackTrace();
		}
		
		
		
	}
	
	

	public  MemberDTO login(Connection connection, MemberDTO loginMemberDTO) {
		// connection -> main에서 넘어온 jdbc 1,2단계

		MemberDTO loginDTO = new MemberDTO(); //리턴용 빈 객체
		
		
		try {
			String sql = "select * from member where mid=? and mpw=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,loginMemberDTO.getMid()); //서비스에서 받은 id가 ?에 들어감.
			preparedStatement.setString(2,loginMemberDTO.getMpw()); //서비스에서 받은 pw가 다음 ? 에 들어감.

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
			System.out.println("id와 pw가 없습니다. ");
			System.out.println("sql 확인하시길 바랍니다.");
			System.out.println("다시 한번 확인 해주세요.");
			//e.printStackTrace();
		}
		return loginDTO;

	}

	public MemberDTO update(Connection connection, MemberDTO modify, MemberDTO loginMember) {
		
		
			try {
				String sql = "update member set mid = ? where mid = ?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);	
				System.out.println(modify.getMid());
				System.out.println(loginMember.getMid());
				preparedStatement.setString(1, modify.getMid());
				preparedStatement.setString(2, loginMember.getMid());
				
				int result = preparedStatement.executeUpdate();
				
				
				if(result > 0) {
					System.out.println(result + " 행이 바뀌었습니다.");
					loginMember.setMid(modify.getMid());
					
				}else {
					System.out.println("변경 실패");
				}
				
				preparedStatement.close();
				
				
			} catch (SQLException e) {
				System.out.println("회원 정보를 찾을 수 없습니다.");
				System.out.println("sql 확인해주시길 바랍니다.");
				//e.printStackTrace();
			}
			return loginMember;
	
	}

	public void delete(Connection connection, MemberDTO loginMemberDTO) {
		
		String sql = "delete from member where mid=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginMemberDTO.getMid());
			int result = preparedStatement.executeUpdate();
			
			if( result > 0) {
				System.out.println(result + "삭제되었습니다.");
				
			}else{
				System.out.println("삭제 실패");
			}
					
			preparedStatement.close();
			
			
		} catch (SQLException e) {
			System.out.println("sql문 확인 바람.");
			//e.printStackTrace();
		}
		
		
		

	}

}
