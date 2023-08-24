package MobileManagement;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Mobile mobile = new Mobile() {
			@Override
			public String sayHello() {
				return "Hello";
			}
		};

		Mobile androidFold = new AndroidFold();
		System.out.println(androidFold.sayHello());
//		androidFold.chillOut();

		Mobile android = new Android();
		System.out.println(android.sayHello());

		AndroidFold androidFold2 = new AndroidFold();
		System.out.println(androidFold2.sayHello());
		androidFold2.chillOut();
	}

}
