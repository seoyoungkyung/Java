package ex03;

public class MainAnimal {

	public static void main(String[] args) {
		
		
		Dog dog = new Dog("강아지",4);
		dog.info();
		dog.speak();
		
		Cat cat = new Cat("고양이",8);
		cat.info();
		cat.speak();
	}

}

