package chap08.WebBoard.DTO;

public class ItemBoardDTO extends BoardDTO {

	
	// 자식 클래스 : 아이템 게시판
	
	//필드
	
	
	private	String itemName;	//아이템 이름
	private	String itemcontent;	//아이템 내용
	private	String itemReview;	//아이템 리뷰
	private	int itemStarPoint;	//아이템 별점
	
	private	String itemBuy;	// 아이템 구매
	private	String itemsell;	//아이템 판매
	
	
	//생성자
	
	
	
	//메서드
	
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemcontent() {
		return itemcontent;
	}
	public void setItemcontent(String itemcontent) {
		this.itemcontent = itemcontent;
	}
	public String getItemReview() {
		return itemReview;
	}
	public void setItemReview(String itemReview) {
		this.itemReview = itemReview;
	}
	public int getItemStarPoint() {
		return itemStarPoint;
	}
	public void setItemStarPoint(int itemStarPoint) {
		this.itemStarPoint = itemStarPoint;
	}
	public String getItemBuy() {
		return itemBuy;
	}
	public void setItemBuy(String itemBuy) {
		this.itemBuy = itemBuy;
	}
	public String getItemsell() {
		return itemsell;
	}
	public void setItemsell(String itemsell) {
		this.itemsell = itemsell;
	}
	
}
