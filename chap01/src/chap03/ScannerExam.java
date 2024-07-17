package chap03;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// Scanner 캘릇
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" 이름이 뭐에요? ");
		String name = input.nextLine();
		System.out.println("당신의 이름 : " + name
				);

	}

}
