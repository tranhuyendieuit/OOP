package MobileManagement;

import java.util.Scanner;

public class Iphone extends Mobile {

	public Iphone() {
	}

	@Override
	public String sayHello() {
		return "Iphone say hello";
	}


	@Override
	public String toString() {
		return "Iphone [versionIOS=" + getVersion() + ", name=" + getName() + ", brand=" + getBrand() + ", debutDay=" + getDebutDayString()
				+ ", quantity=" + getQuantity() + ", price=" + getPrice() + ", screen=" + getScreen() + "]";
	}

	public void display() {
		System.out.println(toString());
	}
	
	
}
