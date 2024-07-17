package chap08.WebBoard.DTO;

public class fileBoardDTO extends BoardDTO {

	
	
	// 자식 클래스 : 파일 게시판

	
	
	
		//필드
		

	private String fileName;	//파일 이름
	private	String fileContent; //파일 내용
	private	String fileReview;	//파일 리뷰
	
	
		
		
		//생성자
		
		
		
		
		//메서드
		
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getFileContent() {
			return fileContent;
		}
		public void setFileContent(String fileContent) {
			this.fileContent = fileContent;
		}
		public String getFileReview() {
			return fileReview;
		}
		public void setFileReview(String fileReview) {
			this.fileReview = fileReview;
		}
		
}
