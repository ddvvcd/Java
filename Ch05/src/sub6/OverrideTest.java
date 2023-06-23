package sub6;

/*
 * 날짜 : 2023/06/21
 * 이름 : 박성용
 * 내용 : Java 오버라이드 실습하기 (중요함!!)
 * 
 *  오버라이드(메서드 재정의)
 *  - 부모클래스의 메서드를 자식클래스에서 재정의하는 문법
 *  - 오버라이드 기능을 통해서 객체지향 프로그래밍의 다형성을 구현
 */

class AAA {
	public void method1() {
		System.out.println("AAA::method1...");
	}

	public void method2() {
		System.out.println("AAA::method2...");
	}

	// Overload
	public void method3() {
		System.out.println("AAA::method3...");
	}
}

class BBB extends AAA {
	@Override
	public void method2() {
		System.out.println("BBB::method2...");
	}

	// Overload
	public void method3(int a) {
		System.out.println("BBB::method3...");
	}
}

class CCC extends BBB {
	@Override
	public void method1() {
		System.out.println("CCC::method1...");
	}

	@Override
	public void method2() {
		System.out.println("CCC::method2...");
	}

	// Overload
	public void method3(int a, int b) {
		System.out.println("CCC::method3...");
	}
}

public class OverrideTest {
	public static void main(String[] args) {

		// 오버라이드 메서드 호출
		CCC c = new CCC();

		c.method1(); // 메서드1 호출 시 ccc, aaa 둘다 있음 -> ccc가 먼저이므로 ccc 부터 출력.
		c.method2(); // 메서드2는 bbb가 aaa의 메서드2를 오버라이드 해서 ccc의 메서드2 출력
		c.method3(); // aaa, bbb, ccc의 메서드3은 매개변수가 각각 다름. 오버라이드가 아니라 '오버로드'!!.
		c.method3(1); //
		c.method3(1, 2);

		// Car 상속객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "남색", 0, 0);

		sonata.speedUp(80); // Sedan 에서 작성한 문구가 오버라이드 되어서 결과는 + 20 되어 나옴.
		sonata.show();

		bongo.speedUp(80); // Truck 에서 작성한 문구가 오버라이드 되어서 결과는 - 20 되어 나옴.
		bongo.show();
	}
}

// ccc			 ->  	   bbb			-> 			aaa			순서대로 움직임.
//method1()										  method1()			
//method2()				method2()				  method2()
//method3(int, int)		method3(int)			  method3()
 