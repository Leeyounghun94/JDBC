package chap13;

import java.util.ArrayList;
import java.util.Comparator;

public class Collection01 {

	public static void main(String[] args) {
			
		ArrayList<Integer> num = new ArrayList<>();
		
		for (int i = 10; i >=1; i--)
			num.add(i);
		
		System.out.println(num);
		
		System.out.println("정렬 전");
		for(int i =0; i < num.size(); i++)
			System.out.println(num.get(i) + " ");
		
		
		num.sort(Comparator.naturalOrder());	// natualOrder : 오름차순 / reverseOder : 내림차순
		System.out.println();
		System.out.println("정렬 후");
		for(int i=0; i < num.size(); i++)
			System.out.println(num.get(i) + " ");
		
	}

}
