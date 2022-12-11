package genre;

public class Genre {
	private String title;
	private String rc;

	public Genre() {}
	
	public Genre(String title, String rc) {
		this.title = title;
		this.rc = rc;
	}
	
	public void showGenreInfo() {
		System.out.println("제목: " + title);
		System.out.println("감독 및 주연: " + rc);
		System.out.println("");
	}
}
