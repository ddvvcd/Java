package test3;


/*
 * 날짜 : 2023/06/23
 * 이름 : 박성용
 * 내용 : 싱글톤 객체 연습문제
 */

class Vehicle {
	private String name; //필드 선언
	private int price;

	public Vehicle(String name, int price) { //생성자 선언
		this.name = name;
		this.price = price;
	}

	public void info() { //메소드 선언
		System.out.println("==============");
		System.out.println("차량명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("---------------");
	}
}

class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price);
	} //Vehicle을 리턴값 -> 위에는 Vehicle을 입력
}


public class Test05 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance(); //CarFactory가 싱글톤 객체이므로 new 못 씀
														
		Vehicle avante = factory.createCar("아반떼", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}
}
