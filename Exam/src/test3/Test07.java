package test3;


class Customer {
	protected int id; //자식에서 부모에게 참조 : protected (VipCustomer -> Customer)
	protected String name; //본인 내부에서 참조 : private
	protected String grade; //외부에서 참조 : public
	protected int point;
	protected double pointRatio; //필드 선언, protected : 클래스 내부에서만 참조 가능 (1)
		
	
	public Customer(int id, String name) { //생성자 선언, 외부에서 참조 : public (어디서든 참조 가능) (2)
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}

	public int calcPrice(int price) { //메소드 선언 (3)
		point += price * pointRatio;
		return price;
	}
	
	public void showInfo() { //메소드 선언 (4)
		System.out.println("======================");
		System.out.println("고객번호 : " + id);
		System.out.println("고객이름 : " + name);
		System.out.println("고객등급 : " + grade);
		System.out.println("현재 포인트 : " + point);
		System.out.println("포인트 적립율 : " + pointRatio);
		System.out.println("-------------------------");
	}
}

class VipCustomer extends Customer { //오버라이드에 calcPrice 가 있으므로 부모가 Customer
	
	private double saleRatio; //필드 선언 (double saleRatio 필드 선언)
	
	public VipCustomer(int id, String name) { //필드 선언 
		super(id, name);
		super.grade = "VIP";
		super.point = 1000;
		super.pointRatio = 0.05;
		this.saleRatio = 0.1;
		
	}

	@Override
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price - (int)(price * saleRatio);
	}
	
	
}


public class Test07 {
	public static void main(String[] args) {
		Customer	kim = new Customer(1001, "김춘추");
		VipCustomer lee = new VipCustomer(1002, "이순신");
		
		System.out.println("김춘추님이 지불할 금액 : " + kim.calcPrice(10000));
		System.out.println("이순신님이 지불할 금액 : " + lee.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
	}
}
