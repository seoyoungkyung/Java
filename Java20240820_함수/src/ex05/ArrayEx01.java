package ex05;

public class ArrayEx01 {

	public static void main(String[] args) {

	//	int a;		//초기화 안되있음.
		
		int[] arr1 = new int[5];
		int[] arr2 = {10,20,30,40,50};
		int[] arr3 = new int[] {10,20,30,40,50};
		
		//int[] arr4 = new int[5] {10,20,30,40,50); -->[]안에 5를 쓰면안됨.
		
		String[] str = new String[5];		//각 방에는 null 초기화
		
		//System.out.println(arr2);			//이렇게 출력하면 숫자가아닌 그 스택주소가 나옴.
		//System.out.println(a);
		for(int i = 0 ; i < arr1.length; ++i)
		{
			System.out.println(arr3[i]);
		}
		
		
	}

}
