package chap06.Account;

public class Account {
	// 계좌관리 프로그램 구현//
	
	
	private String ano;	//계좌번호
	private String owner;	//계좌주
	private int balance;	//초기 입금액
	
	
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}



	public String getAno() {
		return ano;
	}



	public void setAno(String ano) {
		this.ano = ano;
	}



	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}

}
