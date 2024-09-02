package ex05;

import java.util.Comparator;
import java.util.TreeSet;

class Fruit{
	public String name;
	public int price;
	
	public Fruit(String name,int price) {
		this.name = name;
		this.price = price;
	}
}
class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		return o1.price-o2.price;
	}
	
}

public class ComparatorExample {

	public static void main(String[] args) {
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
		
		treeSet.add(new Fruit("포도",3000));
		treeSet.add(new Fruit("수박",10000));
		treeSet.add(new Fruit("딸기",6000));
		
		for(Fruit fruit: treeSet) {
			System.out.println(fruit.name+" "+fruit.price+" ");
		}

	}

}
