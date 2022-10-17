package test04.case02;

public class Book {
	String title;
	String author;
	
	Book(){
//		this.title = "";
//		this.author = "";
		this("", "");
	}
	Book(String title){
//		this.title = title;
//		this.author = "작자미상";
		this(title, "작자미상");
	}
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	void show() {
		System.out.println("제목: " + title + ", 작가: " + author);
	}
}
