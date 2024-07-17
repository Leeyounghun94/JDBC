package com.jdbc.www.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	// DAO라는 것은 데이터베이스에 접속하는 SQL쿼리용 코드.

	public void selectEmp() throws SQLException {

		Connection connection = null; // 연결하는 객체
		PreparedStatement preparedStatement = null; // 쿼리문을 처리하는 객체(신형)
		ResultSet resultSet = null;
		//int result = 0; // update, delete, create 결과가 정수로 표현( 1행 처리 완료)

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	//1.드라이버 Class 불러오기(고정)
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MBCUSER", "1234");	//2.connect 객체 만들기(고정)
			
			String sql = "select * from emp order by num asc";	//3단계 (쿼리문 작성 준비)
			preparedStatement = connection.prepareStatement(sql);
			
			resultSet = preparedStatement.executeQuery();//4단계( 쿼리 실행 후 결과를 표로 만든다.)
			
			System.out.println("사원번호　　　　이름　　　　부서　　　　입사점수　　　　");
			System.out.println("---------------------------------------");
			
			while (resultSet.next()) {
				
			System.out.print(resultSet.getInt("num") + "\t");
			System.out.print(resultSet.getString("name") + "\t");// 이름은 문자니까 겟 스트링
			System.out.print(resultSet.getString("dept") + "\t");// 부서도 문자니까 겟 스트링
			System.out.println(resultSet.getDouble("score") + "\t"); // 점수는 소수점 나오니까 겟 더블
			}
			
		} catch (ClassNotFoundException e) {// (고정)
			System.out.println("드라이버를 찾을 수 없습니다.");
//			e.printStackTrace();
		} catch (SQLException e) {// (고정)
			System.out.println("connection 정보가 다릅니다. URL, ID, PW 를 확인하세요.");
			
		} finally { // finally은 선언한 순서 반대로 close() 해줘야 한다.
			resultSet.close();
			preparedStatement.close();
			connection.close();
		}

		

	}//selectEMP 종료
	
	public void insertEmp(String name, String dept, double score) throws SQLException {

		Connection connection = null; // 연결하는 객체
		PreparedStatement preparedStatement = null; // 쿼리문을 처리하는 객체(신형)
		ResultSet resultSet = null;
		//int result = 0; // update, delete, create 결과가 정수로 표현( 1행 처리 완료)

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	//1.드라이버 Class 불러오기
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MBCUSER", "1234");	//2.connect 객체 만들기
			
			String sql = "insert into emp(num, name, dept, score) values ( emp_seq.nextval, ?, ?, ?)";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, dept);
			preparedStatement.setDouble(3, score);
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet != null) {
				System.out.println(resultSet + "행의 데이터를 추가 했습니다. \n");
				connection.commit();
			}else {
				System.out.println("결과 : " + resultSet + " 입니다. ");
				System.out.println("입력 실패, 롤백 됩니다.");
				connection.rollback();
				
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
//			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("connection 정보가 다릅니다. URL, ID, PW 를 확인하세요.");
			
		} finally {
			resultSet.close();
			preparedStatement.close();
			connection.close();
		}

		

	}//insertEmp 종료
	
	
	public void updateEmp(String name, String dept, double score, int num) throws SQLException {

		Connection connection = null; // 연결하는 객체
		PreparedStatement preparedStatement = null; // 쿼리문을 처리하는 객체(신형)
		ResultSet resultSet = null;
		//int result = 0; // update, delete, create 결과가 정수로 표현( 1행 처리 완료)

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	//1.드라이버 Class 불러오기
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MBCUSER", "1234");	//2.connect 객체 만들기
			
			String sql = "update emp set name=?, dept=?, score=? where num=? "; 
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, dept);
			preparedStatement.setDouble(3, score);
			preparedStatement.setInt(4, num);
			
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet != null) {
				System.out.println(resultSet + "행의 데이터를 수정 했습니다. \n");
				connection.commit();
			}else {
				System.out.println("결과 : " + resultSet + " 입니다. ");
				System.out.println("입력 실패, 찾는 값이 없습니다.");
				connection.rollback();
				
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
//			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("connection 정보가 다릅니다. URL, ID, PW 를 확인하세요.");
			
		} finally {
			resultSet.close();
			preparedStatement.close();
			connection.close();
		}

		

	}//updateEmp 종료
	
	public void deleteEmp(String name) throws SQLException {

		Connection connection = null; // 연결하는 객체
		PreparedStatement preparedStatement = null; // 쿼리문을 처리하는 객체(신형)
		ResultSet resultSet = null;
		//int result = 0; // update, delete, create 결과가 정수로 표현( 1행 처리 완료)

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	//1.드라이버 Class 불러오기
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MBCUSER", "1234");	//2.connect 객체 만들기
			
			String sql = "delete from emp where name=? ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet != null) {
				System.out.println(resultSet + "행의 데이터를 삭제 했습니다. \n");
				connection.commit();
			}else {
				System.out.println("결과 : " + resultSet + " 입니다. ");
				System.out.println("삭제 실패, 삭제할 값이 없습니다. ");
				connection.rollback();
				
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
//			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("connection 정보가 다릅니다. URL, ID, PW 를 확인하세요.");
			
		} finally {
			resultSet.close();
			preparedStatement.close();
			connection.close();
		}

		

	}//deleteEmp 종료
	
	
	
	
}
