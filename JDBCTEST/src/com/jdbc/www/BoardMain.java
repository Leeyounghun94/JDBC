package com.jdbc.www;

import java.sql.Connection;
import java.util.Scanner;

import com.jdbc.www.dto.MemberDTO;

public class BoardMain {

	//필드
	public static Scanner scanner = new Scanner(System.in); 
	public static Connection connection =null;
	public static MemberDTO loginMember = null;
	
	
	
	//생성자
	
	
	
	//메서드
	
	public static void main(String[] args) {
	
		//일단 멤버 메인 메서드부터 구현해봄.
		
		boolean run = true;
		System.out.println(" 대나무 숲 ");
		
		
		while (run) {
			System.out.println("1.회원  2.게시판  3.종료");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch (select) {

			case 1:
				System.out.println("회원용 서비스로 진입합니다.");
				
				break;

			case 2:
				System.out.println("게시판 서비스로 진입합니다.");
				break;

			case 3:
				System.out.println("나가");
				break;

			}//스위치 종료
		}//와일문 종료
	}//메인 메서드 종료
	
}
