package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {//여기서 q를 코드값을 읽기때문에 조건문에서 q의 코드값으로 비교를 함
				break;
			}
		}
		System.out.println("종료");
	}

}
