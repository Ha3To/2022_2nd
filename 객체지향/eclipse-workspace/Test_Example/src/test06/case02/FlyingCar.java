package test06.case02;

public class FlyingCar implements Drivable, Flyable {
	
	//각 인터페이스들의 실체 메소드
	public void drive() {
		System.out.println("I'm driving");
	}
	public void fly() {
		System.out.println("I'm flying");
	}
}
