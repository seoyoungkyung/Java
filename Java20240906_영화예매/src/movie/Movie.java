package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {		//영화 정보를 관리하는 클래스,영화의 파일 입출력을 담당

	private long id;
	private String tittle;
	private String genre;
	
	private static final File file = new File("src/movie/movies.txt");
	
	public long getId() {
		return id;
	}

	public String getTittle() {
		return tittle;
	}

	public Movie(String tittle,String genre) {
		this.id = Instant.now().getEpochSecond();		//id 자동생성해줌
		this.tittle = tittle;
		this.genre = genre;
		
	}
	
	public Movie(long id,String tittle,String genre) {
		this.id = id;
		this.tittle = tittle;
		this.genre = genre;
				
	}
	
	public void save() throws IOException {
		FileWriter fw = new FileWriter(file, true);		//true->append(추가)  쓰지않으면 나머지내용은 삭제되고 새로 저장한내용만 남음
		
		fw.write(this.toFileString()+"\n");
		fw.close();
	}
	
	private String toFileString() {
		return String.format("%d,%s,%s",id,tittle,genre);
	}
	
	public static Movie findAll(String movieId) {
		Movie movie = null;
		BufferedReader br = null;
		String line = null;
		
		try{
			br = new BufferedReader(new FileReader(file));
			
			while((line=br.readLine()) !=null) {
				String[] temp = line.split(",");
				
				if(movieId.equals(temp[0])) {
					movie = new Movie(Long.parseLong(temp[0]), temp[1],temp[2]);
					break;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return movie;
	}

	public static ArrayList<Movie> findAll() throws IOException{
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		BufferedReader br = null;
		String line = null;
		
		try {
			
			br = new BufferedReader(new FileReader(file));		//버퍼라는 경로가생겨 그 경로에 한줄씩 분리해서 저장됨
			
			while((line = br.readLine()) != null) {
				String[] temp = line.split(",");			//	temp[0] ->1627175707 /temp[1] ->에벤져스/ temp[2] ->판타지
				
				Movie movie = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
				
				movies.add(movie);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		br.close();
		return movies;
	}
	
	public String toString() {
		return String.format("[%d] : %s(%s)", id,tittle,genre);
	}

	public static void delete(String movieId) {
		BufferedReader br = null;			//BufferedReader 객체선언	
		String text = "";					//파일에서 읽어온 텍스트를 저장할 문자열
		String line = "";					//파일에서 한 줄씩 읽어올 문자열
		
		try {
			//파일을 읽기 위해 BufferedReader를 FileReader로 초기화
			br = new BufferedReader(new FileReader(file));
			
			while((line=br.readLine() )!=null) {
				String[] temp = line.split(",");		//각 줄을 쉼표(,)로 구분하여 배열에 저장
				if(movieId.equals(temp[0])) {			//movieId가 첫번째 요소 (temp[0])와 같으면 해당 줄을 삭제
					continue;							//continue로 다음 줄로 넘어감
				}
				text +=line +"\n";						//삭제되지 않은 줄은 text에 추가
			}
			br.close();									//BufferedReader를 닫음
			
			FileWriter fw = new FileWriter(file);	
			fw.write(text);								//새로운 내용으로 파일을 덮어씀
					
			fw.close();									//FileWriter를 닫음
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
