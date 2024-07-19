package com.board.www.service;

import java.sql.Connection;
import java.util.Scanner;

import com.board.www.dao.MemberDAO;
import com.board.www.dto.MemberDTO;

public class MemberService {

	public MemberDTO memberMenu(Scanner scanner, MemberDTO loginMember, Connection connection) {
		System.out.println("회원관리용 서비스로 진입");
		boolean memberRun = true;
		
		while (memberRun) {
			System.out.println("1.회원가입  2.로그인  3.회원수정  4.회원정보 삭제  5.메인화면 돌아가기");
			System.out.print(">>>");
			int memberSelect = scanner.nextInt();
			switch (memberSelect) {

			case 1:
				join(scanner, connection);
				break;

			case 2:
				loginMember = login(scanner, loginMember, connection);
				break;

			case 3:
				loginMember = modify(scanner, connection, loginMember);
				break;

			case 4:
				delete(scanner, connection);
				break;

			case 5:
				System.out.println(" 메인화면으로 돌아갑니다. ");
				memberRun = false;
			}//스위치 종료문
		}
		return loginMember;
	
	}//memberMenu 종료

	private void delete(Scanner scanner, Connection connection) {
		System.out.println("회원탈퇴 메서드 진입");
		System.out.println();
		System.out.println("삭제할 id를 입력해주세요");
		System.out.print(">>>");
		String deleteId = scanner.next();
		
		MemberDTO delete = new MemberDTO();
		delete.setMid(deleteId);
		
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.delete(connection, delete);
		
	}

	private MemberDTO modify(Scanner scanner, Connection connection, MemberDTO loginMember) {
		System.out.println("회원정보수정 메서드 진입");
		System.out.println();
		System.out.println("수정할 id를 입력해주세요");
		System.out.print(">>>");
		String modifyId = scanner.next();
		
		MemberDTO modify = new MemberDTO();
		modify.setMid(modifyId);
		MemberDAO memberDAO = new MemberDAO();
		
		loginMember = memberDAO.update(connection, modify, loginMember);
		
		return loginMember;
		
		
	}

	public MemberDTO login(Scanner scanner, MemberDTO loginMember, Connection connection) {
		System.out.println("로그인 메서드로 진입");
		System.out.println();
		System.out.println("id : ");
		String loginId = scanner.next();
		
		System.out.println("pw : ");
		String loginPw = scanner.next();
		
		MemberDTO loginMemberDTO = new MemberDTO(loginId,loginPw);
		
		MemberDAO memberDAO = new MemberDAO();
		loginMember = memberDAO.login(connection,loginMemberDTO, loginMember);
		System.out.println(loginMember.getMid());
		
		return loginMember;
		
	}

	private void join(Scanner scanner, Connection connection) {
		System.out.println("회원가입 메서드로 진입");
		System.out.println();
		System.out.println("아이디를 입력해 주세요");
		String joinId = scanner.next();
		
		System.out.println("비밀번호를 입력해 주세요(10글자 이내)");
		String joinPw = scanner.next();
		MemberDTO joinMemberDTO = new MemberDTO(joinId, joinPw);
		
		MemberDAO memberDAO = new MemberDAO();
		
		memberDAO.register(connection, joinMemberDTO);

		System.out.println("회원가입이 완료 되었습니다.");
		System.out.println(joinId + "님 대나무숲의 가족이 되신걸 환영합니다." );

		
	}// Join() 종료
}
