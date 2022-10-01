package test02.case01;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5]; //배열생성
		
		System.out.println("양수 5개를 입력하세요.");
		int max = 0;
		
		for(int i = 0; i < 5; i++) {
			intArray[i] = scanner.nextInt(); //정수 5개 입력받기
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}

}
