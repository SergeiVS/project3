



import lesson24.pracsice.UserInput;

import java.util.HashMap;

public class CompanyPersonalService {
   lesson24.pracsice.UserInput ui = new UserInput();
   public void addEmployee(HashMap<Integer, Employee> employeesMap, Employee employee){
       employeesMap.put(employee.getPersonalCode(), employee);
   }

    public void addNewDepartment(Department department){

        HashMap<Integer, Employee> departmentEmployees = new HashMap<>();
        department.setEmployees(departmentEmployees);

    }
    public void addEmployeeToDepartment(Department department, Employee employee){
       addEmployee(department.getEmployees(), employee);
    }

    public void addDepartmentToMap(HashMap<String, Department> departmentsMap, Department department){
       departmentsMap.put(department.getDepartmentName(), department);
    }

}
