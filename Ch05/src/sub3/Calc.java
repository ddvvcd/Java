package sub3;

public class Calc {
	
	// 싱글톤 객체 (private static Calc ~ private Calc(){} 까지)
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance; //get 입력 후 ctrl + space 버튼 누르고 제일 윗쪽꺼
	}
	
	private Calc() {}
	
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
		
	
	
	
	
	
}
