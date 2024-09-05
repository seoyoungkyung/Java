package ex08;


@FunctionalInterface
interface Printable{
	void print();
}

class Papers{
	
	private String message;
	public Papers(String message) {this.message = message;}
	
	public Printable getPrinter() {	
				
				//인터페이스 구현체만 올수있다.
		return () ->System.out.println(message);	
	}
	

}
public class RamdaClass {

	public static void main(String[] args) {

		Papers papers = new Papers("이 문장을 출력해주세요.");
		
		Printable p = papers.getPrinter();
		p.print();
		

		
	}

}
