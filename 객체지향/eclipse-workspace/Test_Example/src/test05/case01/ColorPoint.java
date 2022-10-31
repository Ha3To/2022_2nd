package test05.case01;

public class ColorPoint extends Point{
	//필드
	String color;
	
	//생성자
	void setColor(String color) {
		this.color = color;
	}
	void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
