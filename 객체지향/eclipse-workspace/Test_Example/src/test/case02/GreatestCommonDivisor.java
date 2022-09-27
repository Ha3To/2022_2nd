package test.case02;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		
		System.out.print("두개의 정수를 입력하시오(큰수, 작은수): ");
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		
		int temp = x % y;
		if(temp == 0) {
			z = y;
			System.out.print("최대 공약수는 " + z);
		}
		else {
			z = temp;
			System.out.print("최대 공약수는 " + z);
		}
		
		scan.close();
	}

}
