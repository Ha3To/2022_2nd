package chap03.exam01;

public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudents = pencils / students;
		System.out.println(pencilsPerStudents);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

}
