package Creational.AbstractFactory;

import Creational.AbstractFactory.animals.Animal;
import Creational.AbstractFactory.animals.Cat;
import Creational.AbstractFactory.animals.Dog;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}
}