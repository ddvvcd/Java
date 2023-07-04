package sub1;

public class SubThread extends Thread{ 
	
	private String name;
	
	public SubThread(String name) {
	this.name = name;
	}
	
	@Override // 부모클래스(Thread)의 메서드를 재정의
	public void run() {
	
		for(int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000); //스레드를 잠시 재운다(멈춘다) (sleep)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name + "스레드 실행...");
			
		}
	
		System.out.println(name + "스레드 종료...");
		
	}
}
