package Creational.cdp.factoryMethod;

interface Product {
}

abstract class Creator {
	public void anOperation() {
		@SuppressWarnings("unused")
		Product product = factoryMethod();
	}

	protected abstract Product factoryMethod();
}

class ConcreteProduct implements Product {
	
}

class ConcreteCreator extends Creator {
	protected Product factoryMethod() {
		return new ConcreteProduct();
	}
}

public class FactoryMethod {
	public static void main(String arg[]) {
		Creator creator = new ConcreteCreator();
		creator.anOperation();
	}
}