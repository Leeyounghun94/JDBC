package chap04;

public class SwitchExam {

	public static void main(String[] args) {
		// switch 문 연습/ 활용하기
		
	int num = (int)(Math.random()*6 + 1);
	
	switch(num) {
	
	case 1 :
		System.out.println("주사위 1번이 나왔습니다.");
		//break;
		
	case 2 :
		System.out.println("주사위 2번이 나왔습니다.");
		//break;
		
	case 3 :
		System.out.println("주사위 3번이 나왔습니다.");
		//break;
		
	case 4 :
		System.out.println("주사위 4번이 나왔습니다.");
		//break;
		
	case 5 :
		System.out.println("주사위 5번이 나왔습니다.");
		//break;
		
	case 6 :
		System.out.println("주사위 6번이 나왔습니다.");
		//break;
		
	default :
		System.out.println("프로그램이 고장 났어요. 수리 요망");
		//break;
		
	} // 스위치문 종료

	

	} // 메서드 종료

} // 클래스 종료
