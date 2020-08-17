package assign;

import java.util.Scanner;

class Rectangle {
	int width,height;
	void display() {
		System.out.println(width+" "+height);
	}

}

class RectangleArea extends Rectangle
{
	@Override
	void display() {
		super.display();
		System.out.println(width*height);
	}
	
	void read_input() {
		Scanner s = new Scanner(System.in);
		width = s.nextInt();
		height = s.nextInt();
		
		s.close();
	}
	
}

public class rec {
	public static void main(String []args) {
		RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.read_input();
        rectangleArea.display();
	}
}
