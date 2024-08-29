package part4_제네릭;

class Tainer<T,M> {
	private T key;
	private M value;

	
	public T getKey() {
		return this.key;
	}
	
	public M getValue() {
		return this.value;
	}
	
	public void set(T key, M value) {
		this.key = key;
		this.value = value;
	}
	
	
}





public class ContainerExample {

	public static void main(String[] args) {
		Tainer<String,String> container1 = new Tainer<String,String>();
		container1.set("홍길동","도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Tainer<String,Integer> container2 = new Tainer<String,Integer>();
		container2.set("홍길동",35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		
	}

}
