package assign;
import java.util.*;
public class Employee {
	int empId,empSalary;
	String empName, empDesignation, empLocation;
	Employee(int empId, String empName, String empDesignation, int empSalary, String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

	  int getempId() {
         return empId;
     }
      void setempId(int empId) {
         this.empId = empId;
     }

      int getempSalary() {
         return empSalary;
     }

      void setempSalary(int empSalary) {
         this.empSalary = empSalary;
     }

      String getempName() {
         return empName;
     }

      void setempName(String empName) {
         this.empName = empName;
     }

      String getempDesignation() {
         return empDesignation;
     }

      void setempDesignation(String empDesignation) {
         this.empDesignation = empDesignation;
     }

      String getempLocation() {
         return empLocation;
     }

      void setempLocation(String empLocation) {
         this.empLocation = empLocation;
     }
   
      public static void main(String []args) {
    	  ArrayList<Employee> e = new ArrayList<>();
          e.add(new Employee(1,"bob","junior programmer",90000,"Guntur"));
          e.add(new Employee(2,"james","analystE",85000,"vijayawada"));
          e.add(new Employee(3,"nox","CEO",145000,"Mundregetu"));
          e.add(new Employee(4,"keplelr","ownerE",145000,"Andhra Pradesh"));
          e.add(new Employee(5,"deva","EntyE",145000,"Madhapur"));
          e.add(new Employee(6,"gopal","senior",55000,"louhbh"));
          e.add(new Employee(7,"raja","Edaeg",70000,"Newburgh"));
          e.add(new Employee(8,"ashok","EmployE",45000,"Minknjn"));
          e.add(new Employee(9,"kush","vy",50000,"moji"));
          e.add(new Employee(10,"vyu","Assistant",32000,"Wuhan"));
    	  System.out.println("Names of all employees");
          e.stream().forEach(e1->{
              System.out.println(e1.getempName());
          });
          System.out.println("All salaries greater than 50,000/-");
        
          e.stream().filter(e1->e1.getempSalary()>50000).forEach(e1->{
        	  System.out.println(e1.getempName() + " "+ e1.getempSalary());
          });
          System.out.println("All locations starting with letter 'M'");
          
          e.stream().filter(e1->e1.getempLocation().startsWith("M")).forEach(e1->{
        	  System.out.println(String.format("Name : %s , Location : %s",e1.getempName(),e1.getempLocation()));
          });
          
          System.out.println("All designations ending with 'E'");
          e.stream().filter(e1->e1.getempDesignation().endsWith("E")).forEach(e1->{
              System.out.println(String.format("Name : %s , Designation : %s",e1.getempName(),e1.getempDesignation()));

          });
      }
	}