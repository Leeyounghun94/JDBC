package chap06.ScorecCard;

import java.util.Scanner;

public class ScoresMainExam {
	// 필드 -> 멤버 변수로 main에서 사용할 배열이나 객체 등을 생성

	private static Scanner input = new Scanner(System.in); //
	private static Student[] st = new Student[5]; // 학생 객체용으로 5칸 배열 생성
	// String[] string = new String[5];

	// 생성자 -> main 일 경우 new 사용하지 않는다. (정적 스태틱으로도 사용x)

	// 메서드

	public static void main(String[] args) {
		// 주 실행 클래스로 메뉴와 클래스, 메서드 호출용으로 작업
		// 객체 : 학생, 학년, 반 , 성별
		boolean run = true; // 반복 실행 시작~
		while (run) {
			
			System.out.println("===========학생 관리 프로그램ver.2(객체)===========");
			System.out.println("1.학생관리 | 2.성적입력 | 3.통계 | 4.종료 | 5.기타문의");
			System.out.println("==============================================");
			System.out.printf(">>>");
			int select = input.nextInt(); // -> 객체(Scanner input) 사용 할려고 했으나 private static 으로 적어줘야 작동 가능

			switch (select) {

			case 1:
				System.out.println("학생관리 클래스로 진입");
				boolean strun = true;
				while (strun) {
					System.out.println("1.학생등록 |2.학생보기 |3.학생 수정 |4.정보 삭제 |5.메인메뉴로 돌아가기");
					System.out.print(">>>");
					int select1 = input.nextInt();
					switch (select1) {
					case 1:
						System.out.println("학생 등록 메뉴 입니다.");
						Student regStudent = new Student(); // -> 객체 생성

						System.out.println("이름 : ");
						regStudent.name = input.next(); // 키보드로 받은 이름

						System.out.println("학번 : ");
						regStudent.num = input.nextInt(); // 키보드로 받은 학번

						System.out.println("성별 : ");
						regStudent.sex = input.next(); // 키보드로 받은 성별

						System.out.println("학년 : ");
						regStudent.grade = input.nextInt(); // 키보드로 받은 학년

						System.out.println("반 : ");
						regStudent.classroom = input.nextInt(); // 키보드로 받은 반
						System.out.println("=-=-=-=-=-=-=-=-=-객체 생성 완료=-=-=-=-=-=-=-");
						System.out.println("=-=-=-=-=-=-=-배열 빈칸을 찾아서 저장=-=-=-=-=-=-=-");
						for (int i = 0; i < st.length; i++) {
							if (st[i] == null) {// st배열에 빈칸인지 찾음
								st[i] = regStudent; // 위에 만든 객체를 넣는다!
								System.out.println("저장 완료!");
								break; // 저장 후 종료
							} // if문 종료

						} // for문 종료 null 값을 찾아다님
						break;

					case 2:
						System.out.println("전체 학생 보기");
						for (int i = 0; i < st.length; i++) {
							if (st[i] != null) {// st배열칸에 null이 없으면~
								System.out.println("===============================");
								System.out.println("이름 : " + st[i].name);
								System.out.println("학번 : " + st[i].num);
								System.out.println("성별 : " + st[i].sex);
								System.out.println("학년 : " + st[i].grade);
								System.out.println("반 : " + st[i].classroom);
							} // if문 종료

						} // for문 종료(st배열 전체 반복)
						break; // 학생

					case 3:
						System.out.println("수정할 학생 명을 입력하세요");
						System.out.print(">>>");
						String searchName = input.next(); // -> 키보드로 받을 이름
						Student findStudent = find(searchName); // -> 아래 메서드에서 호출함
						if (findStudent == null) {
							System.out.println("찾을 학생이 없습니다.");

						} else { // 아니면 찾을 학생이 있다면 ?
							System.out.println("수정할 학생 이름을 입력하세요");
							findStudent.num = input.nextInt();
							System.out.println("학생 정보 수정 완료");

						}
						break;

					case 4:
						System.out.println("삭제할 학생명을 입력하세요");
						System.out.print(">>>");
						String deleteName = input.next();
						Student deleteStudent = find(deleteName); // -> 이것도 아래 메서드에서 호출함
						if (deleteName == null) {
							System.out.println("삭제할 학생이 없습니다.");

						} else { // 삭제할 학생이 있다면 ~? ?
							for (int i = 0; i > st.length; i++) {
								if (st[i].name.equals(deleteStudent.name)) {
									st[i] = null;
									System.out.println("삭제 완료 !");
									break;
								}
							}
						}
						break;

					case 5:
						System.out.println(" 메인 메뉴로 돌아갑니다.");
						strun = false;

					default:
						System.out.println("1 ~ 5까지 번호를 입력해주세요");

					}// switch문 종료
				} // case 1 while문 종료
				break;
				
			case 2:
				System.out.println("성적관리 클래스 진입");
				break;
				
			case 3:
				System.out.println("통계 클래스 진입");
				break;
				
			case 4:
				System.out.println("성적표 프로그램 종료");
				break;
				
			case 5:
				System.out.println("문의 사항 : 010 - XXXX - XXXX 으로 연락 바랍니다.");
				break;
				
			default:
				System.out.println("1 ~ 5번 까지 값만 입력해주세요.");
			//break문 하면 꺼져버림..
			} // 스위치문 종료 (주메뉴용)
		} // 와일문 종료
	} //메인 메서드 

	private static Student find(String name) {
		// 이름으로 객체를 찾아오는 메서드 -> 리턴은 Student 객체
		Student student = null; // 빈 객체 생성
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				String arrayName = st[i].name; // -> 배열의 이름을 가져옴
				if (arrayName.equals(name)) { // -> 배열name과 키보드name 비교한다.
					student = st[i]; // 찾을 객체를 빈 객체로 쑉~
					break;

				}
			}//if문 종료
		}//for문 종료
		
		return student;

	}
}// 클래스 종료