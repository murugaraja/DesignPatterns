package employeeFactory;

public class LaborFactory implements DepartmentFactory{
	
	public Employee getEmployee(String str){
		
		if(str.equals("Keeper")){
			return new HardwareEngineer();
			
		} else{
			return new SoftwareEngineer();
		}
	}
}