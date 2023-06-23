package sub8;

public class Sedan extends Car{
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	

	
	
	public void speedTurbo() {
		this.speed += 20;
	}
	
	public void show() {
		
		super.show();
		System.out.println("배기량 : " + this.cc);
	}




	@Override //추상메서드 오버라이드 (1)
	public void speedUp(int speed) {
		this.speed += speed; //입력해서 완성함(2)
	}




	@Override //추상메서드 오버라이드 (1)
	public void speedDown(int speed) {
		this.speed -= speed; //입력해서 완성함(2)
	}
}
