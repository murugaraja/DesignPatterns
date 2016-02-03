package Creational.singleton;

public class Demo {

	public static void main(String[] args) {
		SingletonExample example = SingletonExample.getInstance();
		example.display();
		SingletonExample example1 = SingletonExample.getInstance();
		example1.display();
		SingletonExample example2 = SingletonExample.getInstance();
		example2.display();
	}
}
