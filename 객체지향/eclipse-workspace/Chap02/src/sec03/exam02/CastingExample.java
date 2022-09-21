package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);	//int값이지만 char타입으로 강제 변환하여 문자로 출력
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(longValue);	//long타입에 500을 저장했지만, int타입으로 강제 변환
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	//double타입에 3.14를 저장했지만, int타입으로 강제 변환되면서 소수점 아래수는 생략
	}

}
