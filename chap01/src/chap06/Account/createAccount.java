package chap06.Account;

import java.util.Scanner;

public class createAccount {// 은행 계좌 생성 클래스 객체
	
	public static Scanner input = new Scanner(System.in);
	
	public static void create(Account[] accountArrays) {
	//public static void menuAdmin(Admin[] admins, Item[] items) {
	
	System.out.println("◈◈◈◈◈◈◈◈◈계좌생성◈◈◈◈◈◈◈◈◈");
	
	System.out.println("생성할 계좌번호 입력해주세요.");
	System.out.print("> > >");
	String ano = input.next();
	
	System.out.println("계좌주를  입력해주세요.");
	System.out.print("> > >");
	String owner = input.next();
	
	System.out.println("입금할 금액을 입력해주세요.");
	System.out.println(" *계좌 생성 시 금액을 적어 주셔야 생성이 가능합니다.*");
	System.out.print("> > >");
	int  balance = input.nextInt();
	
	Account newAccount = new Account(ano, owner, balance);
	for(int i=0; i < accountArrays.length; i++) {
		if(accountArrays[i] == null) {
			accountArrays[i] = newAccount;
			System.out.println("system :  계좌가 생성이 되었습니다.");
			break; 
		}//if문 종료
			
	}//for문 종료
	}
}
