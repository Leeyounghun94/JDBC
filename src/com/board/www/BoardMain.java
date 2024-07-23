package com.board.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.board.www.dao.BoardDAO;
import com.board.www.dto.MemberDTO;
import com.board.www.sevice.BoardService;
import com.board.www.sevice.MemberService;

public class BoardMain {

	// 필드
	public static Scanner scanner = new Scanner(System.in);
//	public static BoardDAO boardDAO = new BoardDAO(); // JDBC 담당.
	public static Connection connection = null;
	public static MemberDTO loginMember = null; //로그인 후 객체

	// 생성자
	public BoardMain() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1단계(드라이버 명 필요)
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.111.103:1521:orcl", "boardtest",
					"boardtest"); // 2단계( url, id, pw 필요)

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버명 또는 Ojdbc6.jar를 확인해주세요.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("url, id, pw나 쿼리문이 잘못됨"); // 쿼리문에 오타 있으면 여기서 오류 처리 난다.
			e.printStackTrace();
			System.exit(0); // 프로세스 강제 종료.
		}

	}

	// 메서드
	public static void main(String[] args) {
		// 기본적인 설정 : 스캐너, JDBC 연동, 주메뉴

		BoardMain boardMain = new BoardMain(); // 생성자 호출(생성자 호출하면서 드라이버를 연결한다.) -> 1단계, 2단계 실행

		boolean run = true;
		System.out.println(" MBC 아카데미 대나무숲에 오신걸 환영합니다. ");

		while (run) {
			System.out.println("1. 회원  |  2.게시판  |  3.종료   ");
			System.out.print(">>>");
			int select = scanner.nextInt();

			switch (select) {

			case 1:
				System.out.println("회원용 서비스로 진입합니다.");
				MemberService memberService = new MemberService();
				loginMember = memberService.memberMenu(scanner, loginMember, connection);
				System.out.println(loginMember.getMid() + "님 환영합니다.");
				//회원 서비스에서 나올 때 로그인 정보가 유지되야 함.
				break;

			case 2:
				System.out.println("게시판 서비스로 진입합니다.");
				BoardService boardService = new BoardService();
				boardService.list(connection);
				break;

			case 3:
				System.out.println("대나무숲을 종료 합니다.");
				run = false;

			}// 스위치문 종료
		} // 와일문 종료
	}// 메서드 종료

}//클래스 종료
