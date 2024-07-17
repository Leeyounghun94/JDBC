package com.jdbc.www.service;

import java.sql.Connection;
import java.util.Scanner;
import com.jdbc.www.dao.MemberDAO;
import com.jdbc.www.dto.MemberDTO;

public class MemberService {

	public MemberDTO memberMenu(Scanner scanner, MemberDTO loginMember, Connection connection) {
		System.out.println("회원관리용 서비스로 진입");
		boolean memberRun = true;
		
		while (memberRun) {
			System.out.println("1.회원과입  2.로그인  3.회원수정  4.회원정보 삭제  5.종료");
			System.out.print(">>>");
			int memberSelect = scanner.nextInt();
			switch (memberSelect) {

			case 1:
				join(scanner, connection);
				break;

			case 2:
				login(scanner, loginMember, connection);
				break;

			case 3:
				modify();
				break;

			case 4:
				delete();
				break;

			case 5:
				System.out.println(" 종료 ");
			}//스위치 종료문
		}
		return loginMember;
	
	}//memberMenu 종료

	private void delete() {
		// TODO Auto-generated method stub
		
	}

	private void modify() {
		// TODO Auto-generated method stub
		
	}

	public MemberDTO login(Scanner scanner, MemberDTO loginMember, Connection connection) {
		System.out.println("로그인 메서드로 진입");
		System.out.println();
		System.out.println("id : ");
		String loginId = scanner.next();
		
		System.out.println("pw : ");
		String loginPw = scanner.next();
		
		MemberDTO loginMemberDTO = new MemberDTO(loginId,loginPw);
		
		MemberDAO memberDAO = new MemberDAO(connection);
		return memberDAO.login(connection,loginMemberDTO);
		
	}

	private void join(Scanner scanner, Connection connection) {
		System.out.println("회원가입 메서드로 진입");
		System.out.println();
		System.out.println("아이디를 입력해 주세요");
		String joinId = scanner.next();
		
		System.out.println("비밀번호를 입력해 주세요(10글자 이내)");
		String joinPw = scanner.next();
		MemberDTO joinMemberDTO = new MemberDTO(joinId, joinPw);
		
		MemberDAO memberDAO = new MemberDAO(connection);


		
	}// Join() 종료
}
