package ex02;

import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A class";
	}
}
public class ArrayList02 {

	public static void main(String[] args) {
		
		//타입제한 => String
		ArrayList<String> list = new ArrayList<String>();
		
		//list.add(10);  
		//list.add(new Integer(20));
		list.add("Kor");
		//list.add(new A());
		list.add("eng");
		list.add("math");
		list.add("com");
		for(Object obj : list)
			System.out.println(obj+ " ");
	}

}
