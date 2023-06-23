package test3;

/*
 * 날짜 : 2023/06/23
 * 이름 : 박성용
 * 내용 : 클래스 생성자 연습문제
 */

class King { 
	private String name; //필드 선언
	private int year;
	
	public King (int year) 	{ //생성자 1    //생성자 3개는 오버로드 해야 함!
		this("정조"); //문자열 "정조"를 호출하는 생성자 (밑에 생성자 2번 String name)
		this.year = year;
	}
	public King (String name)	{ //생성자 2
		this.name = name;
	}
	public King (String name, int year) { //생성자 3
		this.name = name;
		this.year = year;
	}
	public void show() { //메소드 선언
		System.out.println("name : " + name);
		System.out.println("year : " + year);
	}
}

public class Test02 {
	
	public static void main(String[] args) {
		King k1 = new King("태조", 1392);
		King k2 = new King("세종대왕");
		King k3 = new King(1776);
		
		k1.show();
		k2.show();
		k3.show();
	}

	
}
