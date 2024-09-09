package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation {			//예매정보를 관리하는 클래스,예매의 파일 입출력을 담당

	private long id;
	private long movieId;
	private String movieTitle;
	private String SeatName;
	
	public static final File file = new File("src/movie/reservation.txt");

	
	public long getId() {
		return id;
	}


	public String getSeatName() {
		return SeatName;
	}


	public Reservation(long id,long movieId,String movieTitle,String SeatName) {
		this.id = id;
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.SeatName = SeatName;
	}
	public Reservation(long movieId,String movieTitle,String SeatName) {
		
		this( Instant.now().toEpochMilli(),movieId,movieTitle,SeatName);
	}

	
	
	public  String toString() {
			//return "영화: "+movieTitle+", 좌석: "+SeatName;
		return String.format("영화: %s, 좌석: %s",movieTitle, SeatName);
		}
	
	public static Reservation findById(String reservationId) {
		Reservation reservation = null;
		BufferedReader br = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) !=null) {
				
				String[] temp = line.split(",");
				
				if(reservationId.equals(temp[0])) {
					reservation = new Reservation(			//Reservation 객체 생성
							Long.parseLong(temp[0]),		//발급번호
							Long.parseLong(temp[1]) ,		//영화 ID
											temp[2], 		//영화 제목
											temp[3]);		//좌석명
					break;									//파일에서 reservationId 해당하는 ID 찾았으면 종료
					}
				}
				br.close();
				return reservation;							//reservation = new Reservation(// Reservation 객체생성-> 생성한 객체를 return 한다.)
			}catch(Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public static Reservation cancel(String reservationId ) {
		
		Reservation reservation = null;
		BufferedReader bf = null;			
		StringBuilder text = new StringBuilder();
		
		String line = null;					
		
		try {
			
			bf = new BufferedReader(new FileReader(file));		//reservation.txt 읽어서 buffer 저장
			
			while((line=bf.readLine() )!=null) {
			
				String[] temp = line.split(",");		
				if(reservationId.equals(temp[0])) {			
					reservation = new Reservation(Long.parseLong(temp[0]),Long.parseLong(temp[1]),temp[2], temp[3]);						
				
					continue;
				}
				text.append(line);						
			}
			bf.close();
			
			FileWriter fw = new FileWriter(file);
			fw.write(text.toString());
			fw.close();
			return reservation;
										
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	//movieId(영화ID) 해당하는 예약 현황을 보여줌
	public static ArrayList<Reservation> findMovieId(String movieId) {
		ArrayList<Reservation> reservations = new ArrayList<Reservation>();
		BufferedReader bf = null;
		String line = null;
		try {
			bf = new BufferedReader(new FileReader(file));
			while((line=bf.readLine()) !=null) {
				
				String[] temp = line.split(",");
				if(movieId.equals(temp[1])) {
					
					/*long id = Long.parseLong(temp[0]);
					long mid = Long.parseLong(temp[1]);
					String movieTittle = temp[2];
					String seatName = temp[3];
					
					Reservation r = new Reservation(id, mid, movieTittle, seatName);
					reservations.add(r);*/
					reservations.add(new  Reservation(
						Long.parseLong(temp[0]),
						Long.parseLong(temp[1]),
						temp[2],temp[3]
								
						));
					}
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		return reservations;
	}


	public void save() throws IOException {
		FileWriter fw = new FileWriter(file, true);		//true -> 기존파일에 추가하기
		fw.write(this.toFileString()+"\n");
		fw.close();
	}


	private String toFileString() {
		return String.format("%d,%d,%s,%s", id,movieId,movieTitle,SeatName);
	}



	
}
