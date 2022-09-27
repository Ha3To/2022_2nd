package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) {	//여기서는 q를 키코드로 읽는게 아닌 문자열로 읽기때문에 조건문에 equals를 사용해서 문자열 비교함
				break;
			}
		}
		System.out.println("종료");
	}

}
