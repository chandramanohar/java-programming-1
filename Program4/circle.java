package assign;

public class circle {
	private double radius =1.0;
	private String color = "red";
	circle(){
		
	}
	circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle();
		circle c1 = new circle(5.2);
		System.out.println("default constructor");
		System.out.println("Radius: " +c.getRadius());
		System.out.println("Area:  "+c.getArea());
		System.out.println("parameterized constructor");
		System.out.println("Radius: "+c1.getRadius());
		System.out.println("Area  "+c1.getArea());
		
	}

}
