package test03;

import java.awt.Toolkit;

public class Timer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable Task = new TimerRunnable();
		Thread th = new Thread();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	}

}
