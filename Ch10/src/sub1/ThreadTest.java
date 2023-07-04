package sub1;

/*
 * 
 * 날짜 : 2023/07/03
 * 이름 : 박성용
 * 내용 : Java Thread 실습하기
 * 
 * 스레드 (Thread)
 *  - 하나의 프로세스 안에서 실행되는 프로그램 실행흐름
 *  - 스레드는 동시에 실행되는 병행 실행 (아래의 예제문 확인)
 *  - Thread 클래스를 상속 받아 start 실행
 */
public class ThreadTest {

	public static void main(String[] args) { //main 스레드 -> run() -> for() 10번 실행 -> 
		
		// 스레드 객체 생성(1)
		SubThread st1 = new SubThread("Sub1");
		SubThread st2 = new SubThread("Sub2");
		
		// 자식 스레드로 실행(2)
		st1.start(); 	//run() -> start()로 변경 : main thread 부터 실행됨. -> sub2, sub1 병행(=동시) 실행 됨.
					 	//메인스레드 10번 실행 -> sub1 10번 실행 -> sub2 10번 실행 (for문 2개가 동시에 실행)(=병행 실행)
		st2.start();
		
		for(int i = 0; i < 10; i++) {
			
			try {
				// 1초 대기(3)
				Thread.sleep(1000); // 스레드를 잠시 재운다(멈춘다) (sleep)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main Thread 실행...");
		}
		
			System.out.println("Main Thread 종료...");
	}
}
