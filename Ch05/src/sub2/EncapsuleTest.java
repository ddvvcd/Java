package sub2;

/**
 * 날짜 : 2023/06/19
 * 이름 : 박성용
 * 내용 : Java 캡슐화 실습하기
 * 
 * 캡슐화(정보은닉, Encapsulation)
 *   - 캡슐화는 객체의 속성을 외부에 참조하지 못하게 객체의 정보(속성)를 은닉하는 특성
 *   - 클래스의 속성은 반드시 private 선언을 통해 캡슐화
 *   - private 속성의 초기화를 위해 생성자 정의(Constructor) 정의
 *   - 은닉된 정보의 안전한 사용을 위해서 Getter, Setter 제공
 */


public class EncapsuleTest {
	
	public static void main(String[] args) {
		
		// Car 객체 생성 초기화
		Car sonata = new Car("소나타", "흰색", 10);
		sonata.setName("그랜져");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show(); //-> 소나타가 그랜져로 출력
		
		// name ~ speed : 외부에 보여지면 안 되는 자료이기 때문에 캡슐화 해야 함. -> car 클래스로 이동 후 private 입력
		// private 입력하게 되면 name, clolr, speed 가 은닉되어 있음 (빨간줄 오류)
		// sonata.name = "소나타"; 
		// sonata.color = "흰색";
		// sonata.speed = 10; 
		// -> 위 3개는 new Car("소나타", "흰색", 10)으로 지정
		
		// 결과는 같게 나오지만 필드는 외부에서 보이지 않음
		
		// Car 객체 생성 초기화
		Car avante = new Car("아반테", "검은색", 10);
		avante.setColor("남색");
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show(); // -> 검은색이 남색으로 출력
		
		
		// Account 객체 생성 초기화
		Account kb = new Account ("국민은행", "101-12-1001", "김유신", 10000) ;
		kb.deposit(40000);
		kb.withdraw(25000);
		kb.show();
		
		// Account 객체 생성 초기화
		Account wr = new Account("우리은행", "101-11-1002", "김춘추", 1000);
		wr.deposit(30000);
		wr.withdraw(5000);
		wr.show();
	}
}
