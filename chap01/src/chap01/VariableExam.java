package chap01;

public class VariableExam {

	public static void main(String[] args) {
		// 정수 , 실수 , 문자를 연습해보자.
		
		int mach; //정수타입의 mach 변수 선언
		
		int distance ; //정수 타입의 distance 변수 선언
		
		mach = 8888;
	
		distance = mach * 60 * 360;
		
		System.out.println("이렇게 곱하게 되면 값이 얼마나 나올까요? " +  "값 = " + distance + " 입니다");
		
		
				
		char firstName ;	//문자 타입의 char 에다가 firstName 선언
		char midName;		//문자 타입의 char 에다가 midName 선언
		char lastName;		//문자 타입의 char 에다가 lastName 선언
		
		firstName = '힝';   // 각각 대입
		midName = '잉';
		lastName = '뀨';
		
		System.out.print(firstName);	// firstName 해당하는 "힝" 
		System.out.print(midName);
		System.out.print(lastName);
		
		System.out.println("ㅋㅋ");
		
		
		
	
		
		double radius = 0 ;		//실수 타입의 radius 변수를 선언
		double area ;		//실수 타입의 area 변수는 이걸 넣었더니
		radius = 7777;		//radius 값이 7777 = 무엇가의 숫자
		area = radius * radius * 3.14;	//area 값은 무언가의 숫자 * 무언가의 숫자 * 3.14 했더니 ?
		
		System.out.println("무언가의 숫자 = " + radius);
		System.out.println("알쏭달쏭 숫자 = " + area);
		
		
		
	}

}
