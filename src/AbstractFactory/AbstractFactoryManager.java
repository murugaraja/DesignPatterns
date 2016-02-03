package AbstractFactory;

public class AbstractFactoryManager {

	public BirdType getBird(String str) {
		
		if (str.equals("Small")) {
			return new Small();
			
		} else {
			return new Big();
		}
	}
}
