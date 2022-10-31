package chap03.exam03;

import java.util.Scanner;

public class Doubleplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		double Num1 = scanner.nextDouble();
		
		System.out.print("두 번째 수: ");
		double Num2 = scanner.nextDouble();
		
		if(Num2 == 0 || Num2 == 0.0) {
			System.out.print("결과:무한대");
		}
		else {
			System.out.print("결과:" + Num1 / Num2);
		}
	}

}
