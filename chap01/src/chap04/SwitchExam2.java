package chap04;

public class SwitchExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int time = (int)(Math.random() * 6) + 6 ;
		System.out.println("[현재 시간 : " + time + "시]");
		
		
		
	switch(time) {
	
	case 6 :
		System.out.println("세수를 해볼까 ?");
	case 7 :
		System.out.println("출근 준비 해볼까?");
	case 8 :
		System.out.println("걸어서갈까? 아니면 지하철 탈까?");	
	case 9 :
		System.out.println("잘 도착했을까 ? 아니면 지각인가?");
	case 10 :
		System.out.println("수업은 잘 듣고 있니?");
		
	default :
		System.out.println("좋은 하루 되세요");
		
	
	
	} // 스위치문 종료
} // 메서드 종료
	

}	// 클래스 종료
