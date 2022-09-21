package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
	}

}

/* 
 * 
 * java는 컴파일 단계에서 연산을 실행하기때문에 result1은 int로 타입 변환이 되지않는다. (피연산자가 변수가 아님으로 byte형으로 저장됨)
 * 
 * 반면에 result2 연산되어지는 수들을 byte형 x, y변수에 저장한뒤에 연산을 진행했기에 int로 형변환되어진다.
 * 
 * 결론: 특별한 이유가 없다면 형변환과 같은 소요를 줄여서 실행 성능을 챙기자
 * 
 */