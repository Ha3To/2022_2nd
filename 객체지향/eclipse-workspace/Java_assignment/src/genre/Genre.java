package genre;

public class Genre {
	private String part;
	private String rc;

	public Genre() {}
	
	public Genre(String part, String rc) {
		this.part = part;
		this.rc = rc;
	}
	
	public void showGenreInfo() {
		System.out.println("분야: " + part);
		System.out.println("감독 및 주연: " + rc);
		System.out.println("");
	}
}
