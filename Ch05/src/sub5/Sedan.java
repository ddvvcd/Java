package sub5;

public class Sedan extends Car{ //Car(부모) 불러옴?

	private int cc;
	
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc; //세단(자식) 초기화
	}
	
	public void speedTurbo() {
		this.speed += 20; //speed는 부모님 것 -> sedan(자식)이 상속 받음
						  // 그냥 speed 입력하면 sedan 클래스에서는 참조가 안 되어서 오류.
	}					  // (Car)(부모)private에서 protected로 접근권한 변경해서 자식클래스 참조
	
	public void show() {
		
		super.show(); //super : 부모클래스를 지칭함.
		System.out.println("배기량 : " + this.cc);
	}
	
	
	
}
