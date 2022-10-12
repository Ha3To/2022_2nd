package test03.case01;

public class Circle {
	int radius;		//원의 반지름 필드
	String name;	//원의 이름 필드
	
	public Circle() {}	//원의 생성자
	
	public double getArea() {
		return 3.14 *radius*radius;
	}
}
