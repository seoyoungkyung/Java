package ex08;

public class Album extends Item{

	private String artist;
	
	public Album() {}
	
	Album(String name,int price,String artist){
		super(name,price);
		this.artist = artist;
	}
	

	void info() {
		
		super.info();
		System.out.println(" 아티스트 : "+ artist);
	}
}
