package ex13;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		
		
		//TreeSet ==>자동 정렬(오름차순 정렬)
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(10);
		set.add(8);
		set.add(12);
		set.add(19);
		
		
		
		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) 
			System.out.println(itr.next());
		System.out.println("--------------");
	
	}

}
