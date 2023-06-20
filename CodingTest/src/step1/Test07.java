package step1;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String id = sc.next();
		String id2 = id;
		
		if (id == id2) {
			System.out.println(id+"??!");
			
		}else
			System.out.println(id2+"??!");
		
	
		sc.close();
	}
}
