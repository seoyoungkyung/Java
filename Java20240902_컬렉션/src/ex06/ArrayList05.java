package ex06;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		
		//출력 =>Iterator
		List<String> list = new ArrayList<String>();
	
		
		list.add("Kor");
		list.add("eng");
		list.add("math");
		list.add("com");
	
		
		Iterator<String> itr = list.iterator();			//반복자 획득
		
		while (itr.hasNext()) 
			System.out.print(itr.next()+" ");
		System.out.println();
		System.out.println("---------------------");
		
		itr = list.iterator();						//반복자 획득

		while (itr.hasNext()) 
			System.out.print(itr.next()+" ");
	
	}

}
