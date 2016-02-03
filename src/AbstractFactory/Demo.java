package AbstractFactory;

public class Demo {

	public static void main(String args[]) {
		AbstractFactoryManager factoryManager = new AbstractFactoryManager();
		BirdType birdType = factoryManager.getBird("Small");
		Bird b = birdType.getBirdType("Sparrow");
		System.out.println(b.getName());
	}
}
