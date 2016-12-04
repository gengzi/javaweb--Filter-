package demo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Non_SmartPhone nPhone = new Non_SmartPhone();
		nPhone.action();
		Phone sPhone = new SmartPhone(nPhone);
		sPhone.action();

	}

}
