import java.time.*;

public class EmployeeDemo {
	
	
	    /* Exercise 8
	    Static initializer - used a bunch
	    */
        
	/*
	static{
		System.out.println("----------------------------");
		System.out.println("Exercise 8");
		int year = LocalDate.now().getYear();
		System.out.println("Examples used from book published in 2022.  They are " + (year - 2022) + " year old.");
		System.out.println("Note the example of where this is being printed!");
	}
	*/
	

	
    public static void main(String[] args) {
    	System.out.println("----------------------------");

        var fred = new Employee("Fred", 50000);
        fred.raiseSalary(10);
        System.out.println(fred.getName());
        System.out.println(fred.getSalary());

        var rue = new Employee("Rue", 50000);
        rue.raiseSalary(0);
        System.out.println(rue.getName());
        System.out.println(rue.getSalary());
    
        /* Exercise 1
        So, this won't work!
        */
        
        System.out.println("----------------------------");
        System.out.println("Exercise 1");

        fred.replaceWithZombie(rue);
        /* Rue ... what is your salary! */
        System.out.println("Rue, what is your new salary!");
        System.out.println(rue.getSalary());
        
        /* Exercise 2
        Obvious ..
        */
        
        System.out.println("----------------------------");
        System.out.println("Exercise 2");
        Employee unknown = new Employee(100000);
        System.out.println("New employee name is: <" + unknown.getName() + ">");
        if(! unknown.getName().equals("Andre")){
        	System.out.println("Whew, we did not hire Andre!");
        }
        
     
        /* Exercise 7
        Ok, why does this print out the value it does. 
        There is only a 'fred' and 'Rue' instance.
        */
        
        //System.out.println("----------------------------");
        //System.out.println("Exercise 7");
        
        /* This will lead to a compile error! */
        //Employee newEmployee = new Employee();
        /* This will not lead to a compile error! */
        //Employee newEmployee = new Employee("Newbie", 200000);

        //System.out.println("New employee id should be 3 - right? Why is it: " + newEmployee.getId());
        
    }
}
