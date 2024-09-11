package ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptianalExample {					//요소(집계값)가 없는 경우->예외 발생 막는법

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		/*
		 * 예외발생
		 * double avg = list.stream()
		 * 					.mapToInt(Integer :: intValue)
		 * 					.average()
		 * 					.getAsDouble();
		 */
		
		
		//방법1
		OptionalDouble optional = list.stream()
									  .mapToInt(Integer :: intValue)
									  .average();
		if(optional.isPresent()) {
			System.out.println("방법1_평균: "+optional.getAsDouble());
		}else {
			System.out.println("방법1_평균: 0.0");
		}
		
		//방법2
		double avg = list.stream()
						 .mapToInt(Integer :: intValue)
						 .average()
						 .orElse(0.0);
		System.out.println("방법2_평균: "+avg);
		
		//방법3
		list.stream()
		    .mapToInt(Integer :: intValue)
		    .average()
		    .ifPresent(a ->System.out.println("방법3_평균: "+a));
	}

}
