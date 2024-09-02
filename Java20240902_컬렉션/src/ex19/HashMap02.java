package ex19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap02 {

	public static void main(String[] args) {
		
		//key : 중복 x, value: 중복 o
		// >>> 순차출력(반복문, interator로 출력????)
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Kim");
		map.put(2, "Park");
		map.put(3, "Hong");
		map.put(5, "Sujin");
		map.put(4, "Lee");
		map.put(6, "Cho");
		
		Set<Integer> set = map.keySet();		//key값만 리스트저장
		
		for(Integer n : set)
			System.out.println(n+" ");
		System.out.println("----------");
		
		for(Integer n : set)
			System.out.println(map.get(n));
		System.out.println("----------");
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(map.get((itr.next())));
		}
	
		
	}

}
