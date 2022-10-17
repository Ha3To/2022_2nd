package test04.case01;

public class Calculator {
	
	static int abs(int a) {
//		if(a < 0) {
//			a = -a;
//		}
//		return a;
		return (a > 0) ? a:-a;
	}
	static int max(int a, int b) {
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	static int min(int a, int b) {
		if(a < b) {
			return a;
		}
		else {
			return b;
		}
	}
}