package test2;

import java.util.Scanner;

public class Test6 {
	public static void intro() { //void : 반환
		System.out.println("******* START *******");
		System.out.println("두개의 정수를 입력");
	}
	
	public static int input(Scanner sc, String name) { // input 이 "" 문자열이기 때문에 
		System.out.print("변수 "+name+" 값 입력 : ");		// string 입력, 아래쪽 name있음
		int input = sc.nextInt();
		return input;
	}
	
	
	public static void result(int val) {
		System.out.println("덧셈 결과 : "+val);
		System.out.println("******* END *******");
	}
	
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = input(sc, "a"); // "" : 문자열 , '' : 문자
		int b = input(sc, "b");
		
		int output = add(a, b);
		result(output);
		
		sc.close();
		
	}
	
}

