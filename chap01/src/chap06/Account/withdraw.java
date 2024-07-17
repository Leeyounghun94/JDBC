package chap06.Account;

import java.util.Scanner;

public class withdraw {

	public static Scanner input = new Scanner(System.in);
	private static Account[] accountArrays = new Account[100];

	public static void withdraw(Account[] ac) {

		System.out.println("◈◈◈◈◈◈◈◈◈ 출금 서비스  입니다. ◈◈◈◈◈◈◈◈ ");
		System.out.println(" 본인의 계좌번호를 입력 해주세요. ");
		System.out.print(">>>");
		String ano = input.next();

		System.out.println(" 찾으시려는 금액을 입력 해주세요. ");
		System.out.print(">>>");
		int money = input.nextInt();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과 : 등록된 계좌가 없습니다. 다시 확인해 주세요. ");
			return;

		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : " + money + "가 출금 되었습니다. ");

	}

	private static Account findAccount(String ano) {// account 배열에서 ano와 동일한 account 객체 찾기
		Account account = null;
		for (int i = 0; i < accountArrays.length; i++) {
			if (accountArrays[i] != null) {
				String dbAno = accountArrays[i].getAno();
				if (dbAno.equals(ano)) {
					account = accountArrays[i];
					break;
				} // if문 종료
			} // if문 종료
		} // for문 종료
		return account;
	}
}
