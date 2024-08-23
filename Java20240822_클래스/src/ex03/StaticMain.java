package ex03;

public class StaticMain {

	public static void main(String[] args) {
		
		StaticEx ex01 = new StaticEx();
		ex01.count++;
		ex01.cnt++;
		//==StaticEx.cnt++; (정적변수이면 클래스이름으로 접근가능하다.)
		
		System.out.println(ex01.count + " , " + ex01.cnt);
		
		StaticEx ex02 = new StaticEx();
		ex02.count++;
		ex02.cnt++;
		System.out.println(ex02.count + " , " + ex02.cnt);
		
		StaticEx ex03 = new StaticEx();
		ex03.count++;
		ex03.cnt++;
		System.out.println(ex03.count + " , " + ex03.cnt);
		
		
		
	}

}
						//클래스선언
						class StaticEx{
							int count=0;				//맴버변수 , 인스턴스변수
							static int cnt = 0;			//정적변수 , 클래스변수 (공유) ->객체생성하지않아도 접근가능하다.
						
						void func() {
							//인스턴스 변수, 클래스 변수 사용가능, 인스턴스메소드, 클래스메소드 사용가능
							}
						
						static void sfunc() {
							//클래스변수, 클래스메소드만 사용가능, 인스턴스변수, 인스턴스메소드 사용불가
							}
						
					}
						
						
						
					