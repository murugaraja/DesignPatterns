package Creational.AbstractFactory;

import Creational.AbstractFactory.animals.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type);
}