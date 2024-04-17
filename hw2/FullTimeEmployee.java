public class FullTimeEmployee extends AbstractEmployee {

    // Constructor to initialize the employee ID and salary
    public FullTimeEmployee(String employeeID, double salary) {
        super(employeeID, salary); // Call to the constructor of the superclass
    }
    
    // Implementation of the calculateBonus method from the AbstractEmployee abstract class
    public double calculateBonus() {
        // For full-time employees, bonus is 10% of the salary
        return getSalary() * 0.10;
    }
}

