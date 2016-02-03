package employeeFactory;

public class EmployeeFactory {

	public DepartmentFactory getDepartment(String str) {
		
		if(str.equals("Worker")){
			return new WorkerFactory();
		} else {
			return new LaborFactory();
		}
	}
}