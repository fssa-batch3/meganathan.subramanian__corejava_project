package day03.practice;


// create a new class called Employee
class Employee {
	 
    private int id; // set the id in private
    private String name; // Declare the Employee name as Private
 
    
    public Employee(int employeeid, String employeename) {
        this.id = employeeid;
        System.out.printf("Employee Id: %d ", id);
        
        this.name = employeename;
        System.out.printf("Employee Name: %s\n", name);
    }
}

public class ContructEmployee {

	public static void main(String[] args) {
		
		 Employee e1 = new Employee(1, "meganathan");
		 Employee e2 = new Employee(2, "Dinesh");
		 
	}
}