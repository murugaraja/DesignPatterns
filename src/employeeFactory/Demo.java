package employeeFactory;

public class Demo {
	public static void main(String[] args) {
		
		EmployeeFactory employeeFactory = new EmployeeFactory(); 
		DepartmentFactory departmentFactory = employeeFactory.getDepartment("s");
		Employee employee = departmentFactory.getEmployee("Swee");
		System.out.println(employee.getAddress());
		System.out.println(employee.getName());
	}
}