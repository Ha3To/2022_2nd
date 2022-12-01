package sec01.exam02;

import java.io.FileWriter;
import java.io.IOException;

public class IO_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "test_IO.txt";
		String text = "추가내용";
		
		try(FileWriter fw = new FileWriter(fileName, true)){
			fw.write(text);
			System.out.println("성공");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
