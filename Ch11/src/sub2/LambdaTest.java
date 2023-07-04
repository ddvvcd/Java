package sub2;
/*
 * 날짜 : 2023/07/04
 * 이름 : 박성용
 * 내용 : 함수형 람다식 실습하기 
 * 
 * 람다식
 *  - 함수형 프로그래밍을 지원하는 구문
 *  - 인터페이스 타입으로 @FunctionalInterface 선언해서 람다식 정의
 * 
 */

@FunctionalInterface //인터페이스를 람다식으로 표현하겠다는 표시(기능은 없음
interface A {
	public int method(int a, int b); //리턴값 int가 있음 (아래 참조)
}

@FunctionalInterface
interface B{
	public void method(double a);
}

@FunctionalInterface
interface C{
	public boolean method();
}
@FunctionalInterface
interface D{
	public void method();
}

public class LambdaTest {
	
	public static void main(String[] args) {
		
		//람다식 정의
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		
		A a2 = (a, b) -> {return a+b;};
		A a3 = (a, b) -> a+b;
		
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 3);
		int r3 = a3.method(3, 4);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
//-----------------------------------------------------------------------------------------------------		
		B b1 = (double a) -> {System.out.println("a : " + a);};
		B b2 = a -> System.out.println("a : " + a);;
		B b3 = System.out::println;
		
		b1.method(1.0);
		b2.method(2.1);
		b3.method(3.4);
//--------------------------------------------------------------------------------------------------------
		C c1 = () -> {return true;};
		C c2 = () -> false;
		
		System.out.println("c1 : " + c1.method());
		System.out.println("c2 : " + c2.method());
//-----------------------------------------------------------------------------------------------------------	
		D d1 = () -> {System.out.println("d1 실행...");};
		D d2 = () -> {System.out.println("d2 실행...");};
		
		d1.method();
		d2.method();
		
		//람다식 활용
		Runnable run = () -> {
			
			for(int i=1; i<=10; i++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("서브 스레드 실행 중...");
			}
		};
		
		Thread thread = new Thread(run); //구현체로 run 을 집어 넣음
		thread.start();
		
		for(int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("서브 스레드 실행 중...");
		}
		
		System.out.println("프로그램 종료...");
	}
	
}
