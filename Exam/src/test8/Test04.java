package test8;

public class Test04 {
	public static void main(String[] args) {
		
		
		int 	i = 5;
		char	c = 'A';
		float 	f = 3.14f; 
		double 	d = 31.4;
		boolean b = true;
		String  s = "Hello";
		
		printArgInfo1(i);
		printArgInfo1(c);
		printArgInfo1(f);
		printArgInfo1(d);
		printArgInfo1(b);
		printArgInfo1(s);
		
		
	}
	
	public static void printArgInfo2(Object arg) {
		System.out.println("타입 : " + arg.getClass());
		System.out.println("값 : " + arg.toString() );
	}
	
	//제네릭 메서드
	public static <T> void printArgInfo1(T arg) {
		System.out.println("타입 : " + arg.getClass());
		System.out.println("값 : " + arg.toString() );
	}
	
	
}
