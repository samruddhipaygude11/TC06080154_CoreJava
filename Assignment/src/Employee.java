public class Employee {
    private static int totalEmployees = 0;
    private static double totalSalary = 0;

    private int empNo;
    private double salary;

    // Parameterized constructor
    public Employee(double salary) {
        this.empNo = ++totalEmployees;
        this.salary = salary;
        totalSalary += salary;
    }

    // Class method to display total employees and totalSalary
    public static void displayTotals() {
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Salary: $" + totalSalary);
    }

    // Other methods or getters as needed

    public int getEmpNo() {
        return empNo;
    }

    public double getSalary() {
        return salary;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating employees
        Employee emp1 = new Employee(50000);
        Employee emp2 = new Employee(60000);

        // Displaying totals
        Employee.displayTotals();
    }
}
