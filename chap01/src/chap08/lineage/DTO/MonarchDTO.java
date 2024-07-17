package chap08.lineage.DTO;

public class MonarchDTO extends HumanDTO {
	
	
	
	
	
	//필드
	
	private String wand;	//군주 무기 : 완드(지휘봉)
	private String crown; // 모자
	private String uniform; //로브
	private String boots; //부츠
	
	
	
	
	
	
	//생성자
	
	
	
	
	//메서드
	
	
	
	public String getWand() {
		return wand;
	}
	public void setWand(String wand) {
		this.wand = wand;
	}
	public String getCrown() {
		return crown;
	}
	public void setCrown(String crown) {
		this.crown = crown;
	}
	public String getUniform() {
		return uniform;
	}
	public void setUniform(String uniform) {
		this.uniform = uniform;
	}
	public String getBoots() {
		return boots;
	}
	public void setBoots(String boots) {
		this.boots = boots;
	}

	
}
