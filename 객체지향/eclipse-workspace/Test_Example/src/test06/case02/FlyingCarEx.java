package test06.case02;

public class FlyingCarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingCar fc = new FlyingCar();
		fc.drive();	//Drivable 인터페이스의 실체 메소드
		fc.fly();	//Flyable 인터페이스의 실체 메소드
	}

}
