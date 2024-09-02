package ex08;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet02 {

	public static void main(String[] args) {
		
		//출력 =>Iterator
		Set<Integer> set = new HashSet<Integer>();
	
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
	
		
		Iterator<Integer> itr = set.iterator();			//반복자 획득
		
		while (itr.hasNext()) 
			System.out.print(itr.next()+" ");
		System.out.println();
		System.out.println("---------------------");
		
		itr = set.iterator();						//반복자 획득

		while (itr.hasNext()) 
			System.out.print(itr.next()+" ");
	
	}

}
