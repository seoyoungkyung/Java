package ex05;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++)
			System.out.println(oldIntArray[i]);
		for(int i=0; i<newIntArray.length; i++)
			System.out.println(newIntArray[i]);
		
		
		oldIntArray[2]=300;
		for(int i=0; i<oldIntArray.length; i++)
			System.out.println(oldIntArray[i]);
		for(int i=0; i<newIntArray.length; i++)
			System.out.println(newIntArray[i]);
		
		
		
		System.out.println("---------------------------------");
		
		//oldIntArray2있는 값을 newIntArray2 복사
		int[] oldIntArray2 = {1,2,3};								//길이가 3인배열
		int[] newIntArray2 = new int[5];							//길이가 5인배열을 새로 생성
		
		for(int i=0; i<oldIntArray2.length; i++)		 			//배열항목복사
			newIntArray2[i] = oldIntArray2[i];		
		for(int i=0; i<newIntArray2.length; i++)					//배열항목출력
			System.out.println(newIntArray2[i]+" , ");

		oldIntArray[2]=300;											//배열에 다른 값 대입
		for(int i=0; i<oldIntArray.length; i++)
			System.out.println(oldIntArray[i]);
		newIntArray2[3]=400;
		for(int i=0; i<newIntArray2.length; i++)					//배열에 다른 값 대입
			System.out.println(newIntArray2[i]);
		
			System.out.println("---------------------------------");
		
		//oldIntArray2있는 값을 newIntArray2 복사
		int[] oldIntArray3 = {10,20,30,40,50};								//길이가 3인배열
		int[] newIntArray3 = new int[5];							//길이가 5인배열을 새로 생성
				
		System.arraycopy(oldIntArray3, 2, newIntArray3, 0, 3);		//마지막 콤마에는 oldIntArray3.length가 들어가도됨.
				
			for(int i=0; i<oldIntArray3.length; i++)
			System.out.println(oldIntArray3[i]);
				
			System.out.println("---------------");
				
			for(int i=0; i<newIntArray3.length; i++)
			System.out.println(newIntArray3[i]);
				
				System.out.println("-----");
				
			for(int n : newIntArray3)
			System.out.println(n);
				
				System.out.println("-----");
				
				String[] str = {"java","array","cope"};
				
				for(int i =0; i<str.length; i++)
					System.out.println(str[i]);
				
				for(String s : str)
					System.out.println(s);
				
		
	}

}
