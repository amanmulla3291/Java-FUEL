package Encapsulation1;

public class Test {
    public static void main(String[] args) {
        // Creating an object of Emp class
        Emp employee = new Emp();

        // Setting values using the setter method with validation
        employee.SetEmp(1, "Suchit", 50000, "Software Developer");
        //employee.SetEmp(2, "John Doe", 10000, "Manager");

        // Getting values using getter methods
        System.out.println("Employee ID: " + employee.GetEmpId());
        System.out.println("Employee Name: " + employee.GetEmpName());
        System.out.println("Employee Salary: " + employee.GetEmpSalary());
        System.out.println("Employee Job Role: " + employee.GetEmpJobRole());

        // Trying to set an invalid salary

    }
}
