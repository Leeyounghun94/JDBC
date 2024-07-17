package chap06.ScorecCard;

import java.util.Scanner;

public class TeacherMainScoresExam {

	private static Scanner input = new Scanner(System.in);
	private static Teacher[] tc = new Teacher[5];

	public static void main(String[] args) {
		// 교사용 관리 프로그램을 만들어보자.
		// 주 실행 클래스로 메뉴와 클래스, 메서드 호출용으로 작업
		// 객체 : 교사 이름, 학년, 반
		// 국,영,수,사 점수와 총점과 평균

		boolean run = true;

		while (run) {
			System.out.println("============교사용 관리 프로그램 입니다.=============");
			System.out.println("1.교사 등록 | 2.과목 점수 등록 | 3. 과목 총점 보기 | 4. 과목 평균 보기 | 5.기타문의");
			System.out.println("==============================================");
			System.out.printf(">>>");
			int select = input.nextInt();

			switch (select) {

			case 1:
				System.out.println("1.교사 등록 시스템으로 진입 성공 !");
				boolean tcrun = true;
				while (tcrun) {
					System.out.println("1.교사 등록 | 2.등록된 교사 보기 | 3.교사 수정 | 4.교사 삭제");
					System.out.printf(">>>");
					int select1 = input.nextInt();

					switch (select1) {
					case 1:
						System.out.println("교사 등록 시스템 입니다 ");
						Teacher regTeacher = new Teacher(); // 교사용 등록 스캐너 객체 생성!

						System.out.println("등록할 교사 이름 : ");
						regTeacher.name = input.next(); // 키보드로 받은 교사 이름

						System.out.println("담당하시는 학년 : ");
						regTeacher.grade = input.nextInt(); // 키보드로 받은 학년

						System.out.println("담당하시는 반 : ");
						regTeacher.classroom = input.nextInt(); // 키보드로 받은 반

						System.out.println("=-=-=-=-=-=-=-=-=-객체 생성 완료=-=-=-=-=-=-=-");
						System.out.println("=-=-=-=-=-=-=-배열 빈칸을 찾아서 저장=-=-=-=-=-=-=-");
						for (int i = 0; i < tc.length; i++) {
							if (tc[i] == null) {// tc 배열에 빈칸인지 찾음
								tc[i] = regTeacher; // 위에 만든 객체를 넣는다!
								System.out.println("저장 완료!");
								break; // 저장 후 종료
							} // case 1 - if문 종료
						} // case 1 - for문 종료

					case 2:
						System.out.println("2.등록된 교사 보기");
						for (int i = 0; i < tc.length; i++) {
							if (tc[i] != null) {// tc배열칸에 null이 없으면~
								System.out.println("===============================");
								System.out.println("이름 : " + tc[i].name);
								System.out.println("학년 : " + tc[i].grade);
								System.out.println("반 : " + tc[i].classroom);
							} // case 2 - if문 종료
						} // case 2 - for문 종료
						break;

					case 3:
						System.out.println("수정할 교사명을 입력하세요");
						System.out.print(">>>");
						String searchName = input.next();
						Teacher findTeacher = find(searchName);
						if (findTeacher == null) {
							System.out.println("찾을 교사가 없습니다.");

						} else { // 찾을 선생이 있다면 ?
							System.out.println("수정할 교사명 입력하세요");
							findTeacher.name = input.next();
							System.out.println(" 수정 완료");
						}
						break;

					case 4:
						System.out.println("삭제할 교사명을 입력하세요");
						System.out.print(">>>");
						String deleteName = input.next();
						//Teacher deleteteacher = find(searchName); // -> 이것도 아래 메서드에서 호출함
						if (deleteName == null) {
							System.out.println("삭제할 학생이 없습니다.");

						} else { // 삭제할 교사명 있다면 ~? ?
							for (int i = 0; i > tc.length; i++) {
							//	if (tc[i].name.equals(deleteteacher.name)) {
									tc[i] = null;
									System.out.println("삭제 완료 !");
									break;
								}
							}
						//}
						//break;

					case 5:
						System.out.println(" 메인 메뉴로 돌아갑니다.");
						tcrun = false;

					default:
						System.out.println("1 ~ 5까지 번호를 입력해주세요");

					}// switch문 종료
				}
			}// case 1 while문 종료
		}
		//break;
	}

	

	private static Teacher find(String name) {// 이름으로 객체를 찾아오는 메서드 -> 리턴은 Teacher 객체
		Teacher teacher = null; // 빈 객체 생성
		for (int i = 0; i < tc.length; i++) {
			if (tc[i] != null) {
				String arrayName = tc[i].name; // -> 배열의 이름을 가져옴
				if (arrayName.equals(name)) { // -> 배열name과 키보드name 비교한다.
					teacher = tc[i]; // 찾을 객체를 빈 객체로 쑉~
					break;

				}
			} // if문 종료
		} // for문 종료
		return teacher;

	}// find 메서드 종료

}// 클래스 종료
