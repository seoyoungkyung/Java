package ex20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapLab1 {
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("재정의.........");
		return super.equals(obj);
}
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		final int Max =5;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		while(map.size()<Max) {
			System.out.println("나라이름을 입력하세요 : ");
			String nation = sc.nextLine();
			
			System.out.println("인구수를 입력하세요 : ");
			int pup = Integer.parseInt(sc.nextLine());
			System.out.println("*저장되었습니다.*");
			
			if(map.containsKey(nation)) {
				System.out.println("나라명 "+ nation + "은 이미 저장되었습니다.");
				continue;
			}
			map.put(nation,pup);

			
		}

		Set<String> set = map.keySet();
		for(String s : set)
			System.out.println(s+" "+map.get(s));
	}

}
