package test8;

@FunctionalInterface
interface NumbericLambda{
	boolean test(int n);
}


public class Test05 {
	
	public static void main(String[] args) {
		
		NumbericLambda isEven = (n) -> n % 2 == 0;
		
		if(isEven.test(2)) {
			System.out.println("2는 짝수");
		}
		
		if(!isEven.test(3)) {
			System.out.println("3은 짝수 아님");
		}
		
		NumbericLambda isNonNeg = (n) -> n >= 0;
		
		if(isNonNeg.test(1)) {
			System.out.println("1은 양수");
		}
		
		if(!isNonNeg.test(-1)) {
			System.out.println("-1은 음수");
		}
	}
}
