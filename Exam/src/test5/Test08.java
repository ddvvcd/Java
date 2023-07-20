package test5;

public class Test08 {
	public static void main(String[] args) {
		
		for(int y = 1; y <= 9; y ++) {
			for(int x = 2; x <= 9; x ++) {
								//오른쪽정렬 : 자릿수 2개로 지정 (%2
								//\t : 칸 띄움
				System.out.printf("%d x %d = %2d\t", x, y, x*y);
			}
			
			System.out.println("\n");
			
		}
	}
}
