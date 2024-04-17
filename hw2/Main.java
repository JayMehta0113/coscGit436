public class Main {
    public static void main(String[] args) {
        // Creating a FullTimeEmployee object
        FullTimeEmployee employee = new FullTimeEmployee("EMPLOYEE 1", 50000.0);
        
        // Using methods defined in the Employee interface
        System.out.println("Employee ID: " + employee.getEmployeeID()); // Demonstrating getEmployeeID method
        System.out.println("Salary: $" + employee.getSalary()); // Demonstrating getSalary method
        
        // Modifying employee data using methods defined in the Employee interface
        employee.setSalary(55000.0); // Demonstrating setSalary method
        System.out.println("Updated salary: $" + employee.getSalary());
    }
}
