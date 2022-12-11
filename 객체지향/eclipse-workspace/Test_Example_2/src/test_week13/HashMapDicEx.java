package test_week13;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dic = new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			String word = scanner.next();
			
			if(eng)) {
				System.out.println(dic.);
			}
			else if(word == "exit"){
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println(word + "는 없는 단어 입니다.");
			}
		}
	}

}
