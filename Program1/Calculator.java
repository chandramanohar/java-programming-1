package assign;

public class Calculator {
	interface Addable{  
	    void add(int a,int b);
	} 
	interface Sub
	{
		void difference(int a, int b);
	}
	
	interface Mult
	{
	void product(int a, int b);
	};
	
	interface Div
	{
	void SafeDivision(float a, float b);
	};
	
	public static void main(String[] args ){
		// TODO Auto-generated method stub
		Addable ad=(a,b)->System.out.println(a+b);
		Sub s =( a, b)-> System.out.println(a-b);
		Mult m =(a,b)->System.out.println(a*b);
		Div d =(a,b)->{
			try{
                if (b==0) 
                	{throw new ArithmeticException();}
                else System.out.println(a/b);
            }catch (ArithmeticException e){
                System.out.println("denominator cannot be zero");
            }
		};
		ad.add(1, 2);
		s.difference(1, 2);
		m.product(1,2);
		d.SafeDivision(1f, 2f);
		d.SafeDivision(1f,0);
		
	}

}
