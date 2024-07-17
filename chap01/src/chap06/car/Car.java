package chap06.car;

public class Car {
	
	//필드(멤버 변수)
	//고유 데이터
	
	
	String company;	//제작회사
	String color;	//모델명
	String model;	//색상
	int maxspeed;	//최고 속도
	int minspeed;	//최저 속도
	
	//상태
	int speed;	//현재속도
	int rpm;	//회전수
	boolean start;	//시동 유무
	
	
	//부품
	Body body;	// 버스? 오토바이? 트럭?
	Engine engine; // 엔진 기아? 현대? 쉐보레?
	Tire tire; // 한쿡? 넥센? 
// ㄴ 이렇게 적어주면 앞에 빨간 밑줄이 생긴다. 그러면 눌러보면 Create Class 누르면 각 해당하는 객체가 만들어진다.(일일이 패키지 -> new -> 클래스 생성 X
	
	public Car(String string, String string2, String string3, int i, boolean b) {
		
	}
	
	
	
}
