package test_week13;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		int sum = 0;
		for(int num : v) {
			System.out.println(num);
			sum += num;
		}
		System.out.println("벡터에 있는 정수 합: " + sum);	
	}
}
