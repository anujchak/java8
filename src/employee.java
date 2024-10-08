import java.util.Objects;

public class employee {
    int roll;
    String name;
    String department;
    int salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employee employee = (employee) o;
        return roll == employee.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll);
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "employee{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public employee(int roll, String name, String department, int salary) {
        this.roll = roll;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
