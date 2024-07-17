package chap04;

import java.util.Scanner;

public class ExtendedSwitchExam {
	
	
	// TODO Auto-generated method stub


	public static void main(String[] args) {
	//주 메뉴	
		
		Scanner in = new Scanner(System.in);
		System.out.print("찾을 동물 이름을 입력해주세요 >>>");
		String Monster = in.next();
		
		String kind = whoIsItReturn(Monster); 
		System.out.printf("%s는 %s 이다. \n ", Monster, kind);
		
		
		
		
		
		
		
	}	//메인메서드 종료
	
	static String whoIsItReturn(String Monster) {
		
		String kind = "누구세용? " ;
		
		switch(Monster) {
		
	
		
		}	//스위치문 종료
		
		
		
		
		
		return Monster;
		
	}

	
	
	
}//클래스 종료
