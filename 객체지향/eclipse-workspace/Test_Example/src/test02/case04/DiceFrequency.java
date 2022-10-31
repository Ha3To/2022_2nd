package test02.case04;

import java.util.Random;

public class DiceFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random random = new Random();
		int[][] dice = new int[6][2];
		
		for(int i = 0; i < 6; i++) {
			dice[i][0] = i+1;
		}
		
		//int result = 0;
		for(int i = 0; i < 10000; i++) 
		{
			int result = (int)(Math.random() * 6) + 1;//1~6사이의 랜덤 숫자
			if(result == 1) {
				dice[0][1] += 1;
			}
			else if(result == 2){
				dice[1][1] += 1;
			}
			else if(result == 3){
				dice[2][1] += 1;
			}
			else if(result  == 4){
				dice[3][1] += 1;
			}
			else if(result == 5){
				dice[4][1] += 1;
			}
			else {
				dice[5][1] += 1;
			}
		}
		
		System.out.println("============");
		System.out.println(" 면" + "\t" + "빈도");
		System.out.println("============");
		
		for(int i = 0; i < 6; i++) {
			System.out.println(" " + (i + 1) + "\t" + dice[i][1]);
		}
		
	}

}
