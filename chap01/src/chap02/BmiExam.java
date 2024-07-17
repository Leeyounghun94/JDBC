package chap02;

public class BmiExam {

	public static void main(String[] args) {
		// bmi 계산을 한번 따라해보기
		
		System.out.println("=============BMI 계산================");
		
		System.out.println("1. 당신의 이름은 무엇입니까?");
		System.out.println("    ::이름을 입력하시오:: ");
		
		System.out.println("2. 당신의 나이는 얼마입니까?");
		int age = 55;
		System.out.println("   나이 : " + age + "세 " );
		
		System.out.println("3. 당신의 키는 얼마입니까?");
		double height = 180;
		System.out.println("   키 " + ":" +  height+ "cm");
		
		System.out.println("4. 당신의 몸무게는 얼마입니까?");
		double weight = 130;
		System.out.println("   몸무게 " + ":" + weight + "kg");
		
		
		int total = (int) (age / (height + weight) * 5);
		//total = (age / (height + weight) * 5);
		
		System.out.println(total);
		
	}

}
