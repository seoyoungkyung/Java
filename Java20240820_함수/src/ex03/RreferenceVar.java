package ex03;

public class RreferenceVar {

	public static void main(String[] args) {
		
		//문자열 비교
		//주소값이 같은지 다른지의 차이
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		
		arr3 = arr2;
		
		System.out.println(arr1 ==arr2);
		System.out.println(arr2 == arr3);
		
		String str3 = "com";
		String str4 = "com";
		
		System.out.println(str3 == str4);
		
		String str5 = new String("com");
		String str6 = new String("com");
		
		System.out.println(str5 == str6);
		
		//주소값이 아닌 내부문자열만 비교하는 경우에는 equals 사용
		boolean b = str3.equals(str4);
		System.out.println(b);
		boolean b2 = str5.equals(str6);
		System.out.println(b2);
	}

}
