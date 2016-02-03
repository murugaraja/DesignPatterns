package factory;

public class Demo {

	public static void main(String art[]){
		FactoryCls cls = new FactoryCls();

		Animal dog = cls.getAnimal("Dog");
		System.out.println(dog.doEat());
		
		Animal cat = cls.getAnimal("Cat");
		System.out.println(cat.doEat());
	}
}
