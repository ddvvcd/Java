package sub2;

public class Count {
	
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// 동기화 블럭 : 스레드간의 경합을 막고 동기방식으로 실행하기 위한 블럭
	public synchronized void setNum() {		 // synchronized : 동기화 / 하나의 스레드만 진입가능하도록 설정
		this.num ++;		   				// 스레드 1, 2, 3 의 순서를 설정해줌
	} 										// 잠금을 걸어서 다른 스레드가 참초를 못하게 함
	
}
