package test01.case02;

import java.util.Scanner;

public class GreatestCommonDivisor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		
		System.out.print("두개의 정수를 입력하시오(큰수, 작은수): ");
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		while(y != 0) {
			z = x % y;
			x = y;
			y = z;
		}
		
		System.out.println("최대 공약수는 " + x);
		scan.close();
	}

}