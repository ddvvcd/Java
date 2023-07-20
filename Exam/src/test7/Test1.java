package test7;


class Box{
	
	private double width;
	private double height;
	private double depth;
	
	public Box(double width, double height, double depth) {
		//super(); -> 부모객체는 Object
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	public double volume() { //필드의 타입이 double 
		return width * height * depth; //메소드 타입도 double
	}
}

public class Test1 {
	public static void main(String[] args) {
		
		Box box1 = new Box(1, 2, 3);
		Box box2 = new Box(3, 6, 9);
		
		System.out.println("box1 부피 : " + box1.volume());
 		System.out.println("box2 부피 : " + box2.volume());
	}
}
