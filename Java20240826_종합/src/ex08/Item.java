package ex08;

public class Item {
	private String name;
	private int price;
	
	Item(){}
	Item(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
	
	void info() {
		System.out.printf("이름 : "+name+" 가격 : "+price);
	}
}
