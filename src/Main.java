import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EmployeeBook employeeBook = new EmployeeBook();
        EmployeeBook.initEmployees();
        EmployeeBook.printEmpl();
        System.out.println("Сумма затрат на ЗП = " + EmployeeBook.allSalary());
        EmployeeBook.minSalaryEmployee();
        EmployeeBook.maxSalaryEmployee();
        System.out.println("Среняя ЗП = " + EmployeeBook.averageSalary());
        EmployeeBook.printAllFullNames();
        EmployeeBook.salaryIndexation(5.5f);
        System.out.println("Сумма затрат на ЗП = " + EmployeeBook.allSalary());
        EmployeeBook.minSalaryEmployeeDepartment(1);
        EmployeeBook.maxSalaryEmployeeDepartment(1);
        int departmentNumber;
        System.out.println("Введите номер отдела 1-5: ");
        departmentNumber = scan.nextInt();

        System.out.println("Сумма затрат на ЗП в отделе №" + departmentNumber + " " +  EmployeeBook.allSalaryDepartment(departmentNumber));
        System.out.println("Среняя ЗП в отделе №"+ departmentNumber + " = " + EmployeeBook.averageSalaryDepartment(departmentNumber));


    }






}