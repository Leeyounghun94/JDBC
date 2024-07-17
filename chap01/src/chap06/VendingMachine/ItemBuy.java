package chap06.VendingMachine;

import java.util.Scanner;

public class ItemBuy {

	final static String c1 = "민트초코라떼";
	final static String c2 = "오렌지 바닐라 라떼";
	final static String c3 = "좋아죽는 초코딸기라떼";
	
	final static String s1 = "트붕가붕세붕 LOL 스낵";
	final static String s2 = "삼촌이 다 뺏어먹은 스낵";
	
	final static String d1 = "꿀맛배맛 당기는 주스";
	final static String d2 = "고칼슘 마약 두유";
	final static String d3 = "인생이 오로나?";
	
	final static int c1c = 3500;
	final static int c2c = 4000;
	final static int c3c = 4500;
	
	final static int s1c = 1500;
	final static int s2c = 1800;
	
	
	final static int d1c = 2300;
	final static int d2c = 2200;
	final static int d3c = 1800;
	
	static int money;
	static int c_money=0;
	
	
	
	public static Scanner input = new Scanner(System.in);
	
	public static void BuyItem(Item[] Buyitems) {
		//public static void menuAdmin(Admin[] admins)
		
		boolean run = true;
		System.out.println("==============================================");
		
		while (run) {
		System.out.println("환영합니다. 고객님! 구입할 품목 종류를 선택해주세요 !");
		System.out.println("1.금액 충전	|2.COFFEE	|3.SNACK	|4.DRINK	|5.초기화면으로 돌아가기");
		System.out.print(">>>");
		int select = input.nextInt();
		
		switch (select) {
	
		case 1:
			System.out.print("충전할 금액을 입력하세요 : ");
			money = input.nextInt();
			money  += c_money;
			c_money = money;
			System.out.println("충전이 완료 되었습니다. : " + money);
			break;
	

		case 2:
			System.out.println("COFFEE 메뉴 입니다.");
			//Admin newAdmin = register(input);
			Item BuyItem = coffee(input);
			
			//System.out.println("1.민트초코 라떼(3500)");
		//	System.out.println("2.오렌지 바닐라 라떼(4000)");
		//	System.out.println("3.좋아죽는 초코딸기(4500)");
			
			
			break;
		
		case 3:
			System.out.println("SNACK 메뉴 입니다.");
			Item BuyItem2 = snack(input);
			
			//System.out.println("1.트붕가붕세붕 LOL 스낵(1500)");
			//System.out.println("2.삼촌이 다 뺏어먹은 스낵(1800)");
			break;
			
		case 4:
			System.out.println("DRINK 메뉴 입니다.");
			Item BuyItem3 = drink(input);
			//System.out.println("1.꿀맛배맛 당기는 주스(2300)	");
		//	System.out.println("2.고칼슘 마약 두유(2200)");
		//	System.out.println("3.인생이 오로나?(1800)");
			break;
			
		case 5:
			System.out.println("초기화면으로 돌아갑니다.");
			break;
			
		}
		}
		
		
		
		
		
		
	}

	private static Item drink(Scanner input2) {//drink 메뉴 메서드 
		// TODO Auto-generated method stub
		return null;
	}// drink 메뉴 메서드 종료

	private static Item snack(Scanner input2) {//snack 메뉴 메서드
		// TODO Auto-generated method stub
		return null;
	}// snack 메뉴 메서드 종료

	private static Item coffee(Scanner input2) {//coffee 메뉴 메서드
		//Admin loginAdmin = new Admin();
		
		return null;
	}// COFFEE 메뉴 메서드 종료
	
	
	
	
	
	
	
}
