package com.jdbc.www;

import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.www.dao.EmpDAO;

public class JDBCExam {

	public static void main(String[] args) throws SQLException {
		// 입력할때마다 하나씩 실행해보기.
		
		
		Scanner input = new Scanner(System.in);
		
		EmpDAO empDao = new EmpDAO(); 
		empDao.selectEmp();
		
		
		System.out.println("이름을 입력해주세요.");
		String name = input.next();
		
		System.out.println("부서를 입력해주세요");
		String dept = input.next();
		
		System.out.println("입사점수를 입력해주세요");
		double score = input.nextDouble();
		
		empDao.insertEmp(name, dept, score);
		empDao.selectEmp();
		
		
		System.out.println("수정할 번호를 입력해주세요");
		int num = input.nextInt();
		
		System.out.println("수정할 이름을 입력하세요");
		String updateName = input.next();
		
		System.out.println("부서를 입력해주세요");
		String updateDept = input.next();
		
		System.out.println("입사점수를 입력해주세요");
		double updateScore = input.nextDouble();
		
		empDao.updateEmp(updateName, updateDept, updateScore, num);
		empDao.selectEmp();
		
		
		System.out.println("삭제할 이름을 입력해주세요");
		String deleteName = input.next();
		
		empDao.deleteEmp(deleteName);
		empDao.selectEmp();
		
	}

}
