package assign;

import java.util.Scanner;
import java.lang.Math.*;
public class Triangle {
	double area(double a, double b, double c) {
		double s = (a+b+c)/2;
		return(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		a = Double.parseDouble(sc.nextLine());
		b = Double.parseDouble(sc.nextLine());
		c = Double.parseDouble(sc.nextLine());
		double are =t.area(a, b, c);
		System.out.println(are);
	}

}
