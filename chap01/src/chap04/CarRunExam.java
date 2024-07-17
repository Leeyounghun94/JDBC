package chap04;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 시스템 만들어보기.
		// C - 시동을 킨다.
		// R - 속도/감속 계기판 출력
		// U - 주행, 주차
		// D - 시동 끈다.

		Scanner input = new Scanner(System.in);

		Boolean run = true; // 시동 킨다.
		int speed = 0; // 차량속도 0

		final int MAXSPEED = 200; // 최대 속도 200까지
		final int MINSPEED = 0; // 최저 속도 0

		System.out.println(" GENESIS G90 입고 되었습니다.");
		System.out.println(" 현재 차량 운행 준비가 완료되었습니다.");
		System.out.println(" 차량 현재 속도 : " + speed + "km/h");

		System.out.println("===================================================");

		System.out.println("☆★ ☆★운행하기 전 등록된 운전자 인증이 있겠습니다.☆★ ☆★ ");
		System.out.println(" 등록된 인증번호 6자리를 입력주세요 ");
		System.out.println("===================================================");

		int a = input.nextInt();
		
		System.out.println("===================================================");

		System.out.println(" OOO님 안녕하십니까 ? 환영합니다.");

		while (run) {

			System.out.println("★★★★★★★★★★★★★★★　M　　E　　N　　U　★★★★★★★★★★★★★★");
			System.out.println("0. 시동 종료 ");
			System.out.println("1. 엑셀 ");
			System.out.println("2. 브레이크 ");
			System.out.println("3. 네비게이션 ON ");
			System.out.println("4. Music Player ON ");
			System.out.println("5. BlueTooth 연결 ");
			System.out.println("6. 주유하기 ");
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			System.out.println("원하시는 번호를 입력해 주세요.");

			int select1 = input.nextInt();

			switch (select1) {

			case 0:
				System.out.println(" 시동을 종료하겠습니다.");
				run = false;

			case 1:
				System.out.println(" 가속 합니다.");

				speed += 20;
				if (speed >= MAXSPEED) {
					speed = MINSPEED;
				}

				System.out.println("현재 속도 : " + speed + "km/h");
				break;

			case 2:
				System.out.println(" 감속 합니다.");

				speed -= 10;
				if (speed <= MINSPEED) {
					speed = MINSPEED;
				}

				System.out.println("현재 속도 : " + speed + "km/h");
				break;

			case 3:
				System.out.println(" 네비게이션을 작동합니다.  1 ~ 4번 중 하나를 선택하세요.");
				System.out.println(" 1. 최근 등록된 곳  \t2.최근 길안내를 받았던 곳");
				System.out.println(" 3. TOP10(음식점) \t4.TOP10(카페)");
				int select2 = input.nextInt();

				switch (select2) {

				case 1:
					System.out.println("최근 등록된 곳으로 안내 할까요?");
					break;

				case 2:
					System.out.println("최근 길안내를 많이 받았던 곳으로 안내 할까요? ");
					break;

				case 3:
					System.out.println("일주일 내 가장 많이 검색된 음식점 TOP10을 안내해 드릴까요? ");
					break;

				case 4:
					System.out.println("일주일 내 가장 많이 검색된 카페 TOP10을 안내해 드릴까요?");
					break;

				default:
					System.out.println("번호를 다시 입력해 주세요.");
					break;
				
				}
			
			case 4:
				int select3 = input.nextInt();
				System.out.println(" Music Player을 작동합니다. 1 ~ 4번 중 하나를 선택하세요.");
				System.out.println(" 1. 출근길 \t2.POP");
				System.out.println(" 3. 퇴근길 \t4.야간드라이브");
				

				switch (select3) {

				case 1:
					System.out.println(" 오늘 출근길을 위해 신나는 음악 틀어드릴까요 ? ");
					break;

				case 2:
					System.out.println(" OO 차트 TOP100 POP MUSIC 검색합니다.");
					break;

				case 3:
					System.out.println(" 오늘도 고생하신 당신의 퇴근길을 위한 음악 틀어드릴까요 ?");
					break;

				case 4:
					System.out.println(" 야간 드라이브를 위한 음악을 검색합니다");
					break;

				default:
					System.out.println("번호를 다시 입력해 주세요");
					break;
				}
			
			case 5:
				int select4 = input.nextInt();
				System.out.println(" BlueTooth 연결 합니다.");
				System.out.println(" 1. 기기 연결 ");
				System.out.println(" 2. 새로 연결");
				
						
						switch (select4) {
						
						case 1:
							System.out.println(" GENESIS G90와 연결 완료되었습니다. ");
							break;
							
						case 2:
							System.out.println("새로운 기기에서  GENESIS G90 BlueTooth를 연결해주세요 ");
							break;
							
						default:
							System.out.println("다시 선택해 주세요");
							break;
						}	

			case 6:
				int select5 = input.nextInt();
				System.out.println(" 주유하기 ");
				
						
			switch (select5) {
						
						case 1:
							System.out.println("가장 가까운 곳으로 주유소 검색 하시겠습니까 ?");
							break;
							
						case 2:
							System.out.println("가장 저렴한 곳으로 주유소 검색 하시겠습니까 ?");
							break;
						
						case 3:
							System.out.println("5km 이내의 주유소를 검색합니다.");
							break;
							
						case 4:
							System.out.println("10km 이내의 주유소를 검색합니다.");
							break;
						}
				

			}// 스위치문 종료

		} // 와일문 종료
System.out.println(" 안녕히 가십시오. 또 뵙겠습니다.");
	}//메서드 종료
}// 클래스 종료
