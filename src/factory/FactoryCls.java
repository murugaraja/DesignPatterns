package factory;

public class FactoryCls {
	public Animal getAnimal(String str){
		
		if (str.equals("Dog")) {
			return new Dog();
			
		} else if (str.equals("Cat")) {
			return new Cat();
			
		} else {
			return null;
		}
	}
}
