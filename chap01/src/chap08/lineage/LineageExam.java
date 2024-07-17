package chap08.lineage;

import java.util.Scanner;

import chap08.lineage.DTO.Account;
import chap08.lineage.DTO.DragonKnightDTO;
import chap08.lineage.DTO.ElfDTO;
import chap08.lineage.DTO.IllusionistDTO;
import chap08.lineage.DTO.KnightDTO;
import chap08.lineage.DTO.MonarchDTO;
import chap08.lineage.DTO.PaladinDTO;
import chap08.lineage.DTO.WizardDTO;
import chap08.lineage.service.CharacterService;
import chap08.lineage.service.LoginService;

public class LineageExam {

	public static Scanner scanner = new Scanner(System.in);

	public static Account[] accounts = new Account[10]; // 로그인용 배열
	public static Account loginAccount; // 로그인 성공 시 객체 (섹션 역할)

	public static KnightDTO knightDTO = new KnightDTO(); // 기사 DTO
	public static ElfDTO elfDTO = new ElfDTO(); // 요정 DTO
	public static DragonKnightDTO dragonknightDTO = new DragonKnightDTO(); // 드래곤나이트 DTO
	public static IllusionistDTO illusionistDTO = new IllusionistDTO(); // 환술사 DTO
	public static MonarchDTO monarchDTO = new MonarchDTO(); // 군주 DTO
	public static PaladinDTO paladinDTO = new PaladinDTO(); // 팔라딘 DTO
	public static WizardDTO wizardDTO = new WizardDTO(); // 마법사 DTO

	static {
		knightDTO.setSword("진 레어피어");
		knightDTO.setArmor("징박힌갑옷");
		knightDTO.setShield("징박힌방패");
		knightDTO.setName("양기사");
		knightDTO.setSex("남");
		knightDTO.setLevel("1");
		knightDTO.setHp(5000);
		knightDTO.setMp(50);
		knightDTO.setMoney(500000); // 기사 객체

		elfDTO.setBow("가이아의격노");
		elfDTO.setDress("천사드레스");
		elfDTO.setArrow("크리티컬화살");
		elfDTO.setName("저요정");
		elfDTO.setSex("여");
		elfDTO.setLevel("1");
		elfDTO.setHp(3000);
		elfDTO.setMp(2000);
		elfDTO.setMoney(5000); // 요정 객체

		dragonknightDTO.setTwohandedsword("파멸의 대검");
		dragonknightDTO.setArmor("파푸리온의 완력");
		dragonknightDTO.setBoots("지식의 부츠");
		dragonknightDTO.setHelmet("지식의 투구");
		dragonknightDTO.setName("용기사에용");
		dragonknightDTO.setSex("남");
		dragonknightDTO.setLevel("1");
		dragonknightDTO.setHp(10000);
		dragonknightDTO.setMp(100);
		dragonknightDTO.setMoney(100000); // 드래곤 나이트 객체

		illusionistDTO.setKeylink("냉한의 키링크");
		illusionistDTO.setDress("파푸리온의 마력");
		illusionistDTO.setBoots("지식의 부츠");
		illusionistDTO.setHat("하이네스 던위치햇");
		illusionistDTO.setName("그건제잔상입니다만");
		illusionistDTO.setSex("여");
		illusionistDTO.setLevel("1");
		illusionistDTO.setHp(500);
		illusionistDTO.setMp(1000);
		illusionistDTO.setMoney(100000); // 환술사 객체

		paladinDTO.setBluntweapon("타이탄의 분노");
		paladinDTO.setArmor("린드비오르의 완력");
		paladinDTO.setBoots("고대 암석 부츠");
		paladinDTO.setShield("신의 방패");
		paladinDTO.setName("신의 부름");
		paladinDTO.setSex("남");
		paladinDTO.setLevel("1");
		paladinDTO.setHp(10000);
		paladinDTO.setMp(500);
		paladinDTO.setMoney(250000); // 성기사 객체

		monarchDTO.setWand("진명황의 지휘봉");
		monarchDTO.setCrown("지휘관의 왕관");
		monarchDTO.setBoots("지식의 부츠");
		monarchDTO.setUniform("이글아이 제복");
		monarchDTO.setName("짐이 곧 나라다");
		monarchDTO.setSex("남");
		monarchDTO.setLevel("1");
		monarchDTO.setHp(3000);
		monarchDTO.setMp(1000);
		monarchDTO.setMoney(100000); // 군주 객체

		wizardDTO.setStaff("영웅의 지팡이");
		wizardDTO.setWitchHat("대마법사의 모자");
		wizardDTO.setShoes("대마법사의 슈즈");
		wizardDTO.setRobe("던위치 로브");
		wizardDTO.setName("글레이션 체인");
		wizardDTO.setSex("여");
		wizardDTO.setLevel("1");
		wizardDTO.setHp(2500);
		wizardDTO.setMp(300);
		wizardDTO.setMoney(6700000); // 마법사 객체
		
		Account account = new Account(); // 테스트용 계정생성
		account.setId("www");
		account.setPw("www");
		account.setNickName("www");
		accounts[0] = account;	// 배열0번에 계정 객체를 연결

	}// DB대신 초기값 지정

	public static void main(String[] args) {

		System.out.println("♧♣♧♧♣♧♧♣♧♧♣♧ L　I　N　E　A G E Game Start ♧♣♧♧♣♧♧♣♧♧♣♧");
		boolean run = true;
		while (run) {
			System.out.println("1.로그인 |2.캐릭터 선택 |3.게임 실행 |4.종료 ");
			System.out.print(">>>");
			int select = scanner.nextInt();

			switch (select) {

			case 1:
				System.out.println("로그인을 시작합니다.");
				loginAccount = LoginService.menu(scanner, accounts, loginAccount); // loginAccount = 적어줘야 로그인한 정보가 넘어온다.
				break;

			case 2:
				System.out.println("캐릭터를 선택합니다.");
				CharacterService.menu(scanner, loginAccount, knightDTO, elfDTO, dragonknightDTO, illusionistDTO,
						wizardDTO, paladinDTO, monarchDTO);
				break;

			case 3:
				System.out.println("게임을 시작합니다.");
				break;

			case 4:
				System.out.println("종료합니다.");
				run = false;
				break;

			default:
				System.out.println("1~4까지만 입력하세요");

			}// 스위치문 종료
		} // 와일문 종료
	}// 메인메서드 종료
}// 클래스 종료
