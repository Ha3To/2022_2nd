package test02.case03;

public class NonSquareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Arr = new int[4][];//	다차원배열 row수 선언
		
		Arr[0] = new int[3];	//col수 선언
		Arr[1] = new int[2];
		Arr[2] = new int[3];
		Arr[3] = new int[2];
		
		//2차원 배열에 차례로 원소 삽입과 동시에 출력
		for(int i = 0; i < Arr.length; i++) {
			for(int j = 0; j < Arr[i].length; j++) {
				Arr[i][j] = (i+1)*10 + j;
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
