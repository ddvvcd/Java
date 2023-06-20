package step1;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a >=2 && a <= 10000) {
		if(b >=2 && b <= 10000)	
		if(c >=2 && b <= 10000)	
			
			System.out.println((a + b) % c);
			System.out.println(((a % c) + (b % c)) % c);
			System.out.println((a*b)%c);
			System.out.println(((a%c)*(b%c))%c);
			
		}

		
		sc.close();


	}
}
