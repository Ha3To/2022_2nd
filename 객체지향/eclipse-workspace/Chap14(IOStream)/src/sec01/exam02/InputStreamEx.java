package sec01.exam02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String result = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("/Users/limtaeho/Documents/2학년_2학기/객체지향/eclipse-workspace/test_IO.txt")));
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/limtaeho/Documents/2학년_2학기/객체지향/eclipse-workspace/test_IO_2.txt")));

			while((result = br.readLine()) != null) {
				bw.write(result + "\r\n 새로운 내용, 추가되는 내용");
				bw.flush();
			}
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
//		try {
//			//파일객체생성
//			String filePath = "/Users/limtaeho/Documents/2학년_2학기/객체지향/eclipse-workspace/test_IO.txt";
//			FileInputStream fileStream = null;
//			
//			fileStream = new FileInputStream(filePath);
//			
//			byte[] readBuffer = new byte[fileStream.available()];
//			while(fileStream.read(readBuffer) != -1) {}
//			System.out.println(new String(readBuffer));
//			fileStream.close();
//		}catch (Exception e) {
//			e.getStackTrace();
//		}
//	}
//}
//입력 소스로부터 자신의 내부 버퍼 크기만큼 데이터를 미리 읽고 버퍼에 저장
//프로그램은 외부의 입력소스로부터 직접 읽는 대신 버퍼로부터 읽음으로써 읽기성능이 향상괴는 효과를 얻을 수 있습니다.