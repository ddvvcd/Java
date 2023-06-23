package sub8;

public abstract class Car { //추상클래스 (하나 이상의 추상메서드를 갖는 클래스)(abstract) (옆에 A 마크가 생김)

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
		
		// 추상메서드(기능이 아직 구현 안 된 메서드)(abstract)
		public abstract void speedUp(int speed); 
		public abstract void speedDown(int speed); 

		
		public void show() {
			System.out.println("차량명 : " + this.name);
			System.out.println("차량색 : " + this.color);
			System.out.println("현재속도 : " + this.speed);
		}
	
	
	
}
