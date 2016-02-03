package AbstractFactory;

public class Small implements BirdType{
	
	public Bird getBirdType(String str) {
		
		if(str.equals("Sparrow")){
			return new Sparrow();
		}else {
			return new Parrot();
		}
	}
}