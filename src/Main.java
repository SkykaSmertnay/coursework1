import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EmployeeBook employeeBook = new EmployeeBook();
        EmployeeBook.initEmployees();
        employeeBook.printEmpl();
        System.out.println("Сумма затрат на ЗП = " + employeeBook.allSalary());
        employeeBook.minSalaryEmployee();
        employeeBook.maxSalaryEmployee();
        System.out.println("Среняя ЗП = " + employeeBook.averageSalary());
        employeeBook.printAllFullNames();
        employeeBook.salaryIndexation(5.5f);
        System.out.println("Сумма затрат на ЗП = " + employeeBook.allSalary());
        employeeBook.minSalaryEmployeeDepartment(1);
        employeeBook.maxSalaryEmployeeDepartment(1);
        int departmentNumber;
        System.out.println("Введите номер отдела 1-5: ");
        departmentNumber = scan.nextInt();

        System.out.println("Сумма затрат на ЗП в отделе №" + departmentNumber + " " +  employeeBook.allSalaryDepartment(departmentNumber));
        System.out.println("Среняя ЗП в отделе №"+ departmentNumber + " = " + employeeBook.averageSalaryDepartment(departmentNumber));
        Employee newEmpl = new Employee("Саморуков Валентин Владимирович", 2, 80_000);
        employeeBook.deleteEmployee(7);
        System.out.println(employeeBook.addNewEmployee(newEmpl));
        employeeBook.deleteEmployee(3);
        employeeBook.printEmpl();

    }






}