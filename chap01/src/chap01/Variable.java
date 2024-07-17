package chap01;

public class Variable {

	public static void main(String[] args) {
		// 변수의 사용 범위를 알아보자.
		// 변수는 괄호 안에서만 효력이 발생 한다. -> 내부 괄호 까지
		int v1 = 480;
		
		int v2 = 70;
		
		if(v1>50) { // if는 조건을 참/거짓 판단함
			v2 = v1 +10;
			
	}

		
		int v3 = v1 * v2 + 10;
		
		System.out.println(v1);
		System.out.println(v2);
		//System.out.println(v3);
		
	}
	
	
	
	
}
