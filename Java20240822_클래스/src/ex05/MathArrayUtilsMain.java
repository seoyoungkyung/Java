package ex05;

public class MathArrayUtilsMain {

	public static void main(String[] args) {
		
		 int[] values = {1, 2, 3, 4, 5};
		 System.out.println("sum=" + MathArrayUtils.sum(values));
		 System.out.println("average=" + MathArrayUtils.average(values));
		 System.out.println("min=" + MathArrayUtils.min(values));
		 System.out.println("max=" + MathArrayUtils.max(values));
	}

}

class MathArrayUtils {
	static int sum = 0;
	static double average;
	static	int min;
	static	int max;
	
	
	static int sum(int[] values){
		
		for(int i=0;i<values.length;i++) {
			sum += values[i];
		}
		return sum;
	}
	
	static double average(int[] values) {
		
		//double average = sum(values)/values.length;
		
		for(int i=0;i<values.length;i++) {
			average +=values[i];
		}
		return average/values.length;
	}
	
	static int min(int[] values) {
	
		int min = values[0];
		
		for(int i=0; i<values.length; i++){
			if(min > values[i]) min = values[i];
		}
		return min;

	}
	
	static int max(int[] values){
		
		int max = values[0];
		
		for(int i =0; i<values.length; i++){
			if(max < values[i]) max = values[i];
		}
		return max;
	}
}