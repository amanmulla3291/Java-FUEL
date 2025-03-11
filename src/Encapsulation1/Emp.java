package Encapsulation1;

public class Emp {
    private int EmpId;
    private String EmpName;
    private double EmpSalary;
    private String EmpJobRole;

    // Setter method with validation
    public void SetEmp(int EmpId, String EmpName, double EmpSalary, String EmpJobRole){
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmpJobRole = EmpJobRole;

        if (EmpSalary > 0) {
            this.EmpSalary = EmpSalary;
        } else {
            System.out.println("Invalid Salary entered!");
        }
    }

    // Getter methods for all fields
    public int GetEmpId() {
        return EmpId;
    }

    public String GetEmpName() {
        return EmpName;
    }

    public double GetEmpSalary() {
        return EmpSalary;
    }

    public String GetEmpJobRole() {
        return EmpJobRole;
    }
}
