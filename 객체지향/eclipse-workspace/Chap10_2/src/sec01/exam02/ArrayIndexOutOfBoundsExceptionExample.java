package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}

}
//배열에서 인덱스 범위를 넘어서는 경우
//run -> run configuration -> arguments탭 -> program arguments -> '배열 인덱' 입력하면 해결됨