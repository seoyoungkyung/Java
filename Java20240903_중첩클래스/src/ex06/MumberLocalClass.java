package ex06;



/*
 * 멤버로컬클래스 생성
 */

interface Printable{
	void print();
}

class Papers{
	
	private String message;
	public Papers(String message) {this.message = message;}
	
	public Printable getPrinter() {		//반환타입 : Printable -> Printable을 구현한 클래스만 반환한다.
	
		class Printer implements Printable{			//멤버로컬클래스

			@Override
			public void print() {
				System.out.println(message);
			}
			
		}
		return new Printer();
	}
	

}
public class MumberLocalClass {

	public static void main(String[] args) {

		Papers papers = new Papers("이 문장을 출력해주세요.");
		
		Printable p = papers.getPrinter();
		p.print();
		
		
	}

}
