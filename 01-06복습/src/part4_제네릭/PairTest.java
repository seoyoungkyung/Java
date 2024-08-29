package part4_제네릭;

class Pair<K,M>{
	
	private K First;
	private M Second;
	
	public K getFirst() {
		return First;
	}
	public void setFirst(K first) {
		this.First = first;
	}
	public M getSecond() {
		return Second;
	}
	public void setSecond(M second) {
		this.Second = second;
	}
	@Override
	public String toString() {
		return "Pair [First=" + First + ", Second=" + Second + "]";
	}
	
	
	
}





public class PairTest {

	public static void main(String[] args) {
	Pair<Integer,String> pair1 = new Pair<>();
	pair1.setFirst(1);
	pair1.setSecond("data");
	System.out.println(pair1.getFirst());
	System.out.println(pair1.getSecond());
	System.out.printf("pair1 =  "+pair1);
	System.out.println();
	Pair<String,String> pair2 = new Pair<>();
	pair2.setFirst("key");
	pair2.setSecond("value");
	System.out.println(pair2.getFirst());
	System.out.println(pair2.getSecond());
	System.out.printf("pair2 =  "+pair2);
	}

}
