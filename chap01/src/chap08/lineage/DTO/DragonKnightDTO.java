package chap08.lineage.DTO;

public class DragonKnightDTO extends HumanDTO {
	
	
	
	
	//필드
	
	
	

	private String twohandedsword;	//드래곤나이트 무기 : 두손검
	private String armor;	// 갑옷
	private String Boots; // 부츠
	private String helmet; // 헬멧
	
	
	
	
	// 생성자
	
	
	
	
	
	//메서드
	public String getTwohandedsword() {
		return twohandedsword;
	}
	public void setTwohandedsword(String twohandedsword) {
		this.twohandedsword = twohandedsword;
	}
	public String getArmor() {
		return armor;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public String getBoots() {
		return Boots;
	}
	public void setBoots(String boots) {
		Boots = boots;
	}
	public String getHelmet() {
		return helmet;
	}
	public void setHelmet(String helmet) {
		this.helmet = helmet;
	}
	
	
	
}