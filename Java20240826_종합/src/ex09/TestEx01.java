package ex09;

public class TestEx01 {

	public static void main(String[] args) {
		ClassA a = new ClassC(01, 02, 03, 04, 05);
		a.info();
		
		ClassB b = (ClassB)a;
		b.info();
		((ClassB)a).info();

	}

}
