package assign;
import java.util.Scanner;
public class Excep extends Exception{
	
	<T>void method(T in) {
		 String s = in.toString();
		try {
			Double d = Double.parseDouble(s);
            System.out.println(d*(0.66666667));
            }
            catch (Exception e)
            {
            System.out.println("Exception caught "+e.toString());
            }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excep e = new Excep();
		Scanner sc = new Scanner(System.in);
		e.method(sc.nextLine());
		 
		 
	}

}
