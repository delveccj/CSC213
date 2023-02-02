public class EmployeeDemo {
    public static void main(String[] args) {
        var fred = new Employee("Fred", 50000);
        fred.raiseSalary(10);
        System.out.println(fred.getName());
        System.out.println(fred.getSalary());

        var rue = new Employee("Rue", 50000);
        rue.raiseSalary(0);
        System.out.println(rue.getName());
        System.out.println(rue.getSalary());
    
        // Exercise 3
        // Enable the code below and compile.
        // You will get a compile time error!
        // Then, got to the Employee.java and change 
        // the visibility of the instance variables from
        // private to public.
        // Recompile both classes - what happens?
        //System.out.println("It will only print these when their access is public!");
        //System.out.println(rue.name);
        //System.out.println(rue.salary);

    }
}
