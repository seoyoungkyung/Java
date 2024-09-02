package ex17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Queue01 {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();		//class이기 때문에 객체 생성이 가능하다.
		List<Integer> ll = new LinkedList<Integer>();
		Set<Integer> hs = new HashSet<Integer>();
		Set<Integer> ts = new TreeSet<Integer>();
		
		
		Queue<Integer> qu = new LinkedList<Integer>();	//Queue는 interface이다. 따라서 객체생성을 할 수 없다.
		qu.offer(10);									//Queue를 사용하기 위해서는 Queue를 구현하든가, 아니면 구현된 객체를 사용하면 된다.
		qu.offer(20);
		qu.offer(30);
		
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
	}

}
