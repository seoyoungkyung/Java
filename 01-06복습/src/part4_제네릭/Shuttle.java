package part4_제네릭;

public class Shuttle <T extends BioUnit> {
	private T unit;
	
	public void in(T t) {
		unit = t;
	}
	public T out() {
		return unit;
	}
	public void showInfo() {
		System.out.println("이름 : "+unit.getName()+" , HP : "+unit.getHp());
	}
}

class UnitPrinter {

	public static<T extends BioUnit> void printV1(Shuttle<T>t1) {
		T unit = t1.out();
		System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
	}
	 public static void printV2(Shuttle<? extends BioUnit> t1) {
		 BioUnit unit = t1.out();
		 System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
	}
}