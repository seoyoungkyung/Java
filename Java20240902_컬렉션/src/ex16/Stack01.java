package ex16;

import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;



public class Stack01 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.add(60);
		stack.add(1, 70);
		
		System.out.printf("peek:%d, %d\n",stack.peek(),stack.pop());	
		System.out.printf("peek:%d, %d\n",stack.peek(),stack.pop());	
		System.out.printf("peek:%d, %d\n",stack.peek(),stack.pop());	
		System.out.printf("peek:%d, %d\n",stack.peek(),stack.pop());	
		System.out.printf("peek:%d, %d\n",stack.peek(),stack.pop());	
		System.out.printf("peek:%d, %d\n",stack.peek(),stack.pop());	
		System.out.printf("peek:%d, %d\n",stack.peek(),stack.pop());	
		
		
		
		/*for(int i =0 ; i<stack.size();i++) {
			System.out.printf("peek:%d, %d\n",stack.peek(),stack.pop());
		}*/
			
	
		
//		Iterator<Person> itr = set.iterator();
//		while (itr.hasNext()) 
//			System.out.println(itr.next());
//		
	
	}

}
