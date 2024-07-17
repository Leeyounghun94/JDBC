package chap06.VendingMachine;

public class Item {// 자판기 프로그램 -> 아이템(상품) 객체
	

	
	
	 // Item(상품)
	

	//필드
	
	String itemName;	//아이템 이름
	int itemEa;		//아이템 개수
	int itemPrice;	//아이템 가격
	int itemNum;		//아이템 번호
	
	
	public static void ItemAllList(Item[] items) {
	
	Item list1 = new Item();
	list1.itemName = "트붕가붕세붕 LOL 스낵";
	list1.itemPrice = 3500;
	list1.itemEa = 30;
	items[0] = list1;
	
	Item list2 = new Item();
	list1.itemName = "삼촌이 다 뺏어먹은 스낵";
	list1.itemPrice = 3500;
	list1.itemEa = 30;
	items[0] = list2;
	
	
	
	//메서드


	
		 
	
	System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆전체 리스트★☆★☆★☆★☆★☆★☆★☆★☆");
	System.out.println("◈　COFFEE ◈");
	System.out.println("1.민트초코 라떼(3500)	\t2.오렌지 바닐라 라떼(4000)");
	System.out.println("3.좋아죽는 초코딸기라떼(4500)");
	System.out.println("");
	System.out.println("◈　SNACK ◈");
	System.out.println("1. 트붕가붕세붕 LOL 스낵(1500) \t2.삼촌이 다 뺏어먹은 스낵(1800) ");
	System.out.println("");
	System.out.println("◈　DRINK ◈");
	System.out.println("1.꿀맛배맛 당기는 주스(2300)	\t2.고칼슘 마약 두유(2200)");
	System.out.println("3.인생이 오로나?(1800)");
	System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆☆★☆★☆★☆");
	
	
	
	


	

}

}



