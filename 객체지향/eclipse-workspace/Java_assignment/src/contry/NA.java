package contry;

public class NA implements Continent{
	
	@Override
	public void nation() {
		System.out.println("<북미>");
		System.out.println("");
		System.out.println("북미에는 미국과 캐나다가 있습니다.");
		System.out.println("");
		System.out.println("");
	}
	
	public void summary() {
		System.out.println("미국은 영화, 드라마, 음식, 스포츠 등등 많은 부분에서 많은 한류가 큰 인기를 누리고 있습니다.");
		System.out.println("먼저, 영화의 경우 올드보이(2003)가 인지도를 높이는데 꽤 기여했습니다. 특히 엠파이어지에서는 매년 한번씩은 꼭 언급되는 영화입니다.");
		System.out.println("그래서 그런지 박찬욱 감독은 미국내 인지도가 상당하며 쿠엔틴 타란티노 감독 또한 적극적으로 좋다고 표현할 정도입니다.");
		System.out.println("싸이(2012년 7월)의 히트로 북미에 한류가 크게 일었다. 이전까지는 찻잔 속의 태풍에 불과 했으나 2012년 하반기 싸이의 미국 진출로 인해 미국 주류 문화에 한류라고 할 만한 것이 일어나기도 했습니다.");
		System.out.println("하지만 이후에 한류가 메이저 문화로 발돋음하는데에 크게 기여하는 사건이 없었지만,");
		System.out.println("방탄소년단이 2018년 빌보드 1위를 하며 북미 포함 세계적 인기를 끌면서 K팝의 위상은 상당히 달라집니다.");
		System.out.println("더불어서 블랙핑크 또한 꽤 유의미한 인지도를 쌓고 지금도 왕성하게 활동하고 있습니다.");
		System.out.println("이외에 기생충(영화), 넷플릭스 드라마 오징어 게임 또한 상당한 한류를 견인하는 주축으로 큰 역할을 했습니다.");
		System.out.println("");
		System.out.println("");
		System.out.println("캐나다에서는 CBC 방송국에서 2016년 시트콤 김씨네 편의점이 캐나다에서 드라마 1위를 합니다.");
		System.out.println("토론토를 배경으로 교포사회에서 볼 수 있는 한인 이민자 가족의 이야기를 재미있게 담은 드라마입니다.");
		System.out.println("이 드라마로 인해 캐나다 한인들의 위상이 정말 크게 신장되었으며, 작중에 아들 역할을 맡은 배우 '시무 리우'는 마블 영화의 히어로로까지 캐스팅됩니다.");
		System.out.println("");
		System.out.println("");
	}
	
	public void next_location() {
		System.out.println("다른 지역 보기");
		System.out.println("1.Asia");
		System.out.println("2. EU");
		System.out.println("4. 종료");
	}
}
