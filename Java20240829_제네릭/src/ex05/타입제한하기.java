package ex05;

class A{}
class B extends A{}
class C extends B{}

class Box<T extends A>{			//T에 전달될 수 있는 대상은 A거나 A하위(자손 B.C) 클래스만 가능
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}


public class 타입제한하기 {

	public static void main(String[] args) {
		
		Box<A> aBox = new Box();
		Box<B> bBox = new Box();
		Box<C> cBox = new Box();
		
		aBox.setObj(new A());
		A a = aBox.getObj();
		aBox.setObj(new B());
		A b =(B)aBox.getObj();
		aBox.setObj(new C());
		A c =(C)aBox.getObj();
		
//		Box<String> sBox = new Box();
//		Box<Integer> iBox = new Box();
	}

}
