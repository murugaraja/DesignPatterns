package Creational.AbstractFactory;

import Creational.AbstractFactory.animals.Animal;
import Creational.AbstractFactory.animals.Snake;
import Creational.AbstractFactory.animals.Tyrannosaurus;

public class  ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("snake".equals(type)) {
			return new Snake();
		} else {
			return new Tyrannosaurus();
		}
	}
}
