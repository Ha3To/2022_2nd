package test03.case01;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;
		pizza = new Circle();	//Circle 객체 생성
		pizza.radius = 10;	//피자의 반지름을 10으로 설정
		pizza.name = "자바피자";	//피자의 이름 설정
		double area = pizza.getArea();	//피자의 면적 구하기
		
		System.out.println("반지름(" + pizza.radius + ") : " + pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		
		System.out.println("반지름(" + donut.radius + ") : " + donut.name + "의 면적은 " + area);
	}

}
