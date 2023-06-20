package sub3;

/**
 * 날짜 : 2023/06/20
 * 이름 : 박성용
 * 내용 : 클래스 변수, 클래서 메서드 실습하기 
 */

public class Car {
	//필드(속성)
	private String name;
	private String color;
	private int speed;
	
	// 클래스변수(정적변수)
	public static int count;
	
	// 생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name, String color, int speed) {
		
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	// 클래스 메서드(정적메서드)
	public static int getCount() {
		return count;
	}
	
	
	// 메서드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}

	public void show () {
		System.out.println("차량명 : " + this.name);
		System.out.println("색상 : " + this.color);
		System.out.println("속도 : " + this.speed);

	}
}