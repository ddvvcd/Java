package test3;


class Rent {
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}

class Landload extends Rent{ //Landload 클래스에 payment 클래스를 상속시켜 기능을 가져옴(1)
	public void getMoney() { //메소드 선언 (이렇게 동작할 것이라고 선언) (2)
		System.out.println("건물주 입니다."); // 이렇게 출력한다는 동작 입력(3)
		payment(); //Rent 클래스의 payment 메소드를 가져옴(4)
	}
}

public class Test06 {
	public static void main(String[] args) {
		Landload master = new Landload(); //Landload 클래스의 기능을 가져옴? (5)
		master.getMoney(); //결과값 출력을 위해 메소드를 입력(6)
	}
}
