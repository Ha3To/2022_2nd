package contry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KWbyContry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//국가별 한류
		
		System.out.println("<세계속 한류의 모습>");
		System.out.println("");
		System.out.println("원하는 대륙(번호)을 선택하세요.");
		System.out.println("1. Asia");
		System.out.println("2. EU");
		System.out.println("3. NA");
		System.out.println("4. 종료");
		
		//사용자로부터 숫자를 입력받아 해당하는 대륙의 한류를 설명
		Scanner sc = new Scanner(System.in);
		int num = 0;
		Continent cont = null;
		
		while(true) {
			try {
				num = sc.nextInt();
				if(num == 1) {
					cont = new Asia();
				}
				else if(num == 2) {
					cont = new EU();
				}
				else if(num == 3) {
					cont = new NA();
				}
				else if(num == 4) {
					break;
				}
				else {
					sc.nextLine();
					System.out.println("없는 지역입니다.");
					System.out.println("다시 입력하세요.");
					System.out.println("1. Asia");
					System.out.println("2. EU");
					System.out.println("3. NA");
					System.out.println("4. 종료");
					num = sc.nextInt();
				}
			}//예외처리(숫자이외에 다른것을 입력했을때)
			catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("없는 지역입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("1. Asia");
				System.out.println("2. EU");
				System.out.println("3. NA");
				System.out.println("4. 종료");
				num = sc.nextInt();
			}
			cont.nation();
			cont.summary();
			cont.next_location();
		}
	}

}
