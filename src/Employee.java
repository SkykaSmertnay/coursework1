import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;
    private static int nextId = 1;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = nextId++;

    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        /*if (department > 5 || department < 1) {
            throw new IllegalArgumentException ("Недопустимый номер отдела");
        } else*/
            this.department = department;

    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
     public void setId(int id) {
     this.id = id;
    }
    public String toString() {
        return "ID:" + this.id + " " +"ФИО:" + this.fullName + ", отдел №" + this.department + ", зарплата:" + this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary);
    }


}


