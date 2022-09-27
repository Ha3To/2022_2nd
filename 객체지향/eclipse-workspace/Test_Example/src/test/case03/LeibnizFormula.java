package test.case03;

import java.util.Scanner;

public class LeibnizFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double child, parents, pi;
		int time;
		Scanner scan = new Scanner(System.in);
		
		time = scan.nextInt();
		child = 4.0;
		parents = 1.0;
		pi = 0.0;
		
		while(time > 0) {
			pi = pi + child / parents;
			child = child * -1.0;
			parents += 2.0;
			time--;
		}
		System.out.println("PI = " + pi);
		scan.close();
	}

}
