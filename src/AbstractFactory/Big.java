package AbstractFactory;

public class Big implements BirdType {

	public Bird getBirdType(String str) {
		if (str.equals("Eagle")) {
			return new Eagle();
		} else {
			return new Peacock();
		}
	}
}
