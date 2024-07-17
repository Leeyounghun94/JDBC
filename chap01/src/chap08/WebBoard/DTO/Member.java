package chap08.WebBoard.DTO;

public class Member {

	
	
		// 멤버 DTO
	
	
	
	//필드
	private String id;	//이름
	private String pw;	//패스워드
	private String nickName;	//닉네임
	private String email;	//이메일
	private int ph;	//휴대폰 번호

	

	public static Member loginMember = new Member();
	
	
	//생성자
	
	
	
	//메서드
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	
	
}
