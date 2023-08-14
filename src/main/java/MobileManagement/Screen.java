package MobileManagement;

import java.util.Scanner;

public class Screen {

	float size;
	String screenType;
	
	public Screen(float size, String screenType) {
		this.size = size;
		this.screenType = screenType;
	}

	public Screen() {
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size: ");
		size = Float.parseFloat(input.nextLine());
		
		System.out.println("Enter screen type: ");
		screenType = input.nextLine();
	}
	
	
	
}
