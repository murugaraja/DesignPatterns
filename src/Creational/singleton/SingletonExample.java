package Creational.singleton;

public class SingletonExample {
	private static SingletonExample singletonExample = null;
	private int number = 0;
	
	private SingletonExample() {
	}

	public static SingletonExample getInstance() {
		if (singletonExample == null) {
			singletonExample = new SingletonExample();
		}
		return singletonExample;
	}

	public void display() {
		System.out.println("number is "+number++);
	}
}