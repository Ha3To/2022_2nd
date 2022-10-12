package test03.case02;

public class Rectangle {
	int width;	//사각형의 너비 필드
	int height;	//사각형의 높이 필드
	
	public Rectangle() {}	//사각형의 생성자
	
	public int getArea() {
		return width * height;	//사각형 넓이 구하기
	}
}
