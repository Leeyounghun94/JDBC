package chap08.lineage.DTO;

public class KnightDTO extends HumanDTO {
	
	
	
	//필드
	
	private String helmet;	//투구
	private String sword;	//소드
	private String armor;	//갑옷
	private String shield;	//방패
	
	
	
	//생성자
	
	
	//메서드 
	
	
	
	public String getHelmet() {
		return helmet;
	}
	public void setHelmet(String helmet) {
		this.helmet = helmet;
	}
	public String getSword() {
		return sword;
	}
	public void setSword(String sword) {
		this.sword = sword;
	}
	public String getArmor() {
		return armor;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public String getShield() {
		return shield;
	}
	public void setShield(String shield) {
		this.shield = shield;
	}
}
