package genre;

public class KW_genre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//참조타입(배열)을 이용하여 영화 및 감독 소개
		Genre[] movie = new Genre[6];
		
		movie[0] = new Genre("기생충(2019)", "봉준호");
		movie[1] = new Genre("설국열차", "봉준호");
		movie[2] = new Genre("부산행", "연상호");
		movie[3] = new Genre("쉬리", "상제규");
		movie[4] = new Genre("태극기 휘날리며", "강제규");
		movie[5] = new Genre("올드보이", "박찬욱");
		
		System.out.println("<영화>");
		System.out.println("");
		for(int i = 0; i < movie.length; i++) {
			movie[i].showGenreInfo();
		}
		
		//참조타입(배열)을 이용하여 드라마 및 주연 소개
		Genre[] drama = new Genre[7];
		
		drama[0] = new Genre("커피프린스 1호점", "공유");
		drama[1] = new Genre("내 여자친구는 구미호", "이승기");
		drama[2] = new Genre("태양의 후예", "송중기");
		drama[3] = new Genre("시크릿 가든", "현빈");
		drama[4] = new Genre("별에서 온 그대", "전지현");
		drama[5] = new Genre("사랑은 불시착", "손예진");
		drama[6] = new Genre("오징어 게임", "이정재");
		
		System.out.println("<드라마>");
		System.out.println("");
		for(int i = 0; i < drama.length; i++) {
			drama[i].showGenreInfo();
		}
		
		//참조타입(열거)을 이용하여 분야별 대표격인 작품 혹은 인물 소개
		Part part = null;
		String fr = null;
		
		for(int i=1; i < 9; i++) {
			switch(i) {
			case 1:
				part = Part.MOVIE;
				fr = "기생충(2019)";
				break;
			case 2:
				part = Part.MUSIC;
				fr = "BTS(방탄소년단)";
				break;
			case 3:
				part = Part.SOCCER;
				fr = "손흥민";
				break;
			case 4:
				part = Part.BASEBALL;
				fr = "류현진";
				break;
			case 5:
				part = Part.E_SPORT;
				fr = "Faker(이상혁)";
				break;
			case 6:
				part = Part.FOOD;
				fr = "비빔밥";
				break;
			case 7:
				part = Part.DRAMA;
				fr = "오징어 게임";
				break;
			case 8:
				part = Part.CARTOON;
				fr = "이태원 클라쓰";
				break;
			}
			System.out.println("분야: " + part);
			System.out.println("대표주자: " + fr);
			System.out.println("");
		}
	}

}
