package genre;

import java.util.*;

public class K_Drama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//컬렉션 프레임워크(list)를 사용하여 K-드라마 소개
		List<String> drama = new ArrayList<String>();
		List<String> OTT = new ArrayList<String>();
		
		drama.add(".");
		drama.add("겨울연가");
		drama.add("별에서 온 그대");
		drama.add("대장금");
		drama.add("가을동화");
		drama.add("상속자들");
		drama.add("도깨비");
		drama.add("선덕여왕");
		drama.add("여름향기");
		drama.add("라이브");
		drama.add("미남이시네요");
		
		OTT.add(".");
		OTT.add("킹덤");
		OTT.add("지금 우리 학교는");
		OTT.add("오징어 게임");
		OTT.add("미스터 션샤인");
		OTT.add("이태원 클라쓰");
		OTT.add("나의 아저씨");
		OTT.add("사랑은 불시착");
		OTT.add("밥 잘 사주는 예쁜 누나");
		OTT.add("멜로가 체질");
		OTT.add("술꾼도시여자들");
		OTT.add("서른, 아홉");
		OTT.add("스위트 홈");
		OTT.add("옷소매 붉은 끝동");
		
		System.out.println("<지상파(공중파)등을 통해 방영되어 해외로 수출된 드라마>");
		for(int i=1; i<drama.size(); i++) {
			String str = drama.get(i);
			System.out.println(i + ":" + str);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("<코로나시기 OTT서비스를통해 수출된 드라마>");
		for(int i=1; i<OTT.size(); i++) {
			String str2 = OTT.get(i);
			System.out.println(i + ":" + str2);
		}
	}

}
