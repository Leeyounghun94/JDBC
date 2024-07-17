package chap03;

import java.util.Scanner;

public class ScannerWelcomeExam {

	public static void main(String[] args) {
		//자바의 정석 cp.3 사용자정보 입력받기
		
		
		Scanner intput = new Scanner(System.in);
		
		System.out.println(" 이름을 입력하세요~ ");
		String userName = intput.next();
		
		System.out.println(" 연락처를 입력하세요~ ");
		int userMobile = intput.nextInt();
		
		
		String greeting = "웰컴 투 쇼핑몰";
		String tagline = " 웰컴 투 북마켓";
		
		System.out.println("=====================================");
		System.out.println("\t" + greeting);
		System.out.println("\t" + tagline);
		System.out.println("=====================================");
		System.out.println("1.고객 정보 확인하기 \t4. 바구니에 항목 추가하긔");
		System.out.println("=====================================");
		System.out.println(" 두개 중 한개 선택해봐");
		int n = intput.nextInt();
		
		System.out.println(n + "번을 선택했습니다.");
		

	}


}
