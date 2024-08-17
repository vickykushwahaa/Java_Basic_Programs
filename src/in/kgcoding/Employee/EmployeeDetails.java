package in.kgcoding.Employee;

public class EmployeeDetails {
    public static void main(String[] args) {
        employee emp=new employee("Vicky",20,10000);
        System.out.println(emp.employeeDetails());
        emp.setName("hello");
        System.out.println(emp.employeeDetails());

    }
}
