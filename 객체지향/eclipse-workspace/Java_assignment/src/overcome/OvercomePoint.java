package overcome;

public class OvercomePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem(new PP());
		problem(new Camo_KW());
		problem(new HistoryDistortion());
		problem(new Anti_KW());
		
	}
	public static void problem(PP p) {
		p.prob();
		p.contents();
	}

}
