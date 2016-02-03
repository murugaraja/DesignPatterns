package employeeFactory;

public class WorkerFactory implements DepartmentFactory{

	public Employee getEmployee(String str){
		
		if(str.equals("HardwareEngineer")){
			return new HardwareEngineer();
		} else{
			return new SoftwareEngineer();
		}
	}
}
