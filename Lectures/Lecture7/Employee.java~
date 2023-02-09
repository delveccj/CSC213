public class Employee {
	/* Exercise 5 Comment out the immediate next two and then uncomment the others*/
    //private String name;
    //private double salary;
    private String name = "N/A";
    private double salary = 0;
    /* Exercise 6  Lets see what happens when we make it final ... */
    //private final double salary = 0;

    private static int lastId = 0;
    private int id;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        lastId++;
        id = lastId;
    }
    
    public int getId(){
    	return id;
    }
    
    public Employee(double salary){
    	/* Exercise3 - comment out these two lines and enable the one right below them */
    	this.name = "";
    	this.salary = salary;
    	//this("", salary);
    	/* Exercise 4 - lets do something that throws an error or exception.
    	Uncomment the below
    	*/
    	//this.name = null;
    }

    public static Employee getUnnamedEmployee(double salary){
    	return new Employee(salary);
    }


    
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;    
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void replaceWithZombie(Employee employee){
    	employee = new Employee("", 0);
    }
}

