package chap06.Account;

public class accountList {


	public static void list(Account[] accountArrays, WAccount[] accountArrays1 ) {
		
		System.out.println("◈◈◈◈◈◈◈◈◈계좌 목록 리스트 입니다.◈◈◈◈◈◈◈◈ ");
		for(int i=0; i < accountArrays.length; i++) {
			Account account = accountArrays[i];
			
			if(account !=null) {
				System.out.print("계좌번호 : " + account.getAno());
				System.out.print("              ");
				
				System.out.print("계좌주 : " + account.getOwner());
				System.out.print("               ");
				
				System.out.print("금액 : " + account.getBalance());
				System.out.println("               ");
			}//if문종료
		}//for문 종료
	
		
		
		for(int i=0; i < accountArrays1.length; i++) {
			Account account = accountArrays1[i];
			
			if(account != null) {
				System.out.println(" W은행 계좌번호 : " + account.getAno());
				System.out.println(" W은행 계좌주 : " + account.getOwner());
				System.out.println(" W은행 잔액 : " + account.getBalance());
				
			}
		}
	}
}
