package test5;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		
		//&&연산자는 앞뒤가 참이면 참이다. 따라서 조건식을 계속 &&를 붙이면 안 된다.
		//year % 4 == 0 && (year % 100 != 0 || year % 400 == 0
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.printf("%d는 윤년 입니다.\n", year);
		}else {
			System.out.printf("%d는 평년 입니다.\n", year);
		}
		
		GregorianCalendar greCal = new GregorianCalendar();
		
		if (greCal.isLeapYear(year)) {
			System.out.printf("%d는 윤년 입니다.\n", year);
		}else {
			System.out.printf("%d는 평년 입니다.\n", year);
		}
	}
}
