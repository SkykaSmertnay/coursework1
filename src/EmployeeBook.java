import java.util.Random;

public class EmployeeBook {
    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Иван", "Олег", "Семён", "Борис", "Андрей", "Михаил", "Павел"};
    private final static String[] SURNAMES = {"Иванов", "Олегов", "Семёнов", "Борисов", "Андреев", "Михаилов", "Павлов"};
    private final static String[] PATRONYMIC_NAMES = {"Иванович", "Олегович", "Семёнович", "Борисович", "Андреевич", "Михайлович", "Павлович"};

    private static Employee[] employeesList = new Employee[10];

    public static void initEmployees() {
        for (int i = 0; i < employeesList.length; i++) {
            String fullName = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)] + " " + NAMES[RANDOM.nextInt(0, NAMES.length)] + " " + PATRONYMIC_NAMES[RANDOM.nextInt(0, PATRONYMIC_NAMES.length)];
            employeesList[i] = new Employee(fullName, RANDOM.nextInt(1,6), RANDOM.nextInt(50_000,100_000));
        }
    }
    public  void printEmpl() {
        for (Employee employee : employeesList) {
            System.out.println(employee);
        }
    }
    public  int allSalary() {
        int total = 0;
        for (Employee employee : employeesList) {
            total = total + employee.getSalary();
        }
        return total;
    }
    public  void minSalaryEmployee() {
        Employee minSalaryEmploee = new Employee("Такой-то Такой-то", 1,1_000_000 );

        for (Employee employee : employeesList) {
            if (employee.getSalary() < minSalaryEmploee.getSalary() ) {
                minSalaryEmploee = employee;
            }

        }
        System.out.println("Сотрудник с минимальной ЗП - " + minSalaryEmploee);
    }
    public  void maxSalaryEmployee() {
        Employee maxnSalaryEmploee = new Employee("Такой-то Такой-то", 1,0 );

        for (Employee employee : employeesList) {
            if (employee.getSalary() > maxnSalaryEmploee.getSalary() ) {
                maxnSalaryEmploee = employee;
            }

        }
        System.out.println("Сотрудник с максимальной ЗП - " + maxnSalaryEmploee);
    }

    public  float averageSalary() {
        float averageSalary;
        averageSalary = (float)(allSalary() / employeesList.length);
        return averageSalary;
    }

    public  void printAllFullNames() {
        for (Employee employee : employeesList) {
            System.out.println(employee.getFullName());
        }
    }

    public  void salaryIndexation(float increasePercent) {
        int newSalary;
        increasePercent = (increasePercent / 100 + 1);
        for (Employee employee : employeesList) {
            newSalary = (int) (employee.getSalary() * increasePercent);
            employee.setSalary(newSalary);
        }

    }

    public  void minSalaryEmployeeDepartment(int departmentNumber) {
        Employee minSalaryEmploee = new Employee("Такой-то Такой-то", departmentNumber,1_000_000 );

        for (Employee employee : employeesList) {
            if (employee.getSalary() < minSalaryEmploee.getSalary() && employee.getDepartment() == departmentNumber ) {
                minSalaryEmploee = employee;
            }

        }
        System.out.println("Сотрудник с минимальной ЗП в отделе №" + departmentNumber + " - " + minSalaryEmploee);
    }
    public  void maxSalaryEmployeeDepartment(int departmentNumber) {
        Employee maxSalaryEmploee = new Employee("Такой-то Такой-то", departmentNumber,0 );

        for (Employee employee : employeesList) {
            if (employee.getSalary() > maxSalaryEmploee.getSalary() && employee.getDepartment() == departmentNumber ) {
                maxSalaryEmploee = employee;
            }

        }
        System.out.println("Сотрудник с минимальной ЗП в отделе №" + departmentNumber + " - " + maxSalaryEmploee);
    }
    public  int allSalaryDepartment(int departmentNumber) {
        int total = 0;
        for (Employee employee : employeesList) {
            if (employee.getDepartment() == departmentNumber) {
                total = total + employee.getSalary();
            }
        }
        return total;
    }

    public  float averageSalaryDepartment(int departmentNumber) {
        float averageSalary;
        int counter = 0;
        int allSalary = 0;
        for (Employee employee : employeesList) {
            if (employee.getDepartment() == departmentNumber) {
                allSalary = allSalary + employee.getSalary();
                counter++;
            }
        }
        averageSalary = (float)(allSalary / counter);
        return averageSalary;
    }

    public  void salaryIndexation(int departmentNumber, float increasePercent ) {
        int newSalary;
        increasePercent = (increasePercent / 100 + 1);
        for (Employee employee : employeesList) {
            if (employee.getDepartment() == departmentNumber) {
                newSalary = (int) (employee.getSalary() * increasePercent);
                employee.setSalary(newSalary);
            }
        }
    }

    public  void printDepartmentEmployee(int departmentNumber) {
        for (Employee employee : employeesList) {
            if (employee.getDepartment() == departmentNumber) {
                System.out.println("ID:" + employee.getId() + "ФИО:" + employee.getFullName() + ", зарплата:" + employee.getSalary() );
            }
        }
    }

    public  void salaryLessLVL(int salaryLVL) {
        for (Employee employee : employeesList) {
            if (employee.getSalary() < salaryLVL) {
                System.out.println("ID:" + employee.getId() + "ФИО:" + employee.getFullName() + ", зарплата:" + employee.getSalary() );
            }
        }

    }
    public  void salaryMoreLVL(int salaryLVL) {
        for (Employee employee : employeesList) {
            if (employee.getSalary() >= salaryLVL) {
                System.out.println("ID:" + employee.getId() + "ФИО:" + employee.getFullName() + ", зарплата:" + employee.getSalary() );
            }
        }

    }

    public boolean addNewEmployee(Employee newEmployee) {
        for (int i = 0; i < employeesList.length; i++) {
            if (employeesList[i].getFullName() == null) {
                employeesList[i] = newEmployee;
                employeesList[i].setId(i+1);
                return true;
            }
        }
        return false;
    }

    public void deleteEmployee(int firedID) {
        for (int i = 0; i < employeesList.length; i++) {
            if (employeesList[i].getId() == firedID) {
                employeesList[i].setFullName(null);
                employeesList[i].setDepartment(0);
                employeesList[i].setSalary(0);

            }
        }
    }

    public void findEmployeeByID(int id) {
        for (Employee employee : employeesList) {
            if (employee.getId() == id) {
                System.out.println(employee);
            }
        }

    }
}
