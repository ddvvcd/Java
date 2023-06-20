package test1;

/*
 * 날짜 : 2023/06/14
 * 이름 : 박성용
 * 내용 : 자바 연산자 연습문제
 */

public class Test3 {
	public static void main(String[] args) {
		
		int result = 1;
		int num = 2;
		
		result = num++; //num이 result에 대입이 먼저 -> ++(증가) 
		System.out.println("result : "+result);
		
		result = ++num; //++(증가) 먼저 -> num 대입
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
		
		
	}
}
