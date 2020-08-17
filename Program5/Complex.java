package assign;

import java.util.Scanner;
public class Complex {
	
	void sum(double a, double b, double c, double d) {
		double r,i;
		r=a+c;
		i=b+d;
		System.out.println(r+"+("+i+")i");
	}
	
	void difference(double a, double b, double c, double d) {
		double r,i;
		r=a-c;
		i=b-d;
		System.out.println(r+"+("+i+")i");
	}
	
	void product(double a, double b, double c, double d) {
		double r,i;
		r=a*c-(b*d);
		i=a*d+(b*c);
		System.out.println(r+"+("+i+")i");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex cm = new Complex();
		Scanner sc = new Scanner(System.in);
		double real1,img1,real2,img2;
		System.out.println("Enter the real value \n");
		real1 = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the imaginary value \n");
		img1 = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the real value \n");
		real2 = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the imaginary value \n");
		img2 = Double.parseDouble(sc.nextLine());
		sc.close();
		cm.sum(real1,img1,real2,img2);
		cm.difference(real1,img1,real2,img2);
		cm.product(real1,img1,real2,img2);
	}

}
