package chap08.WebBoard.DTO;

import java.util.Date;

public class BoardDTO {
	
	//BoardDTO -> 부모 객체
	
	
	
	
	//필드
	private	int bno;	//게시물 번호
	private	String title;	//게시물 제목
	private String content; //게시물 내용
	private	String nickName;	//게시물 작성자(닉네임)
	private	Date regDate;	//작성한 일자
	
	
	//생성자
	
	
	
	
	//메서드

	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	
}
