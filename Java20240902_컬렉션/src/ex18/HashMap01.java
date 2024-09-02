package ex18;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {

	public static void main(String[] args) {
		
		//key : 중복 x, value: 중복 o
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Kim");
		map.put(2, "Park");
		map.put(3, "Hong");
		map.put(3, "Sujin");
		map.put(4, "Lee");
		map.put(4, "Cho");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		
	}

}
