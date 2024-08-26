package ex08;

public class Book extends Item {
	private String author;
	private int isbn;
	
	Book(){}
	
	
	Book(String name,int price,String author,int isbn){
		super(name,price);
		this.author = author;
		this.isbn = isbn;
	}

	
	void info() {
		super.info();
		System.out.println(" 저자 : "+ author+" isbn : "+isbn);
	}
}
