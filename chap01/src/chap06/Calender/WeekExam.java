package chap06.Calender;

import java.util.Calendar;

public class WeekExam {

	
	public static void main(String[] args) {
		// Calender 객체 이용해서 날짜를 처리//
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);	// -> 파란색 글씨안에 년,월,일,시,분,초가 들어갈수 있다
		//get() 메서드 = 객체 값을 가져오는 동작
		//Calendar.YEAR 매개값으로 년도 신청.
		
		System.out.println("년도 : " + year);
		
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println("월 : " + month);
		// month는 0부터 계산되기 때문에 원하는 계산을 할려면 +1 해줘야 나온다. 다만, 버전 업데이트가 되면서 인덱스 0이 포함이 안될수도 있으니 이용할때 찍어봐야함
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("일자 : " + day);
		//day of month = 일자를 뽑아내는 함수 
		
		Week today = null;
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 : " + week);
		//day of week = 일요일부터 토요일까지 숫자로 배정받기 때문에 일요일은 1이다.
		
		switch (week) {
			
		case 1 :
			today = Week.SUNDAY;
			break;
			
		case 2 :
			today = Week.FRIDAY;
			break;
			
		case 3 :
			today = Week.SATURDAY;
			break;
		
		case 4 :
			today = Week.WEDNESDAY;
			break;
		default :
			System.out.println("Bug Bug");
			
		}
		System.out.println(" 현재 요일 : " + today);
		
		
	
		
	}
}
