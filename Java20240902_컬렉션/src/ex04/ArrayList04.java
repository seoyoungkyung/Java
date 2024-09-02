package ex04;


import java.util.LinkedList;

public class ArrayList04 {

	public static void main(String[] args) {
		
		//타입제한 => String
		LinkedList<String> list = new LinkedList<String>();
	//  List<String> list = new ArrayList<String>();
		
		list.add("Kor");
		list.add("eng");
		list.add("math");
		list.add("com");
	
	
		for(int i=0; i<list.size();i++)
			System.out.println(list.get(i)+" ");
		System.out.println();
		
		list.remove(0);
		
		//더 좋은 코드
		for(Object obj : list)
			System.out.println(obj+ " ");
	}

}
