package sub6;

public class Car {

	// private에서 protected로 접근권한 변경해서 자식클래스 참조
	protected String name;
	protected String color;
	protected int speed;
	
	// 생성자 : 캡슐화된 속성을 초기화하기 위한 메서드 
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	// 메서드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
}