package contry;

public class EU implements Continent{
	
	@Override
	public void nation() {
		System.out.println("<유럽>");
		System.out.println("");
		System.out.println("유럽에는 프랑스, 독일 등이 있습니다.");
		System.out.println("");
		System.out.println("");
	}
	
	public void summary() {
		System.out.println("유럽에는 SM엔터테인먼트, YG엔터테인먼트, JYP엔터테인먼트등은 2011년을 유럽 공략의 원년으로 삼고 유럽을 목표로 달렸습니다.");
		System.out.println("");
		System.out.println("");
		System.out.println("프랑스에서는 2010년대부터 꾸준히 많은 아이돌들이 인기입니다.");
		System.out.println("특히, SM엔터테인먼트 소속의 아이돌들이 많이 진출했습니다.");
		System.out.println("그 중에는 틴탑이 대표적입니다. 최근에는 역시 방탄소년단이 가장 인기입니다.");
		System.out.println("");
		System.out.println("");
		System.out.println("독일에는 다른 유럽국가들과 같이 K-POP이 굉장히 유명합니다.");
		System.out.println("2012년 싸이의 강남스타일을 시작으로, 트와이스, 블랙핑크, 방탄소년단으로 계속해서 인기를 얻고있습니다.");
		System.out.println("그리고영화부분에서도 많은 관심을 보이고 있는데, 2016년, 영화 아가씨, 곡성, 부산행 등이 개봉 전 2016년 5월 칸 영화제에서 주목받으면서 한류팬이 1000만 명을 넘어섰습니다.");
		System.out.println("");
		System.out.println("");
		System.out.println("유렵은 아직 아시아에 비해 규모는 작다지만, 확실한 팬층은 형성되었고 자속적인 성장게를 보이고 있습니다.");
		System.out.println("위 국가 이외에도 영국, 프랑스, 폴란드, 루마니아 등이 한국문화가 제대로 자리를 잡은 나라들로 분석됩니다.");
		System.out.println("");
		System.out.println("");
	}
	
	public void next_location() {
		System.out.println("다른 지역 보기");
		System.out.println("1. Asia");
		System.out.println("3. NA");
		System.out.println("4. 종료");
	}
}
