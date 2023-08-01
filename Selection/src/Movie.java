
public class Movie {
	String name;
	String hero;
	String drama;
	int releaedate;
	void releae() {
		System.out.println("realsing");
	}
	void review() {
		System.out.println("based on stars");
		
	}
	public Movie(String name, String hero, String drama, int releaedate) {
		super();
		this.name = name;
		this.hero = hero;
		this.drama = drama;
		this.releaedate = releaedate;
	}

}
