package sub8;

/*
 * 날짜 : 2023/06/22
 * 이름 : 박성용
 * 내용 : Java 추상클래스 실습하기
 *
 * 추상클래스(Abstract Class)
 *  - 일반 클래스를 정의하기 위한 기본 틀을 제공하는 클래스
 *  - 추상클래스를 상속 받아 자식클래스에서 미완성 메서드(추상메서드)를 완성 (오버라이드 해서 완성), 다형성 활용
 *
 */

public class AbstractTest {
	
	public static void main(String[] args) {
		
		// 추상클래스 객체 생성할 수 없음
		//Car car = new Car("", "", 0); //Car의 생성자랑 같게 객체 입력.
		
		Car sonata = new Sedan("소나타", "흰색", 0, 2000); //Sedan 생성자와 같게 입력
		sonata.speedUp(100);							// Sedan 을 Car로 변경 입력 -> 다형성
		sonata.speedDown(20);
		sonata.show();
		
		
		Car bongo = new Truck("봉고", "남색", 0, 0); //Truck 생성자와 같게 입력
		bongo.speedUp(80);						// Truck 을 Car로 변경 입력 -> 다형성
		bongo.speedDown(60);
		bongo.show();
	}
	
	
}
