package ex06;

interface Aable{};

class B implements Aable{};
class C{};

class Box<T extends Aable>{			//T 전달은 인터페이스 Aable구현 클래스만 전달가능!!
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}


public class 인터페이스구현 {

	public static void main(String[] args) {

		Box<B> bBox = new Box();
		
		// Box<Integer> iBox = new Box(); ------>x
		// Box<String> sBox = new Box(); ------>x
		//Box<C> cBox = new Box(); ------->x
	}

}
