package Creational.cdp.singleton;

class Singleton {

	private static Singleton instance = null;

	private Singleton() {	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}

public class SingletonTest {

	public static void main(String[] args) {
		Singleton.getInstance();
	}

}