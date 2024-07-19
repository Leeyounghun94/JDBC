package com.board.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import com.board.www.dto.MemberDTO;
import com.board.www.service.BoardService;
import com.board.www.service.MemberService;


public class BoardMain {
		//필드
		public static Scanner scanner = new Scanner(System.in); 
		public static Connection connection = null;
		public static MemberDTO loginMember = new MemberDTO();
		
		
		
		//생성자
		public BoardMain() {
			
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.111.103:1521:orcl", "boardtest", "boardtest");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버명 또는 Ojdbc6.jar 를 확인해주세요.");
			//e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("url, id, pw , 쿼리문이 잘못됨");
			//e.printStackTrace();
			System.exit(0);
		}
		
		}
		
		
		
		//메서드
		
		public static void main(String[] args) {
		
			//일단 멤버 메인 메서드부터 구현해봄.
			BoardMain boardmain = new BoardMain();
			
			boolean run = true;
			System.out.println(" 대나무 숲 ");
			
			
			while (run) {
				System.out.println("1.회원  2.게시판  3.종료");
				System.out.print(">>>");
				int select = scanner.nextInt();
				switch (select) {

				case 1:
					System.out.println("회원용 서비스로 진입합니다.");
					MemberService memberService = new MemberService();
					loginMember = memberService.memberMenu(scanner, loginMember, connection);
					System.out.println(loginMember.getMid() + "님 환영합니다.(●'◡'●)");
							 	//회원 서비스에서 나올 때 로그인 정보가 유지되어야 함.
					break;

				case 2:
					System.out.println("게시판 서비스로 진입합니다.");
					BoardService boardService = new BoardService();
					boardService.boardMenu(scanner, connection, loginMember);
					break;

				case 3:
					System.out.println("나가");
					break;

				}//스위치 종료
			}//와일문 종료
		}//메인 메서드 종료
		
	}


