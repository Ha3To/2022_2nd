package sec01.exam04;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스와 소통하는 개발코드
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}

}
