package chap08.WebBoard.DTO;

public class PictureDTO extends BoardDTO {

	
	// 자식 클래스 : 사진 게시판
	
	
	
	
	
	//필드
	private	String pictureName;	//사진 이름
	private String pictureReview; //사진리뷰
	private	String pictureArea; //사진 장소
	private	String pictureAreaRoots; //사진 장소 루트

	
	
	
	//생성자
	
	
	
	
	
	//메서드
	
	
	public String getPictureName() {
		return pictureName;
	}
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	public String getPictureReview() {
		return pictureReview;
	}
	public void setPictureReview(String pictureReview) {
		this.pictureReview = pictureReview;
	}
	public String getPictureArea() {
		return pictureArea;
	}
	public void setPictureArea(String pictureArea) {
		this.pictureArea = pictureArea;
	}
	public String getPictureAreaRoots() {
		return pictureAreaRoots;
	}
	public void setPictureAreaRoots(String pictureAreaRoots) {
		this.pictureAreaRoots = pictureAreaRoots;
	}
	
	
}

