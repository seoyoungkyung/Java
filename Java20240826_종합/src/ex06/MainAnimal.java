package ex06;

public class MainAnimal {

	public static void main(String[] args) {
		
		// Animal an = new Animal(); -->(abstract)추상클래스라 객채생성불가능함.
		
		Dog dog = new Dog("강아지",4);
		dog.speak();
		
		Cat cat = new Cat("고양이",8);
		cat.speak();
		
		Cow cow = new Cow();
		cow.speak();
	}

}

