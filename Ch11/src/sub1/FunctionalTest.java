package sub1;

/*
 * 날짜 : 2023/07/04
 * 이름 : 박성용
 * 내용 : 함수형 프로그래밍 실습하기 
 * 
 * 함수형 프로그래밍 
 *  - 프로그래밍 단위를 함수 단위로 실행하는 프로그래밍 패러다임
 *  - 함수형 프로그래밍의 함수는 람다식으로 표현
 * 
 */

interface A{
	public void method();
}

class B implements A{

	@Override
	public void method() {
		System.out.println("method 실행...");
	}
}
	
public class FunctionalTest {
	public static void main(String[] args) {
		
	//객체지향 방식	
	A a1 = new B(); //업캐스팅
	a1.method();
	
	
	//익명클래스(인터페이스를 바로 객체로 생성)
	A a2 = new A() { //A는 인터페이스, 클래스 이름이 없음
		
		@Override
		public void method() {
			System.out.println("method 실행...");
		}
	};
	
	a2.method();
		
	
	//함수형 프로그래밍 방식(람다식)
	A a3 = () -> { System.out.println("method 실행..."); }; // -> : 람다식, () : 매개변수 선언, {} : 함수의 본문
	//인터페이스 A의 추상메소드를 재정의한 것
	
	a3.method();
	
	
	
	}
}












