package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("/Users/limtaeho/Documents/2학년_2학기/객체지향/eclipse-workspace/test3.db");
		
		byte[] array = {10, 20, 30, 40, 50};
		
		os.write(array, 1, 3);
		
		os.flush();
		os.close();
	}

}
