package test2;

public class Test8 {
	public static void main(String[] args) {
		
		System.out.println("3! = "+factorial(3));
		System.out.println("4! = "+factorial(4));
		System.out.println("5! = "+factorial(5));
	}

	public static int factorial(int n) {
		
		if (n <= 1) {
			return 1;
		}
	
		return n * factorial (n-1);
	
	//재귀함수 Recursive (위의 경우 if문에서 시작 factorial로 들어간뒤 다시 if 반복)
	}



}