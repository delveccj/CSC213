package edu.canisius.csc.lsp;

public class Employee implements Comparable<Employee>{
	
	public int compareTo(Employee other){
		return Double.compare(salary, other.salary);
	}
	
	static{
		System.out.println("____");
		System.out.println("Which one is loaded first - Employee or EmployeeDemo");
	}
    private String name = "N/A";
    private double salary = 0;

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
    	this("", salary);
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

