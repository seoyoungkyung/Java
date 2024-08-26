package ex08;

public class ShopMain {

	public static void main(String[] args) {
		
		Book book = new Book("Java", 10000, "han", 12345);
		book.info();
		
		Album album = new Album("앨범1", 15000, "seo");
		album.info();
		
		Movie movie = new Movie("영화1", 18000, "감독1", "배우1");
		movie.info();
		
		int sum = book.getPrice()+album.getPrice()+movie.getPrice();
		System.out.println("상품가격의 합 : "+sum);
	}

}
