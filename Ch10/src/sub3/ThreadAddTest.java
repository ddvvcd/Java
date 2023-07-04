package sub3; 
/*
 * 날짜 : 2023/07/03
 * 이름 : 박성용
 * 내용 : Java Thread 활용 실습하기
 * 
 */
public class ThreadAddTest {
	public static void main(String[] args) throws InterruptedException {
		
		// Runnable 인터페이스를 구현한 클래스
		AddThread at1 = new AddThread(1, 50);	//1 ~ 50까지의 합
		AddThread at2 = new AddThread(51, 100);	//51 ~ 100까지의 합
		
		// Runnable 구현클래스를 Thread 객체로 생성
		Thread t1 = new Thread(at1); //AddThread는 인터페이스 때문에 at1은 단독 실행 불가하므로 
		Thread t2 = new Thread(at2); //스레드 객체를 만들어서 호출
		
		// 스레드 실행
		t1.start();
		t2.start();
		
		// 스레드 대기(다른 스레드(=자식 스레드) 종료를 대기)
		t1.join(); //join 안 넣으면 값이 0으로 나옴
		t2.join(); //join 넣어서 차례대로 진입시킴
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		
		int total = tot1 + tot2;
		System.out.println("total : " + total);
	}
}
