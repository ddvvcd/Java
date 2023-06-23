package test3;

/*
 * 날짜 : 2023/06/23
 * 이름 : 박성용
 * 내용 : 자바 클래스 연습문제
 */

public class Test01 {
	private String name; //필드 선언
	private int age;
	
	public Test01(String name, int age) { //생성자 선언
		this.name=name;
		this.age=age;
	}
	
	public void show() { //메소드 선언
		System.out.println("===================");
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
			
		Test01 kim = new Test01("김유신", 23);  //()안의 값은 생성자 값
		Test01 lee = new Test01("이순신" , 31); //()안의 값은 생성자 값
	
	
		kim.show();
		lee.show();
		
	}
}
