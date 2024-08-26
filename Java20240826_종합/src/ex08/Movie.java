package ex08;

public class Movie extends Item{
	private String director;
	private String actor;
	
	public Movie() {}
	
	public Movie(String name,int price,String director,String actor) {
		super(name,price);
		this.director=director;
		this.actor = actor;
	}
	
	
	
	void info() {
		super.info();
		System.out.println(" 감독 : "+director+" 배우 : "+actor);
	}
}
