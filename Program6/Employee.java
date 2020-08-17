package assign;

public class Employee {
		int year;
		String name,address;
		Employee(String name,int year, String address){
			this.year = year;
			this.name = name;
			this.address = address;
		}
		
		void Print() {
			System.out.println(name +"   " + year + "     " + address+"/n");
            
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new  Employee("Robert",1994,"64C-WallStreet") ;
		Employee e2 = new  Employee("Sam",2000,"68D-WallStreet") ;
		Employee e3 = new  Employee("John",1999,"26B-WallStreet") ;
		System.out.println("Name:  " + "Year of Joining:  " + "  Address         ");
		e1.Print();
		e2.Print();
		e3.Print();
	}

}
