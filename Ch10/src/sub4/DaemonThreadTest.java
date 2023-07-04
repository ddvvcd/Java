package sub4;
/*
 * 날짜 : 2023/07/03
 * 이름 : 박성용
 * 내용 : Java DaemonThread 활용 실습하기
 * 
 * 데몬스레드(Daemon Thread) 
 *  - 메인스레드를 보조하는 보조스레드
 *  - 메인스레드가 종료되면 데몬스레드도 같이 종료
 *  
 */
public class DaemonThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		SubThread st = new SubThread();
		st.setDaemon(true); //데몬스레드 설정 (설정 안 하면 보조 스레드가 무한 반복 됨)
		
		st.start();
		
		for(int i=1; i<=10; i++) { //10번 반복
			
			Thread.sleep(1000); //1초에 1번씩 실행
			
			System.out.println("MainThread 실행...");
		}
		
		System.out.println("프로그램 종료...");
		
	}
}
