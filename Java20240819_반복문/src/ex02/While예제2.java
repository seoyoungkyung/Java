package ex02;

public class While예제2 {

	public static void main(String[] args) {
		
		int i=2;
		
		while(i<=9) {
			int j=1;
			while(j<=9) {
				System.out.printf("%dX%d=%d\n",i,j,i*j);
				j++;	//중요코드 (넣지않으면 무한으로 돌아감)
			}
			i++;	//중요코드 (넣지않으면 무한으로 돌아감)
		}

		
	}

}
