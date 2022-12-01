package sec01.exam02;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputSTreamEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream (new FileOutputStream("/Users/limtaeho/Documents/2학년_2학기/객체지향/eclipse-workspace/test_IO.txt"));
			String str = "다양한 분야 속 한류들 (정리본)";
			bs.write(str.getBytes());
		} catch (Exception e) {
			e.getStackTrace();
		}finally {
			bs.close();
		}

	}

}
//내부 버퍼에 데이터를 쌓아두었다가 버퍼가 다차면 버퍼의 모든 데이터를 한번에 전송
//프로그램 입장에서는 직접 데이터를 보내는 것이 아니라, 메모리 버퍼로 데이터를 고속 전송하기때문에
//실행 성능 향상 효과