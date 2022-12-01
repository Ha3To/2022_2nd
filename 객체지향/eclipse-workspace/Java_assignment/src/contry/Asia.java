package contry;

public class Asia implements Continent{
	
	@Override
	public void nation() {
		System.out.println("<아시아>");
		System.out.println("");
		System.out.println("아시아에는 일본, 중국, 베트남 등이 있습니다.");
		System.out.println("");
		System.out.println("");
	}
	
	public void summary() {
		System.out.println("일본에는 K-POP이 굉장한 인기를 끌고있습니다.");
		System.out.println("특히, 트와이스, 방탄소년단(BTS) 등이 톱을 달립니다.");
		System.out.println("최근 코로나에의해서 OTT서비스에서 한국의 영상물 또한 인기입니다.");
		System.out.println("오징어 게임, 사랑은 불시착, 이태원 클라쓰 등이 있습니다.");
		System.out.println("그중 이태원 클라쓰는 일본에서 리메이크 되기도 했습니다.");
		System.out.println("");
		System.out.println("");
		System.out.println("중국에서는 일본과 마찬가지로 K-POP과 미디어류가 굉장한 인기를 얻고있습니다.");
		System.out.println("예전에는 슈퍼주니어, 장나라가 인기였고, 시간이 흐르면서 EXO, 방탄소년단이 인기입니다.");
		System.out.println("드라마에서는 김수현과 전지현 주연의 별에서 온 그대, 송중기, 송혜교 주연의 태양의 후예가 엄청난 파급력을 보였습니다.");
		System.out.println("이외에도 게임에서도 많은 인기가 있는데, 리그 오브 레전드라는 게임의 탑 플레이어인 Faker(이상혁)선수가 상상 이상의 인기를 끌고있습니다.");
		System.out.println("");
		System.out.println("");
		System.out.println("마지막 베트남에서는 특히 K-드라마가 많은 인기를 얻었습니다.");
		System.out.println("이 중 가장 히트를 친 드라마는 장동건, 이영애 주연의 <의가형제>와 중국에서도 인기였던 <별은 내가슴에> 입니다.");
		System.out.println("2000년대에는 <모래시계>, <가을동화>, 그리고 <겨울연가>와 <대장금>이 엄청난 인기를 끌었다. 이 두 작품은 한류가 유행한 대부분의 국가에서 대히트를 쳤습니다.");
		System.out.println("그리고 스포츠(축구)에서는 2010년대 후반 박항서가 베트남 축구 국가대표팀, U-23 대표팀을 맡아 유례없는 성공을 이어나가면서 양국 간의 이미지가 좋아지기도 했습니다.");
		System.out.println("");
		System.out.println("");
	}
	
	public void next_location() {
		System.out.println("다른 지역 보기");
		System.out.println("2. EU");
		System.out.println("3. NA");
		System.out.println("4. 종료");
	}
}
