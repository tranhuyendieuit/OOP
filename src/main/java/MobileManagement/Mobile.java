package MobileManagement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Mobile {

	private String name;

	private String brand;

	private Date debutDay;

	private int quantity;

	private int price;

	private Screen screen;

	private String version;

	public Mobile() {
	}

	public Mobile(String name, String brand, Date debutDay, int quantity, int price, Screen screen) {
		this.name = name;
		this.brand = brand;
		this.debutDay = debutDay;
		this.quantity = quantity;
		this.price = price;
		this.screen = screen;
	}

	public abstract String sayHello();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getDebutDay() {
		return debutDay;
	}

	public void setDebutDay(Date debutDay) {
		this.debutDay = debutDay;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDebutDayString() {
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
		String str = format.format(debutDay);

		return str;
	}

	public void input() {
		System.out.println("Enter information's mobile: ");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter phone's name: ");
		name = input.nextLine();

		System.out.println("Enter phone's brand: ");
		brand = input.nextLine();

		System.out.println("Enter debut day:  ");
		debutDay = new Date();

		System.out.println("Enter quantity: ");
		quantity = Integer.parseInt(input.nextLine());

		System.out.println("Enter price: ");
		price = Integer.parseInt(input.nextLine());

	}
}
