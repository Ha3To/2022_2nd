package overcome;

public class OvercomePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상속의 다형성의 사용하여 한류가 극복해야할 점들을 소개
		problem(new PP());
		problem(new Camo_KW());
		problem(new HistoryDistortion());
		problem(new Anti_KW());
		
	}
	//문제점과 그 내용을 소개
	public static void problem(PP p) {
		p.prob();
		p.contents();
	}

}
