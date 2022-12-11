package sec01.exam04;

public class Outter {

	public void method2(int arg) {
		// TODO Auto-generated method stub
		int localVariable = 1;
		
		class Inner{
			public void mathod() {
				int result = arg + localVariable;
			}
		}
	}

}
