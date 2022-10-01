package test02.case02;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		int i = 0;
		for(String name: names) {
			System.out.print(++i + "-" + name + " ");
		}
	}

}
//for each문으로 작성된 반복문
//i를 반복문 밖에서 선언해주고, 반복문안에는 사용될 객체의 타입과 val를 선언과 어떤 배열 혹은 리스트를 기준으로 반복할건지 선언
//for each문은 리스트와 배열만 사용가능하다
//단점으로는 반복횟수 명시불가, 1스텝씩 순차적으로 반복될때만 사용가능