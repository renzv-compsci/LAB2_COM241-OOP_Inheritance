/* Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that 
 * overrides the work() methods and adds a new method called addEmployee.*/

 class Employee {
    public void work(){
        System.out.println("The employee is working 8 hrs");
    }

    public void getSalary(double workHrs, double salaryperHr){
        double totalSalary = workHrs * salaryperHr;
        System.out.println("Total Salary: " + totalSalary);
    }
}

class HRManager extends Employee {
    @Override
    public void work(){
        System.out.println("The HRManager is working 12 hrs");
    }

    public void addEmployee(){
        System.out.println("New employee: Renz Viloria");
    }
}

public class employeeTest {
    public static void main (String[]args){
        Employee emp = new Employee();
        HRManager hr = new HRManager();

        emp.work();
        emp.getSalary(8, 150);

        hr.work(); 
        hr.addEmployee();
    }
}