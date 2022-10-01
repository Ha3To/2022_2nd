package test01.case04;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위(0), 바위(1), 보(2): ");
		int user = sc.nextInt();
		Random ran = new Random();
		int computer = ran.nextInt(3);
		
		while(user == computer) {
			System.out.println("비겼습니다. 가위(0), 바위(1), 보(2): ");
			user = sc.nextInt();
			computer = ran.nextInt(3);
		}
		if((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
			System.out.println("인간:" + user + " 컴퓨터:" + computer + " 인간 승리");
		}
		else {
			System.out.println("인간:" + user + " 컴퓨터:" + computer + " 컴퓨터 승리");
		}
		
	}

}
