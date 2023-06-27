package sub1;

public class Apple { //Object 클래스에 상속받고 있음

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override //부모의 메서드를 자식에서 재정의 (Object 클래스에서 상속받고 있음)
	public String toString() { //개체의 속성을 출력
		
		System.out.println("객체 해시값 : " + hashCode());
		System.out.println("원산지 : " + this.country);
		System.out.println("가격 : " + this.price);
		return super.toString();
	}
	
}
