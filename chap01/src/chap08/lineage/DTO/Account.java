package chap08.lineage.DTO;

public class Account {
	
	
	
	
	//필드
	
	private String id;
	private String pw;
	private String nickName;
	private String email;
	private int ph;
	

	private KnightDTO knightDTO;	//기사 객체
	private ElfDTO elfDTO;	// 요정객체
	private DragonKnightDTO dragonKnightDTO;	//용기사 객체
	private IllusionistDTO illusionistDTO;	//환술사 객체
	private MonarchDTO monarchDTO;	//군주 객체
	private PaladinDTO paladinDTO;	//성기사 객체
	private WizardDTO wizardDTO;	//마법사 객체
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
	public KnightDTO getKnightDTO() {
		return knightDTO;
	}
	public void setKnightDTO(KnightDTO knightDTO) {
		this.knightDTO = knightDTO;
	}
	public ElfDTO getElfDTO() {
		return elfDTO;
	}
	public void setElfDTO(ElfDTO elfDTO) {
		this.elfDTO = elfDTO;
	}
	public DragonKnightDTO getDragonKnightDTO() {
		return dragonKnightDTO;
	}
	public void setDragonKnightDTO(DragonKnightDTO dragonKnightDTO) {
		this.dragonKnightDTO = dragonKnightDTO;
	}
	public IllusionistDTO getIllusionistDTO() {
		return illusionistDTO;
	}
	public void setIllusionistDTO(IllusionistDTO illusionistDTO) {
		this.illusionistDTO = illusionistDTO;
	}
	public MonarchDTO getMonarchDTO() {
		return monarchDTO;
	}
	public void setMonarchDTO(MonarchDTO monarchDTO) {
		this.monarchDTO = monarchDTO;
	}
	public PaladinDTO getPaladinDTO() {
		return paladinDTO;
	}
	public void setPaladinDTO(PaladinDTO paladinDTO) {
		this.paladinDTO = paladinDTO;
	}
	public WizardDTO getWizardDTO() {
		return wizardDTO;
	}
	public void setWizardDTO(WizardDTO wizardDTO) {
		this.wizardDTO = wizardDTO;
	}
	
	
	
	
	
}
