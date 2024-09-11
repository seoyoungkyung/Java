package ex08;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExam02 {

	public static void main(String[] args) {

		//-> Europe Paris 시간 구하기
		ZoneId.getAvailableZoneIds()
		.stream()
		.filter(s ->s.startsWith("Europe"))
		.sorted()	//정렬
		.forEach(zoneId->System.out.println(zoneId));
		
		//Paris 시간대의 현재 날짜와 시간구하기
		ZonedDateTime parisDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("paris 현재 날짜와 시간 : "+formatter.format(parisDateTime));
	}

}
