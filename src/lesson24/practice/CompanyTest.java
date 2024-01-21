import java.util.HashMap;

public class CompanyTest {
    public static void main(String[] args) {
        CompanyPersonalService personalService = new CompanyPersonalService();

        HashMap<Integer,Employee> employeeMap = new HashMap<>();

        Employee employee1 = new Employee("John","Smith", 15);
        Employee employee2 = new Employee("Ivan", "Pomidorov", 77);
        Employee employee3 = new Employee("Anna", "Schmidt", 28);
        Employee employee4 = new Employee("Sam","Brown", 35);

        personalService.addEmployee(employeeMap, employee1);
        personalService.addEmployee(employeeMap, employee2);
        personalService.addEmployee(employeeMap, employee3);
        personalService.addEmployee(employeeMap, employee4);

        System.out.println(employeeMap);

        HashMap<String, Department> departmentMap = new HashMap<>();

        Department department1 = new Department("HR");
        personalService.addNewDepartment(department1);

        Department department2 = new Department("Marketing");
        personalService.addNewDepartment(department2);

        personalService.addEmployeeToDepartment(department1, employee1);
        personalService.addEmployeeToDepartment(department1, employee2);

        personalService.addEmployeeToDepartment(department2, employee3);
        personalService.addEmployeeToDepartment(department2, employee4);

        personalService.addDepartmentToMap(departmentMap, department1);
        personalService.addDepartmentToMap(departmentMap, department2);

        System.out.println(departmentMap);

        System.out.println(departmentMap.get("HR"));

        System.out.println(departmentMap.get("Marketing").getEmployees());

    }
}
