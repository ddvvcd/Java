package sub3;

	public class Class {

		//필드(속성)
		private String name;
		private String color;
		private int speed;
		
		// 클래스변수(정적변수)
		public static int count;
		
		// 생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
		public Class(String name, String color, int speed) {
			this.name = name;
			this.color = color;
			this.speed = speed;
			count ++;
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