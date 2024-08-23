package ex02;

public class BookMain {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.displatInfo();
		
		Book book2 = new Book("Hello Java","Seo");
		book2.displatInfo();
		
		Book book3 = new Book("JPA 프로그래밍","Kim",700);
		book3.displatInfo();
		

	}

}

	class Book {
		private String title;
		private String author;
		private int page;
	
		Book() {
			}
		
		Book(String title,String author) {
			this(title,author,0);	
		}
		
		Book (String title,String author,int page) {
			this.title = title;
			this.author = author;
			this.page = page;
			
			//page = this.page; ->오류나옴(0값으로 초기화됨)
			}
		
		void displatInfo(){
			System.out.println("제목 : "+ title +" , 저자: " + author + " , 페이지: " + page);
		}
	
}