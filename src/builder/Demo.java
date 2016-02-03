package builder;

public class Demo {

	public static void main(String[] args) {
		
		BuildManager buildManager = new BuildManager();
				
		Process process1 = new WebProject();
		buildManager.init(process1);
		buildManager.test();
		
		
		Process process2 = new WindowProject();
		buildManager.init(process2);
		buildManager.test();
		
		
	}
}