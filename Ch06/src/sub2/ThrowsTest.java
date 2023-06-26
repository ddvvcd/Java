package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/26
 * 이름 : 박성용
 * 내용 : Java Throws 실습하기
 */


public class ThrowsTest {
	public static void main(String[] args) { //메인 메소드로 throws (3) -> 메인 메소드에서 예외 처리 작업(4)
		
		try {
			myMethod1(10);  // 메소드1 호출
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료..."); 
	}
	
	public static void myMethod1(int n1) throws Exception { //메소드 1에서 예외 처리(2)
		myMethod2(n1); // 메소드2 호출
	}
	
	public static void myMethod2(int n1) throws Exception { //메소드2 에서 예외 처리 안 하고 메소드 1로 던짐 (1)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("n2 입력 : ");
		int n2 = scan.nextInt();
		
		
		int result = n1 / n2;
		
		System.out.println("result : " + result);
	}
}
