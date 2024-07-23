package com.board.www.dto;

import java.sql.Date;

public class BoardDTO {
	// BOARD용 객체 처리, 세터, 게터 

	//필드
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate; //date.sql 임포트 잡아주기.
	
	
	//기본 생성자
	public BoardDTO() {
		
	}
	
	public BoardDTO(int bno, String btitle, String bcontent, String bwriter, Date bdate) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bdate = bdate;
		
	}//소스 - 제네레이트 유징 필드로 생성자 생성.

	
	//메서드(게터, 세터)
	public int getBno() {
		return bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public String getBwriter() {
		return bwriter;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}; // insert, select 할 때 많이 활용한다.(소스 - 제네레이트 게터,세터 사용)
	
	
	
	

	
	
	
	
}
