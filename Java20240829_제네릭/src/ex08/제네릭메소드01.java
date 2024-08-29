package ex08;



class Box<T>{			
	private T obj;
	public T getObj() {return obj;}
	public void setObj(T obj) {this.obj = obj;}
}

class BoxFactory{
	//제네릭 메소드        
	public static <T extends Number> Box<T> markBox(T o) {			//Integer,Long,Double,......가능
		Box<T> box = new Box<T>();
		box.setObj(o);
		return box;
	}
}

public class 제네릭메소드01 {

	public static void main(String[] args) {
		
		Box<Integer> iBox = BoxFactory.markBox(new Integer(1000));		//-->박싱되서 1000만 넣으면됨
		Box<Double> dBox = BoxFactory.markBox(new Double(12.25));		//-->박싱되서 12.25만 넣으면됨
		
		 Box<Integer> i = BoxFactory.markBox(10);
		 int i2 = i.getObj();
		 System.out.println(i2);
		

	}

}
