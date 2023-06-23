package sub6;

public class Truck extends Car{

	private int capacity;
	
	public Truck(String name, String color, int speed, int capacity) { //int capacity는 추가 해줌
		super(name, color, speed);	//name, color, speed는 Car(부모)에게서 가져온 것
		this.capacity=capacity;
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	@Override
	public void speedUp(int speed) {
		
		this.speed += speed - 20;
	}
	
	public void show() {
		super.show();
		System.out.println("적재량 : " + this.capacity);
	}
	
}
