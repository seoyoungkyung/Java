package ex01;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {

		//문자 추출
		String st1 = "korea";								//변경불가 객체 imputable
		String st2 = new String("203540-2154012");
		
		Scanner sc = new Scanner(System.in);
		
		char ch = st1.charAt(2);
		System.out.println(ch);
		
		char ch2 = st2.charAt(7);
		String s = (ch2 == '1') ? "남" : "여";
		System.out.println(s);

		//문자열길이
		int len = st1.length();
		System.out.println("len: "+len);
		
		
		//문자열 대체
		String oldStr = "java programing";					//string은 변경불가능
		String newStr = oldStr.replace("java", "Spring");	//replace가 있으므로 변경가능
		System.out.println(newStr);
		System.out.println(oldStr);
		
		//string oldStr = "java programing"가 있는지 없는지 확인하는것
		System.out.println(oldStr.startsWith("Spring"));
		
		//공백제거
		String str7 = "    java Spring      ";
		System.out.println(str7.length());
		
		String str8 = str7.trim();
		System.out.println(str8);				//공백제거됨.
		System.out.println(str7);				//공백제거 안됨.
		
		//대문자로 바꿔주는것
		System.out.println(str8.toUpperCase());
		//소문자로 바꿔주는것
		System.out.println(str8.toLowerCase());
		
		//문자열 잘라내기
		String sub1 = oldStr.substring(3);					//숫자부터 마지막숫자전(-1)까지 출력됨.
		System.out.println(sub1);
		String sub2 = oldStr.substring(5, 9);
		System.out.println(sub2);
		
		//문자열 찾기
		int len2 = oldStr.indexOf("prog");					//단어에 없는 출력값은 -1로 출력됨.
		System.out.println(len2);
		
		//문자열 분리
		String board = "국어,영어,수학,컴퓨터";					//원래는 한글자로인식되지만 한단어씩 ,로 분리되서 출력됨.
		String[] sArr = board.split(",");
		
		for(int i=0; i<sArr.length; i++)
			System.out.println(sArr[i]);
		
		String phone = "010-1234-5678";
		
		String[] phone2 = phone.split("-");					//-를 기준으로 분리됨.
		for(int i=0; i<phone2.length; i++)
			System.out.println(phone2[i]);
		
		
	}

}
