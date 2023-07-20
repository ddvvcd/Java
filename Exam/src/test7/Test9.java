package test7;


interface Tv{
	public void turnOn();
	public void turnOff();
	
}


public class Test9 {
	public static void main(String[] args) {
		
		Tv tv = new Tv() {

			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Tv를 끕니다.");
			}
		}; //객체 생성 후 바로 구현 -> 인터페이스
		
		tv.turnOn();
		tv.turnOff();
		
	}
}
