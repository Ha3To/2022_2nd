package test05.case01;

public class Point {
	//필드
	int x;
	int y;
	
	//생성자
	
	//메소드
	void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
