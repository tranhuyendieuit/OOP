package MobileManagement;

import java.util.Scanner;

public class Iphone extends Mobible {

	String versionIOS;

	public Iphone(String versionIOS) {
		this.versionIOS = versionIOS;
	}

	public Iphone() {
	
	}

	public String getVersionIOS() {
		return versionIOS;
	}

	public void setVersionIOS(String versionIOS) {
		this.versionIOS = versionIOS;
	}
	
	public void intput() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter versionIOS: ");
		versionIOS = input.nextLine();
	}

	@Override
	public String toString() {
		return "Iphone [versionIOS=" + versionIOS + ", name=" + name + ", brand=" + brand + ", debutDay=" + getDebutDayString()
				+ ", quantity=" + quantity + ", price=" + price + ", screen=" + screen + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	
}
