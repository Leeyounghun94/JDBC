package chap08.WebBoard.DTO;

public class FoodBoardDTO extends BoardDTO {
	
	// 자식 클래스 : 맛집 게시판 

	
	
	
	//필드
	
	private	String food;	//음식
	private	String foodName;	//음식 이름
	private	String foodStore; //음식점
	private	String foodStoreArea;	//음식점 장소
	private	String foodReview;	//음식 리뷰
	private	String foodStarPoint;	//음식 별점

	
	
	
	//생성자
	
	
	
	
	//메서드
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodStore() {
		return foodStore;
	}
	public void setFoodStore(String foodStore) {
		this.foodStore = foodStore;
	}
	public String getFoodStoreArea() {
		return foodStoreArea;
	}
	public void setFoodStoreArea(String foodStoreArea) {
		this.foodStoreArea = foodStoreArea;
	}
	public String getFoodReview() {
		return foodReview;
	}
	public void setFoodReview(String foodReview) {
		this.foodReview = foodReview;
	}
	
	public String getFoodStarPoint() {
		return foodStarPoint;
	}
	public void setFoodStarPoint(String foodStarPoint) {
		this.foodStarPoint = foodStarPoint;
	}
	
}
