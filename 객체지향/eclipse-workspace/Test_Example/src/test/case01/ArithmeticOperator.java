package test.case01;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int time = scanner.nextInt(); //정수입력
		
		int hour = (time / 60) / 60;
		int min = (time / 60) % 60;	//분을 기준으로 몫나누기하면 시, 나머지 나누기하면 분이 나오고, 입력값을 나머지(분) 나누기하면 초가 나온다
		int sec = time % 60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시, ");
		System.out.print(min + "분, ");
		System.out.print(sec + "초입니다.");
	}

}
