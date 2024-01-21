



import java.util.HashMap;

public class Department{
    private String departmentName;
    private HashMap<Integer, Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setEmployees(HashMap<Integer, Employee> employees) {
        this.employees = employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public HashMap<Integer, Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
