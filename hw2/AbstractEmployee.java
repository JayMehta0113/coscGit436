abstract class AbstractEmployee implements Employee {
    private String employeeID;
    private double salary;
    
    // Constructor to initialize the employee ID and salary
    public AbstractEmployee(String employeeID, double salary) {
        this.employeeID = employeeID;
        this.salary = salary;
    }
    
    // Implementation of the getEmployeeID method from the Employee interface
    public String getEmployeeID() {
        return employeeID;
    }
    
    // Implementation of the getSalary method from the Employee interface
    public double getSalary() {
        return salary;
    }
    
    // Implementation of the setEmployeeID method from the Employee interface
    public void setEmployeeID(String id) {
        this.employeeID = id;
    }
    
    // Implementation of the setSalary method from the Employee interface
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

