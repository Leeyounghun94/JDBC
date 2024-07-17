package chap08.lineage.DTO;

public class WizardDTO extends HumanDTO {
	
	
	
	
	//필드
	
	private String staff;	//마법사 무기 : 스태프
	private String witchHat; // 모자
	private String robe; //로브
	private String shoes; //슈즈
	
	
	
	
	
	
	
	
	//생성자
	
	
	
	
	
	//메서드
	
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public String getWitchHat() {
		return witchHat;
	}
	public void setWitchHat(String witchHat) {
		this.witchHat = witchHat;
	}
	public String getRobe() {
		return robe;
	}
	public void setRobe(String robe) {
		this.robe = robe;
	}
	public String getShoes() {
		return shoes;
	}
	public void setShoes(String shoes) {
		this.shoes = shoes;
	}

}
