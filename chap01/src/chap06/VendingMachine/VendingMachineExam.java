package chap06.VendingMachine;

import java.util.Scanner;

public class VendingMachineExam {

	public static Scanner input = new Scanner(System.in);

	public static Admin[] admins = new Admin[10]; // -> 관리자 배열 10 생성
	
	public static Item[] items = new Item[100];
	
	public static ItemBuy[] Buyitems = new ItemBuy[1000];
	
	public static Review[] reviews = new Review[1000];
	// public static Member[] members = new Member[100];

	public static void main(String[] args) {

		// 자판기를 만들어봅시당..

			System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈ 자판기 프로그램 ◈◈◈◈◈◈◈◈◈◈◈◈");
		boolean run = true;
		while (run) {
			System.out.println("1.상품 구매하기	\t2.전체 상품 List");
			System.out.println("3.리뷰게시판 	\t4.관리자(Admin)");
			System.out.println("5.종료");
			System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
			System.out.print("> > >");
			int select = input.nextInt();

			switch (select) {

			case 1:
				System.out.println("상품 구매하기 입니다.");
				ItemBuy.BuyItem(items);
				break;

			case 2:
				System.out.println("전체 상품 List 입니다.");
				Item.ItemAllList(items);
				break;

			case 3:
				System.out.println("리뷰게시판 입니다.");
				Review.Board(reviews);
				break;

			case 4:
				System.out.println("관리자(Admin) 메뉴 입니다.");
				Admin.menuAdmin(admins, items);
				break;

			case 5:
				System.out.println("프로그램이 종료 됩니다. 이용해주셔서 감사합니다.");
				run = false;
				break;
				
			default:
				System.out.println("1 ~ 5번 번호를 선택해주세요.");

			}// 스위치문 종료
		} // 와일문 종료
	}// 메인메서드 종료

}// 클래스 종료
